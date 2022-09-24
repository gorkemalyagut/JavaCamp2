public class Main {
    public static void main(String[] args) {
        String msg = "Bugün hava çok güzel";
        String newMsg = city();
        System.out.println(newMsg);
        int number = sum(15, 7);
        System.out.println(number);
        int sum = sum2(2,3,4,5,6,10);
        System.out.println(sum);

    }

    public static void add() {
        System.out.println("added");

    }

    public static void delete() {
        System.out.println("deleted");
    }

    public static void update() {
        System.out.println("updated");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    ///... variable argument
    public static int sum2(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum+=num;
        }
        return sum;
    }

    public static String city() {
        return "Ankara";
    }
}