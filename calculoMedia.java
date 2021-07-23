import java.util.Scanner;
public class calculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bem Vindo ao Cálculo da sua Média");
		System.out.println("Insira suas notas no Primeiro Bimestre");
		System.out.print("Insira sua média na Prova: ");
		double prova1 = sc.nextDouble();
		System.out.print("Ïnsira sua média em Projeto: ");
		double proj1 = sc.nextDouble();
		System.out.print("Insira sua média em MOOC: ");
		double mooc1 = sc.nextDouble();
		System.out.print("Insira sua média em Exercícios: ");
		double exerc1 = sc.nextDouble();
		double bim1 = (((3*prova1)+(3*proj1)+(2*exerc1)+(3*mooc1))/11);
		System.out.println("Agora insira suas notas do Segundo Bimestre");
		System.out.print("Insira sua média na Prova: ");
		double prova2 = sc.nextDouble();
		System.out.print("Ïnsira sua média em Projeto: ");
		double proj2 = sc.nextDouble();
		System.out.print("Insira sua média em MOOC: ");
		double mooc2 = sc.nextDouble();
		System.out.print("Insira sua média em Exercícios: ");
		double exerc2 = sc.nextDouble();
		double bim2 = (((3*prova2)+(3*proj2)+(2*exerc2)+(3*mooc2))/11);
		System.out.println("Suas médias foram "+bim1+" no primeiro bimestre e "+bim2+" no segundo semestre");
		double media = ((bim1+bim2)/2);
		System.out.println("Sua Média Final foi "+media+"");
		double provafim = (10-media);
		
		if (media>=8) {
			System.out.println("Parabéns, você foi aprovado!");
		}
		else {
			System.out.println("Você ainda não foi aprovado... Você precisa de "+provafim+" na prova final");
		}
		
		
		sc.close();
		
	}

}
