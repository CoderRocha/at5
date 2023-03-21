import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num >= 0) {
            int dobro = num * 2;
            System.out.println("O dobro de " + num + " é: " + dobro);
        } else {
            int triplo = num * 3;
            System.out.println("O triplo de " + num + " é: " + triplo);
        }
    }
}