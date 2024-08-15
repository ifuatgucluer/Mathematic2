import java.util.Scanner;


public class SesliHarf {


    public static void main(String[] args) {
        System.out.println("Bir kelime giriniz");
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.next();
        for(char character : userData.toCharArray()) {
            if(sesliMi(character)) {
                System.out.println(character);
                // İşlem burada gerçekleştirilecek
            }
        }
        System.out.println("======");
        for(char character : userData.toCharArray()) {
            if(sesliMi(character)) {
                continue;
            }
            System.out.println(character);
        }
    }

    public static boolean sesliMi(char ch) {
        char[] sesliler = {'a', 'e', 'i', 'o', 'u'};
        for(char c : sesliler) {
            if(ch == c) return true;
        }
        return false;
    }

}
