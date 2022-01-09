public class santaSleighMakeover {

    public static int calculateAverage(int[] numArray) {
        
        int i = 0, sum = 0;

        while (i < numArray.length) {
            sum += numArray[i];
            i++;
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
        
        int result1 = 0, result2 = 0;

        if (calculateSD(runners) > calculateSD(holders)) {
            int runner = 0;
            for (int i : runners) {
                if (i > calculateAverage(runners)) {
                    runner = i;
                    break;
                }
            }
            for (int holder=holders.length-1; holder>=0; holder--) {
                if ((holder + runner) <= budget){
                    result1 = holder + runner;
                }            
            }
            
        } else {
            int holder = 0;
            for (int i : holders) {
                if (i > calculateAverage(holders)) {
                    holder = i;
                    break;
                }
            }
            for (int runner=runners.length-1; runner>=0; runner--) {
                if ((holder + runner) <= budget){
                    result2 = holder + runner;
                }            
            }           
        }
        if(result1 == 0 && result2 == 0){
            return -1;
        } else if (result1 > result2){
            return result1;
        } else {
            return result2;
        }
    }
    //Driver Code 
    public static void main(String[] args) {
          
        int[] runners = {60, 80, 100};
        int[] holders = {17, 19, 21};
        
    }
}
