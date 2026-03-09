import service.ClienteService;
import model.Cliente;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClienteService service = new ClienteService();

        service.cadastrarCliente(1, "João", "joao@email.com");
        service.cadastrarCliente(2, "Maria", "maria@email.com");

        System.out.println("Lista de clientes:");

        List<Cliente> clientes = service.listarClientes();

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        service.atualizarCliente(1, "João Silva", "joaosilva@email.com");

        System.out.println("\nApós atualização:");

        for (Cliente cliente : service.listarClientes()) {
            System.out.println(cliente);
        }

        service.removerCliente(2);

        System.out.println("\nApós remoção:");

        for (Cliente cliente : service.listarClientes()) {
            System.out.println(cliente);
        }
    }
}
