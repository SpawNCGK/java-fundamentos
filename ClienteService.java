package service;

import model.Cliente;
import repository.ClienteRepository;
import java.util.List;

public class ClienteService {

    private ClienteRepository repository = new ClienteRepository();

    public void cadastrarCliente(int id, String nome, String email) {
        Cliente cliente = new Cliente(id, nome, email);
        repository.adicionarCliente(cliente);
    }

    public List<Cliente> listarClientes() {
        return repository.listarClientes();
    }

    public void atualizarCliente(int id, String nome, String email) {
        Cliente cliente = repository.buscarCliente(id);

        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setEmail(email);
        }
    }

    public void removerCliente(int id) {
        repository.removerCliente(id);
    }
}
