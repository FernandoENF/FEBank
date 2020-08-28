public class DAO {
    protected Database db = new Database();

    public void cadastrarClienteDAO(Cliente umCliente) {
        db.adicionar(umCliente);
    }
    
}