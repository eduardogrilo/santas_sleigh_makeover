public class santaSleighMakeover {

    public int getTotalSpent(int[] runners, int[] holders, int budget) {

        int max_sum = 0;
        for (int index_holders : holders) {
            for (int index_runners : runners) {
                if (index_holders + index_runners <= budget && index_holders + index_runners > max_sum) {
                    max_sum = index_holders + index_runners;
                }
            }
        }

        if (max_sum == 0) {
            return -1;
        }
        return max_sum;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] runners = { 50, 70, 100, 989, 4000 };
        int[] holders = { 5, 56, 250, 400, 560 };
        // int[] runners = { 60, 80, 100 };
        // int[] holders = { 17, 19, 21 };
        int budget = 700;
        santaSleighMakeover myObject = new santaSleighMakeover();
        System.out.println("Total: " + myObject.getTotalSpent(runners, holders, budget));
    }
}
