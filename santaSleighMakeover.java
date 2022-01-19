public class santaSleighMakeover {

    public int getTotalSpent(int[] runners, int[] holders, int budget) {

        int max_sum = 0;
        for (int index_holder : holders) {
            for (int index_runners : runners) {
                if (((index_holder + index_runners) <= budget) && (index_holder + index_runners) > max_sum) {
                    max_sum = (index_holder + index_runners);
                }
            }
        }

        if (max_sum > 0) {
            return max_sum;
        }
        return -1;
    }

    // Driver Code
    public static void main(String[] args) {

        // int[] runners = { 50, 70, 100, 989, 4000 };
        // int[] holders = { 5, 56, 250, 560, 400 };
        int[] runners = { 50, 70, 100, 989, 4000 };
        int[] holders = { 5, 56, 250, 560, 400 };
        int budget = 350;
        santaSleighMakeover myObject = new santaSleighMakeover();
        System.out.println("Total: " + myObject.getTotalSpent(runners, holders, budget));
    }
}
