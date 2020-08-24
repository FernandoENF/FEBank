import java.util.Scanner;

public class UI {
    public static void menuPrincipal() {
        System.out.println("Menu Principal");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Abrir conta");
        System.out.println("4. Efetuar depósito");
        System.out.println("5. Efetuar saque");
        System.out.println("6. Relatório de contas");
        System.out.println("7. Finalizar o programa");
    }
    
    public static void cadastrarClienteUI() {
        System.out.println("Qual o nome do cliente?");
        System.out.println("Qual o email do cliente?");
        System.out.println("Qual o telefone do cliente?");
        System.out.println("Qual o código do cliente?");
    }

    public static Integer coletarOpcao() {
        Scanner scan = new Scanner(System.in);
        String opcao = scan.nextLine();
        scan.close();
        return Integer.valueOf(opcao);
    }

    public static String coletarTexto() {
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        scan.close();
        return texto;
    }
}