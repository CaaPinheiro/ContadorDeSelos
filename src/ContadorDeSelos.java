import java.util.Scanner;

public class ContadorDeSelos {

	public static void main(String[] args) {

		int valorEmCompras = 30;
		
		System.out.println("Digite qual o seu produto");

		Produto item = new Produto();
		int quantidadeDeProduto = 0;
		Scanner myObj = new Scanner(System.in);
		item.setNome(myObj.nextLine());

		System.out.println("Digite o preço");
		item.setPreco(myObj.nextDouble());

		System.out.println("Digite a quantidade");
		quantidadeDeProduto = myObj.nextInt();

		double valorTotalDaCompra = quantidadeDeProduto * item.getPreco();
		
		double totalDeSelosEmDouble = valorTotalDaCompra / valorEmCompras;
		
		int totalDeSelos = (int)totalDeSelosEmDouble ;
				
		System.out.println(quantidadeDeProduto + " " + item.getNome() + " - R$ " + item.getPreco());
		System.out.println("Total: R$ " + valorTotalDaCompra);
		System.out.println("Total de Selos - " + totalDeSelos);
		
		
		myObj.close();
	}
}
