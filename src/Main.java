import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Criar uma nova conta bancária
        ContaBanco conta = new ContaBanco();

        // Definir valores para a conta bancária
        System.out.print("Digite o número da conta: ");
        conta.setNumero(leia.nextInt());
        leia.nextLine();  // Consumir a nova linha

        System.out.print("Digite a agência: ");
        conta.setAgencia(leia.nextLine());

        System.out.print("Digite o nome do cliente: ");
        conta.setNomeCliente(leia.nextLine());

        System.out.print("Digite o saldo inicial: ");
        conta.setSaldo(leia.nextBigDecimal());

        // Exibir detalhes da conta bancária
        conta.exibirDetalhes();

        leia.close();
    }
}