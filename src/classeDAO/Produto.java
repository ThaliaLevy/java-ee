package classeDAO;

import java.util.Scanner;

public class Produto {
	private String nome;
	private String marca;
	private String codigoBarra;
	private double valor;

	public Produto() {

	}

	public Produto(String nome, String marca, String codigoBarra, double valor) {
		// por padr�o o super() � criado, por�m, n�o ser� necess�rio nesse caso, visto
		// que a fun��o do super() � chamar classe-pai (se houvesse heran�a)
		// super();

		this.nome = nome;
		this.marca = marca;
		this.codigoBarra = codigoBarra;
		this.valor = valor;
	}

	public void cadastrarProduto() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n CADASTRO DE PRODUTO \n---------------------");
		System.out.println("Nome: ");
		setNome(ler.nextLine());
		System.out.println("Marca: ");
		marca = ler.nextLine();
		System.out.println("C�digo de barra: ");
		codigoBarra = ler.nextLine();
		System.out.println("Valor: ");
		valor = ler.nextDouble();
		
		ProdutoDAO pDAO = new ProdutoDAO();
		pDAO.cadastrarEx01(this);

		ler.close();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
