package sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char)intValue;
        System.out.println("charValue = " + charValue);

        long longValue = 500;
        intValue = (int)longValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = 3.14;
        intValue = (int)doubleValue; // 소수점 날아가고 3
        System.out.println("doubleValue = " + doubleValue);
    }
}
