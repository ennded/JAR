public class Class9 {
    public static void method1() {
        System.out.println("Class9 - method1 executed");
    }

    public static void method2() {
        System.out.println("Class9 - method2 executed");
    }

    public static void method3() {
        System.out.println("Class9 - method3 executed");
    }

    public static void method4() {
        System.out.println("Class9 - method4 executed");
    }

    public static void method5() {
        System.out.println("Class9 - method5 executed");
    }

    public static void method6() {
        System.out.println("Class9 - method6 executed");
    }

    public static void method7() {
        System.out.println("Class9 - method7 executed");
    }

    public static void method8() {
        System.out.println("Class9 - method8 executed");
    }

    public static void method9() {
        System.out.println("Class9 - method9 executed");
    }

    public static void method10() {
        System.out.println("Class9 - method10 executed");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Class9 <methodName>");
            return;
        }

        String methodName = args[0];

        try {
            // Call the specified method
            Class9.class.getMethod(methodName).invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
