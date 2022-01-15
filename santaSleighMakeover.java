public class santaSleighMakeover {

    public int calculateAverage(int[] numArray) {

        int i = 0, sum = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum / numArray.length;
    }

    public int getTotalSpent(int[] runners, int[] holders, int budget) {

        int result1 = 0, runner = 0, holder = 0, runnersLengh = runners.length;
        while (result1 == 0) {
            for (int i = runnersLengh - 1; i >= 0; i--) {
                if (runners[i] >= budget) {
                    result1 = 0;
                    break;
                }

                for (int j : holders) {
                    if (holders[j] >= calculateAverage(holders)) {
                        holder = holders[j];
                        break;
                    }
                }

                for (int k : holders) {
                    if ((holders[k] + runner) <= budget) {
                        result1 = holders[k] + runner;
                        break;
                    }
                }
            }
            runnersLengh--;
        }

        return -1;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] runners = { 50, 70, 100, 989, 4000 };
        int[] holders = { 5, 56, 250, 560, 400 };
        int budget = 350;
        santaSleighMakeover myObject = new santaSleighMakeover();
        System.out.println("Total: " + myObject.getTotalSpent(runners, holders, budget));

    }
}
