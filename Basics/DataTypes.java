class DataTypes {
    public static void main(String[] args) {

        // Primitive data types
        byte b = 100;              // 1 byte
        short s = 32000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes

        float f = 10.5f;           // 4 bytes
        double d = 99.99;          // 8 bytes

        char c = 'A';              // 2 bytes
        boolean isJavaFun = true;  

        // Printing values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);

        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);

        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + isJavaFun);


        // =============================
        // Wrapper Classes
        // =============================
      
        Byte wb = b;
        Short ws = s;
        Integer wi = i;
        Long wl = l;

        Float wf = f;
        Double wd = d;

        Character wc = c;
        Boolean wBool = isJavaFun;

        System.out.println("\nWrapper Classes:");
        System.out.println("Byte: " + wb);
        System.out.println("Short: " + ws);
        System.out.println("Integer: " + wi);
        System.out.println("Long: " + wl);
        System.out.println("Float: " + wf);
        System.out.println("Double: " + wd);
        System.out.println("Character: " + wc);
        System.out.println("Boolean: " + wBool);
    }
}
