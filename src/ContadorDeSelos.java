import java.util.Scanner;

public class ContadorDeSelos {

	public static void main(String[] args) {

		System.out.println("Digite qual o seu produto");

		Produto item = new Produto();
		int quantidadeDeProduto = 0;
		Scanner myObj = new Scanner(System.in);
		item.setNome(myObj.nextLine());

		System.out.println("Digite o preço");
		item.setPreco(myObj.nextDouble());


		System.out.println("Digite a quantidade");
		quantidadeDeProduto = myObj.nextInt();
		System.out.println(quantidadeDeProduto +" "+ item.getNome() + " - R$ " + item.getPreco());

		myObj.close();
	}
}
