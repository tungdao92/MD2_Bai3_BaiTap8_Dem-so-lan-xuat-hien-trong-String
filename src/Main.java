import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì: ");
        String a = sc.nextLine();
        System.out.println("Nhập 1 ký tự bất kì để duyệt: ");
        char b = sc.next().charAt(0);;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) ==b){
                count++;

            }
            
        }
        System.out.println(count);

    }
}
