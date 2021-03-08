import java.util.Scanner;

public class Preco {

    public static double valor(int pedido, int quantidade){
        double[] produtos = {4.00, 4.50, 5.00, 2.00, 1.50};
        return produtos[pedido - 1] * quantidade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o seu pedido");
        int pedido = scan.nextInt();
        System.out.println("digite a quantidade");
        int quantidade = scan.nextInt();

        double d = valor(pedido, quantidade);
        String s = String.valueOf(d);
        System.out.println("Seu total deu R$: " + s);

        scan.close();
    }
    
}