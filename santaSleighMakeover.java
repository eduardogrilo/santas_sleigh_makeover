public class santaSleighMakeover {

    public int calculateAverage(int[] numArray) {

        int i = 0, sum = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return (sum / numArray.length);
    }

    public int getTotalSpent(int[] runners, int[] holders, int budget) {

        int result1 = 0, result2 = 0, runner = 0;
        for (int i : runners) {
            if (i >= calculateAverage(runners)) {
                runner = i;
                break;
            }
        }
        for (int i = holders.length - 1; i >= 0; i--) {
            if ((holders[i] + runner) <= budget) {
                result1 = holders[i] + runner;
                break;
            }
        }

        int holder = 0;
        for (int i : holders) {
            if (i >= calculateAverage(holders)) {
                holder = i;
                break;
            }
        }
        for (int i = runners.length - 1; i >= 0; i--) {
            if ((runners[i] + holder) <= budget) {
                result2 = runners[i] + holder;
                break;
            }
        }

        if (result2 == 0 && result1 == 0) {
            return -1;
        } else if (result2 >= result1) {
            return result2;
        } else {
            return result1;
        }
    }

    // Driver Code
    public static void main(String[] args) {

        int[] runners = { 50, 70, 100, 989, 4000};
        int[] holders = { 5, 56, 250, 560, 400};
        int budget = 350;
        santaSleighMakeover myObject  = new santaSleighMakeover();
        System.out.println("Total: "+ myObject .getTotalSpent(runners, holders, budget));

    }
}
