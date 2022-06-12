package hellojpa;

public class ValueMain {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        boolean result = (a == b);

        System.out.println("=============================");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("=============================");
        System.out.println("result = " + result);
        System.out.println("=============================");

        Address address1 =  new Address("city", "street", "10000");
        Address address2 =  new Address("city", "street", "10000");

        System.out.println("=============================");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
        System.out.println("=============================");
        System.out.println("(address1 == address2) = " + (address1 == address2));
        System.out.println("address1.equals(address2) = " + (address1.equals(address2)));
        System.out.println("=============================");

    }

}
