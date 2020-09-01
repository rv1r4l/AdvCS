import java.util.*;
public class Runner {
    public static void main(String[] args){
        WelcomeBack x = new WelcomeBack();
        System.out.println(Arrays.toString(x.sumNumbers(5)));
        System.out.println(x.sumDigits(234));
        System.out.println(x.keepSummingDigits(29));
        System.out.println(x.mapLengths(new String[] {"a", "b", "hello", "hi", "yo", "I"}));
        System.out.println(x.buySell(new int[] {3, 4, 3, 2, 1, 5}));
        System.out.println(x.buySell(new int[] {5, 4, 3, 2, 1, 1}));
        System.out.println(x.sumDigitsRecur(234));
        System.out.println(x.sumWithoutCarry(861, 450));
        System.out.println(x.fibGenerator(12000));
    }
}
