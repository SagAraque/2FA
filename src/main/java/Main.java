import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Auth auth = new Auth(true);
        auth.generateQR("sagaraque@gmail.com", "Key Vault","qr.png");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Indique el código");
            String userCode = scanner.nextLine();
            System.out.println(auth.validate(userCode) ? "Código correcto\n" : "Código incorrecto\n");
        }
    }
}
