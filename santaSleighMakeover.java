public class santaSleighMakeover {

    public static int calculateAverage(int[] numArray) {
        
        int index = 0, sum = 0;

        while (index < numArray.length) {
            sum += numArray[index];
            index++;
        }
         
        return (sum / numArray.length);
    }

    public static double calculateSD(int[] numArray) {
        
        float sum = 0, standardDeviation = 0;

        for (float num : numArray){
            sum += num;
        }

        for (float num: numArray){
            standardDeviation += Math.pow(num - sum/numArray.length, 2);
        }

        return Math.sqrt(standardDeviation/numArray.length);
    }

    public int getTotalSpent(int[] runners, int[] holders, int budget) {
        
        if (calculateSD(runners) > calculateSD(holders)) {
            for (int runner : runners) {
                if (runner > calculateAverage(runners)) {
                    break;
                }
            }
            
        } else {
            for (int holder : holders) {
                if (holder > calculateAverage(holders)) {
                    break;
                }
            }
            
        }
        return -1;
    }
    //Driver Code 
    public static void main(String[] args) {
          
        int[] runners = {60, 80, 100};
        int[] holders = {17, 19, 21};
        System.out.println(calculateAverage(runners));
        System.out.println(calculateAverage(holders));
        System.out.println(calculateSD(runners));
        System.out.println(calculateSD(holders));

    }
}
