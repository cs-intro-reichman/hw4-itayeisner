public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int last = Integer.parseInt(args[0]);
        boolean[] nums = new boolean[last+1];
        for(int i=2;i<nums.length;i++) nums[i]=true;
        int p =2;
        while(p<=Math.sqrt(last)){
            if(nums[p]==true){
                for(int i=2;p*i<=last;i++){
                    nums[p*i]=false;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to "+last+":");
        int counter = 0;
        for(int i=2;i<=last;i++){
            if(nums[i]==true){
                System.out.println(i);
                counter++;}
            }
            int per = (int)(counter*100.0/last);
            System.out.println("There are " + counter + " primes between 2 and " +last + " (" +per+"% are primes)");

        }


    }
