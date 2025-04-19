package MORE_EXE;

import java.util.Scanner;

public class _5_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input;

        int bestSampleIndex = 0;
        int bestSum = 0;
        int bestLongestOnes = 0;
        int bestStartingIndex = Integer.MAX_VALUE;
        int[] bestSequence = new int[length];

        int sampleIndex = 0;

        while (!(input = scanner.nextLine()).equals("Clone them!")) {
            String[] split = input.split("!+");
            int[] sequence = new int[length];

            for (int i = 0; i < length; i++) {
                sequence[i] = Integer.parseInt(split[i]);
            }

            sampleIndex++;

            // Find longest sequence of 1s and its starting index
            int maxOnes = 0;
            int currentOnes = 0;
            int startIndex = 0;
            int currentStart = 0;

            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] == 1) {
                    currentOnes++;
                    if (currentOnes == 1) {
                        currentStart = i;
                    }
                    if (currentOnes > maxOnes) {
                        maxOnes = currentOnes;
                        startIndex = currentStart;
                    }
                } else {
                    currentOnes = 0;
                }
            }

            int sum = 0;
            for (int num : sequence) {
                sum += num;
            }

            // Selection logic
            boolean isBetter = false;

            if (maxOnes > bestLongestOnes) {
                isBetter = true;
            } else if (maxOnes == bestLongestOnes) {
                if (startIndex < bestStartingIndex) {
                    isBetter = true;
                } else if (startIndex == bestStartingIndex) {
                    if (sum > bestSum) {
                        isBetter = true;
                    }
                }
            }

            if (isBetter) {
                bestLongestOnes = maxOnes;
                bestStartingIndex = startIndex;
                bestSum = sum;
                bestSampleIndex = sampleIndex;
                bestSequence = sequence.clone();
            }
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleIndex, bestSum);
        for (int i = 0; i < bestSequence.length; i++) {
            System.out.print(bestSequence[i]);
            if (i != bestSequence.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
