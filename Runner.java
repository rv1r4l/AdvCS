import java.util.*;
public class Runner {

    public static void main(String[] args){
        Stack<Integer> x = makeStack(new int[]{1,2,3,4,5,6,7,8});
        Stack<Integer> x1 = makeStack(new int[]{1,-2,-3,-4,5,-6,7,-8});
        StackProbs y = new StackProbs();
        System.out.println(y.doubleUp(x));
        System.out.println(y.posAndNeg(x1));
        //System.out.println(y.reverse(x1));
        System.out.println(y.shiftByN(makeStack(new int[]{1,-2,-3,-4,5,-6,7,-8}),2));
        System.out.println(y.reverseVowels("apples are green"));
        System.out.println(y.bracketBalance("([()[]()])()"));

    }

    public static Stack<Integer> makeStack(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums)
            stack.push(num);
        return stack;
    }

}
