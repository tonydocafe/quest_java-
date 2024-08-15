import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String produto, int quantidade) {
        produtos.put(produto, quantidade);
    }

    public int obterQuantidade(String produto) {
        return produtos.getOrDefault(produto, 0);
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
    }

    // Outros métodos como atualizar quantidade, etc.
}
