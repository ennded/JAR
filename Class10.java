public class Class10 {
    public static void method1() {
        System.out.println("Class10 - method1 executed");
    }

    public static void method2() {
        System.out.println("Class10 - method2 executed");
    }

    public static void method3() {
        System.out.println("Class10 - method3 executed");
    }

    public static void method4() {
        System.out.println("Class10 - method4 executed");
    }

    public static void method5() {
        System.out.println("Class10 - method5 executed");
    }

    public static void method6() {
        System.out.println("Class10 - method6 executed");
    }

    public static void method7() {
        System.out.println("Class10 - method7 executed");
    }

    public static void method8() {
        System.out.println("Class10 - method8 executed");
    }

    public static void method9() {
        System.out.println("Class10 - method9 executed");
    }

    public static void method10() {
        System.out.println("Class10 - method10 executed");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Class10 <methodName>");
            return;
        }

        String methodName = args[0];

        try {
            // Call the specified method
            Class10.class.getMethod(methodName).invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
