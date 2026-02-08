public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Original a: " + a);
        System.out.println("Unary +a: " + (+a));  // 10
        System.out.println("Unary -a: " + (-a));  // -10
        System.out.println("Pre-increment ++a: " + (++a));  // 12 (a=11 after)
        System.out.println("Post-increment a++: " + (a++)); // 11 (a=12 now)
        System.out.println("a now: " + a);
        System.out.println("Pre-decrement --a: " + (--a));  // 11 (a=11)
        System.out.println("Post-decrement a--: " + (a--)); // 11 (a=10)
    }
}
