public class Main {
    public static void main(String[] args) {
        Person jane = new Person("Jane", 50);
        System.out.println("----------");
        Person john = new Person("John", 120);

        System.out.println("******************");

        Calculator calc = new Calculator();
        System.out.println(calc.factorial(5));
        System.out.println("-----------");
        System.out.println(calc.factorial(0));
        System.out.println("------------");
        System.out.println(calc.binomialCoefficient(-10,5));
    }
}
