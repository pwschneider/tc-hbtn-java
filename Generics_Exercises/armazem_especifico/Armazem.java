import java.util.Map;
import java.util.HashMap;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> inventario;

    public Armazem() {
        inventario = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        inventario.put(nome, valor);

    }

    @Override
    public T obterDoInventario(String nome) {
        return inventario.get(nome);
    }

}
