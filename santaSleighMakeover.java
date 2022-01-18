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
            for (int i0 = runnersLengh - 1; i0 >= 0; i0--) {
                if (runners[i0] <= budget) { // Check if the budget is enough
                    if (runners[i0] >= calculateAverage(runners)){ // Check if the average value is higher than the budget
                        runner = runners[i0];
                    } else {
                        for (int i1 = 0; i1 >= 0; i1++) {
                            if (runners[i1] > calculateAverage(runners)) {
                                runner = runners[i1];
                            }
                        }
                    }

                }
                result1 = 0;

            }
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
