import java.util.HashMap;
import java.util.Map;

class Categoria {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class CategoriaFactory {
    private static final Map<String, Categoria> categorias = new HashMap<>();
// Condição
    public static Categoria getCategoria(String nome) {
        if (!categorias.containsKey(nome)) {
            categorias.put(nome, new Categoria(nome));
        }else {
            System.out.println("Já existe.");
        }
        return categorias.get(nome);
    }
}

// Produtos
class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private Categoria categoria;

    public Produto(String nome, double preco, String descricao, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}

public class FlyweightEstoque {
    public static void main(String[] args) {
        Categoria electronicos = CategoriaFactory.getCategoria("Eletronicos");
        Categoria vestuario = CategoriaFactory.getCategoria("Vestuário");
        Categoria vestuario2 = CategoriaFactory.getCategoria("Vestuário");

        Produto tv = new Produto("Smart TV", 4000.0, "Smart TV de 45 polegadas", electronicos);
        Produto laptop = new Produto("Laptop", 2500.0, "Laptop de 15 polegadas", electronicos);
        Produto xbox = new Produto("Xbox", 3500.0, "Vídeo-game Xbox Series X", electronicos);
        Produto camisa = new Produto("Camisa", 50.0, "Camisa de algodão", vestuario);
        Produto vestido = new Produto("Vestido", 80.0, "Vestido de verão", vestuario);
        Produto moletom = new Produto("Moletom", 120.0, "Calça moletom de inverno", vestuario);

        System.out.println("Produto: " + tv.getNome() + ", Categoria: " + tv.getCategoria().getNome() + ", Preço: " + tv.getPreco() + ", Descricao: " + tv.getDescricao());
        System.out.println("Produto: " + laptop.getNome() + ", Categoria: " + laptop.getCategoria().getNome() + ", Preço: " + laptop.getPreco() + ", Descricao: " + laptop.getDescricao());
        System.out.println("Produto: " + xbox.getNome() + ", Categoria: " + xbox.getCategoria().getNome() + ", Preço: " + xbox.getPreco() + ", Descricao: " + xbox.getDescricao());
        System.out.println("Produto: " + camisa.getNome() + ", Categoria: " + camisa.getCategoria().getNome() + ", Preço: " + camisa.getPreco() + ", Descricao: " + camisa.getDescricao());
        System.out.println("Produto: " + vestido.getNome() + ", Categoria: " + vestido.getCategoria().getNome() + ", Preço: " + vestido.getPreco() + ", Descricao: " + vestido.getDescricao());
        System.out.println("Produto: " + moletom.getNome() + ", Categoria: " + moletom.getCategoria().getNome() + ", Preço: " + moletom.getPreco() + ", Descricao: " + moletom.getDescricao());
    }
}
