public class santaSleighMakeover {

    public int calculateAverage(int[] numArray) {
        
        int i = 0, sum = 0;

        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
         
        return (sum / numArray.length);
    }

    public double calculateSD(int[] numArray) {
        
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
                if (i >= calculateAverage(runners)) {
                    runner = i;
                    break;
                }
            }
            for (int i=holders.length-1; i>=0; i--) {
                if ((holders[i] + runner) <= budget){
                    result1 = holders[i] + runner;
                    break;
                }            
            }
            
        } else {
            int holder = 0;
            for (int i : holders) {
                if (i >= calculateAverage(holders)) {
                    holder = i;
                    break;
                }
            }
            for (int i=runners.length-1; i>=0; i--) {
                if ((runners[i] + holder) <= budget){
                    result2 = runners[i] + holder;
                    break;
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
        int budget = 100;
        santaSleighMakeover sl = new santaSleighMakeover();
        sl.getTotalSpent(runners, holders, budget);
        
    }
}
