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
    
    public static Cliente cadastrarClienteUI() {
        System.out.println("Qual o nome do cliente?");
        String nometemp = UI.coletarTexto();
        System.out.println("Qual o email do cliente?");
        String emailtemp = UI.coletarTexto();
        System.out.println("Qual o telefone do cliente?");
        String telefonetemp = UI.coletarTexto();
        System.out.println("Qual o código do cliente?");
        String codigotemp = UI.coletarTexto();
        
        return new Cliente(nometemp,emailtemp,telefonetemp,codigotemp);
    }

    public static Integer coletarOpcao() {
        Scanner scan = new Scanner(System.in);
        String opcao = scan.nextLine();
        scan.close(); /* Tenho que dar um jeito de fechar esses scanners sem bugar o código,
        infelizmente dá erro de resource leak quando tiro essa linha */
        return Integer.valueOf(opcao);
    }

    public static String coletarTexto() {
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        scan.close();
        return texto;
    }
}