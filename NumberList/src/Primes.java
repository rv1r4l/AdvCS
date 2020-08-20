import java.util.ArrayList;
import java.util.List;

public class Primes{

    public static void main(String[] args) {

        int givenNum = 1000000;

        int maxPrime = getMaxPrime(getPrimesBelowGiven(givenNum), givenNum);

        System.out.println(maxPrime);

    }

    private static Integer getMaxPrime(NumberList primes, int max) {
        int sumOfPrime = 0;
        NumberList sumOfPrimeList = new NumberList();
        for (int i = 0; i < primes.size(); i ++) {
            sumOfPrime += primes.get(i);
            if(isPrime(sumOfPrime) ) {
                if(sumOfPrime >= max) {
                    break;
                }
                sumOfPrimeList.add(sumOfPrime);

            }
        }

        int listSize = sumOfPrimeList.size();
        int maxPrime = sumOfPrimeList.get(listSize - 1);

        return maxPrime;
    }

    private static NumberList getPrimesBelowGiven(int maxNum) {
        NumberList primes = new NumberList();

        for (int i = 0; i < maxNum; i++) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean isPrime(int n) {
        int m=n/2;
        if(n==0||n==1){
            return false;
        } else {
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    return false;
                }
            }
        }

        return true;

    }
    public static int finalTest(int endNum){
        return getMaxPrime(getPrimesBelowGiven(endNum), endNum);
    }
}



