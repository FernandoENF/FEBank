public class Database {
    private Conta[] contas = new Conta[100];
    private Cliente[] clientes = new Cliente[100];

    public void adicionar(Cliente umCliente) {
    if (lastIndexClient() != 100) {
        clientes[lastIndexClient()] = umCliente;
        }
    }
    public void adicionar(Conta umaConta) {

    }
    public int lastIndexClient() {
        for (int i = 0; i<100; i++) {
            if(this.clientes[i] == null) {
                return i;
            }
        }
        return 100;
    }
}