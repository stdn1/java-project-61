package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final int MAX_START_VALUE = 10;
    private static final String HIDDEN_ELEMENT_PLACEHOLDER = "..";

    public static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int progressionLength = Utils.getRandomInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int step = Utils.getRandomInt(MIN_STEP, MAX_STEP);
            int start = Utils.getRandomInt(0, MAX_START_VALUE);


            int[] progression = generateProgression(progressionLength, start, step);


            int hiddenIndex = Utils.getRandomInt(0, progressionLength - 1);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = -1;


            StringBuilder question = new StringBuilder();
            for (int value : progression) {
                if (value == -1) {
                    question.append(HIDDEN_ELEMENT_PLACEHOLDER).append(" ");
                } else {
                    question.append(value).append(" ");
                }
            }

            roundsData[i][0] = question.toString().trim();
            roundsData[i][1] = String.valueOf(hiddenValue);
        }

        return roundsData;
    }


    private static int[] generateProgression(int length, int start, int step) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    public static void startGame() {
        String gameDescription = "What number is missing in the progression?";
        String[][] roundsData = generateRoundsData();
        Engine.runGame(roundsData, gameDescription);
    }
}
