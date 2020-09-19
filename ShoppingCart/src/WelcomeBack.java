import java.util.*;
import java.io.*;
import java.lang.*;

public class WelcomeBack {

    public WelcomeBack(){

    }

    public String getMiddle(String str){
        int mid = 0;
        if (str.length() % 2 ==0){
            return str.substring(str.length()/2 -1, str.length()/2+1);
        }
        return str.substring(str.length()/2 -1, str.length()/2);
    }

    public int[] sumNumbers(int n){
        int[] sumDig = new int[n+1];
        for (int i = 0; i <= n; i ++){
            for (int g = 0; g <= i; g ++){
                sumDig[i] +=g;
            }
        }
        return sumDig;
    }

    public int sumDigits(int num){
        int x = 0;
        while (num > 0){
            x += num % 10;
            num /= 10;
        }
        return x;
    }

    public int keepSummingDigits(int num){
        int x = num;
        while (x > 9){
            x = sumDigits(x);
        }
        return x;
    }

    public String getIntersection(int[] a, int[] b){
        String fString = "";
        for (int i = 0; i< a.length; i ++){
            for (int g = 0; g < b.length; g ++){
                if (a[i] == b[g]){
                    fString += a[i];
                }
            }
        }
        return fString;
    }

    public Map<Integer, Integer> mapLengths(String[] words){
        HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
        for (int i = 0; i < words.length; i ++){
            int f = 1;
            for (int g = 0; g < words.length; g ++){
                if (i == words[g].length()){
                    x.put(i, f);
                    f ++;
                }
            }
        }
        return x;
    }

    //FINISH
    public int sumDigitsRecur(int num){
        int x = 0;
        return (num < 9) ?  (x += num%10):(sumDigitsRecur(num/10));
    }

    private int[] oppReturnDigits(int num){
        int x = num;
        int arSize = 0;
        while (x > 0){
            arSize++;
            x /= 10;
        }
        int[] finArray = new int[arSize];
        int i = 0;
        while (num > 0){
            finArray[i] = num%10;
            num /= 10;
            i ++;
        }
        return finArray;
    }

    //FINISH
    public int sumWithoutCarry(int a, int b){
        int fNum = 0;
        int[] aArray = oppReturnDigits(a);
        int[] bArray = oppReturnDigits(b);
        for (int i = 0; i < aArray.length; i ++){
            if (i > 0){
                fNum += (((aArray[i]) + (bArray[i]))%10)*Math.pow(10,i);
            }
            else {
                fNum += ((aArray[i] + bArray[i]) % 10);
            }
        }
        return fNum;
    }

    public int buySell(int[] stock){
        int fDiff = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < stock.length; i ++){
            if (stock[i] > max){
                max = stock[i];
                index = i;
            }
        }
        for (int i = 0; i < stock.length; i ++){
            if (stock[i] < max){
                if (i < index){
                    if (max - stock[i] > fDiff)
                    fDiff = max - stock[i];
                }
            }
        }
        return fDiff;
    }

    public void zeck(String fileName){
        try {
            Scanner myReader = new Scanner(new File(fileName));
            ArrayList<Integer> tempArray = new ArrayList<>();
            int lineCounter = 1;
            int totalLines= Integer.parseInt((myReader.nextLine())); //returns value at the line
            int lineVal = Integer.parseInt((myReader.nextLine()));
            ArrayList<Integer> fibs = fibGenerator(lineVal);
            for (int i = 0; i < lineVal; i ++){

            }
            //System.out.println(lineVal);
            for (int i = 1; i < totalLines; i ++){
                tempArray.clear();
                lineVal = Integer.parseInt((myReader.nextLine()));
                ArrayList<Integer> fibsx = fibGenerator(lineVal);
                //System.out.println(lineVal);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error present");
        }
    }

    public ArrayList<Integer> fibGenerator(int num){
        ArrayList<Integer> finArray = new ArrayList<>();
        finArray.add(0);
        finArray.add(1);
        int n = 0;
        for (int i = 2; n < num; i ++){
            n = finArray.get(i-2) + finArray.get(i-1);
            finArray.add(i, n);
        }
        return finArray;
    }



}

