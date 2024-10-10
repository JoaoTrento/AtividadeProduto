package objetos;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Integer id;
	
	public Produto(String nome, Double preco, Integer quantidade, Integer id) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.id = id;
	}
	public Produto() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", id=" + id + "]";
	}
	
}
