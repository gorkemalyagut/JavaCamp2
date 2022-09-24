public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int search = 6;
        boolean flag = false;

        for (int number : numbers){
            if(number == search){
                flag = true;
                break;
            }
        }
        if(flag){
            mesajVer("Sayı mevcuttur " + search);
        } else {
            mesajVer("Sayı mevcuttur değildir " + search);
        }

    }
    public static void mesajVer(String msg){
        System.out.println(msg);
    }
}