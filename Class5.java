public class Class5 {
    public static void method1() {
        System.out.println("Class5 - method1 executed");
    }

    public static void method2() {
        System.out.println("Class5 - method2 executed");
    }

    public static void method3() {
        System.out.println("Class5 - method3 executed");
    }

    public static void method4() {
        System.out.println("Class5 - method4 executed");
    }

    public static void method5() {
        System.out.println("Class5 - method5 executed");
    }

    public static void method6() {
        System.out.println("Class5 - method6 executed");
    }

    public static void method7() {
        System.out.println("Class5 - method7 executed");
    }

    public static void method8() {
        System.out.println("Class5 - method8 executed");
    }

    public static void method9() {
        System.out.println("Class5 - method9 executed");
    }

    public static void method10() {
        System.out.println("Class5 - method10 executed");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Class5 <methodName>");
            return;
        }

        String methodName = args[0];

        try {
            // Call the specified method
            Class5.class.getMethod(methodName).invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
