public class Banco {
    DAO dao = new DAO();
    public void iniciar () {
    int opcao = 0;
    while (opcao != 7) {
        UI.menuPrincipal();
        switch (UI.coletarOpcao()) {
            case 1:
            dao.cadastrarClienteDAO(UI.cadastrarClienteUI());
            
            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
        }
    }
}
}