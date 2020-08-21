public class Perfect {
    public static NumberList perfectNumbers(){
        NumberList finalVal = new NumberList();
        for (int i = 11; i < 28123; i ++){
            int allAdd = 0;
            NumberList factorStore = new NumberList();
            for (int g = 1; g < i; g ++){
                if (i%g == 0){
                    factorStore.add(g);
                }
            }
            for(int x = 0; x < factorStore.size(); x++){
                allAdd += factorStore.get(x);
            }
            if (allAdd > i){
                finalVal.add(i);
            }
        }
        return finalVal;
    }

    public static int valSum(NumberList x){
        NumberList allCombination = new NumberList();
        NumberList addList = new NumberList();
        int finalSum = 0;
        int nonSums = 0;
        for (int i = 0; i < x.size(); i ++){
            for(int g = 0; g < x.size(); g ++){
                allCombination.add(x.get(i)+x.get(g));
            }
        }
        for (int s = 0; s < 28123; s ++){
            for (int j = 0; j < allCombination.size(); j ++){
                if(s == allCombination.get(j)){
                    s +=1;
                    j = 0;
                }
                else if (j == allCombination.get(s)){
                    addList.add(s);
                }
            }
        }
        for (int k = 0; k < addList.size(); k ++){
            finalSum += addList.get(k);
        }
        return finalSum;
    }
}
