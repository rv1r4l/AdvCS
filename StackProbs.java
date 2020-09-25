import java.util.*;
public class StackProbs {

    public Stack<Integer> doubleUp(Stack<Integer> nums){
        Stack<Integer> finStack = new Stack<Integer>();
        Stack<Integer> binStack = new Stack<Integer>();
        int size = nums.size();
        for (int i = size; i>0; i --){
            binStack.push(nums.pop());
        }
        for (int i = 0; i < (size*2);i+=2){
            int val = binStack.pop();
            finStack.push(val);
            finStack.push(val);
        }
        return finStack;
    }

    public Stack<Integer> posAndNeg(Stack<Integer> nums){
        Stack<Integer> finStack = new Stack<>();
        Stack<Integer> positive = new Stack<>();
        Stack<Integer> negative = new Stack<>();
        int size = nums.size();
        for (int i = 0; i < size; i ++){
            if (nums.peek() > -1){
                positive.push(nums.pop());
            }
            else{
                negative.push(nums.pop());
            }
        }
        int posSize = positive.size();
        int negSize = negative.size();
        for (int i = 0; i < posSize; i ++){
            finStack.push(positive.pop());
        }
        for (int i = 0; i < negSize; i ++){
            finStack.push(negative.pop());
        }
        return finStack;
    }

    public Stack<Integer> shiftByN(Stack<Integer> nums, int n){
        int x = 0;
        int size = nums.size();
        Stack<Integer> revrevStack = new Stack<>();
        Stack<Integer> revStack = nums;
        while (x != n){
            if (x == 0){revStack = reverse(nums);}
            else{revStack = reverse(revrevStack);}
            int pop = revStack.pop();
            revrevStack = reverse(revStack);
            revrevStack.push(pop);
            x++;
        }
        return revrevStack;
    }

    private Stack<Integer> reverse(Stack<Integer> nums){
        Stack<Integer> finStack = new Stack<>();
        int size = nums.size();
        for (int i = 0; i < size; i ++){
            int num = nums.pop();
            finStack.push(num);
        }
        return finStack;
    }

    private Stack<String> reverseStr(Stack<String> str){
        Stack<String> finStack = new Stack<>();
        int size = str.size();
        for (int i = 0; i < size; i ++){
            String x = str.pop();
            finStack.push(x);
        }
        return finStack;
    }

    public String reverseVowels(String str){
        Stack<String> vowels = new Stack<>();
        Stack<Integer> indexes = new Stack<>();
        Stack<String> word = new Stack<>();
        String finWord = "";
        for (int i = str.length()-1; i > -1; i--){
             word.push(str.substring(i,i+1));
        }
        for (int i =0; i < str.length(); i++){
            String testStr = word.pop();
            if (testStr.equals("a") || testStr.equals("e") || testStr.equals("i") || testStr.equals("o") || testStr.equals("u")){
                vowels.push(testStr);
                indexes.push(i);
            }
        }
        Stack<Integer> revx = reverse(indexes);
        for (int i = 0; i < str.length(); i ++){
            if ((!revx.empty()) && revx.peek() == i){
                finWord += vowels.pop();
                revx.pop();
            }
            else{
                finWord += str.substring(i, i+1);
            }
        }
        return finWord;
    }

    public boolean bracketBalance(String s){
        Stack<String> word = new Stack<>();
        Stack<String> open = new Stack<>();
        Stack<String> close = new Stack<>();
        for (int i = s.length()-1; i > -1; i--){
            word.push(s.substring(i,i+1));
        }
        for (int i = 0; i < s.length(); i ++){
            String str = word.peek();
            if (str.equals("(") || str.equals("[")){
                open.push(str);
                word.pop();
            }
            else{
                close.push(str);
                word.pop();
            }
        }
        word = reverseStr(word);
        for (int i = 0; i < s.length()/2; i++){
            String str = open.pop();
            if (str.equals("(")){
                if (!(close.pop().equals(")"))){
                    return false;
                }
            }
            if (str.equals("[")){
                if (!(close.pop().equals("]"))){
                    return false;
                }
            }
        }
        return true;
    }
}
