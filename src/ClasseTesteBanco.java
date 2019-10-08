import java.util.Scanner;

public class ClasseTesteBanco {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente();
        cliente01.setNomeCliente("victor");
        cliente01.setSobrenomeCliente("montero");
        cliente01.setNumeroCliente("1234567");
        cliente01.setCpfCliente("111.111");
        cliente01.setRgCliente("11.111.111-1");

        Cliente cliente02 = new Cliente();
        cliente02.setNomeCliente("moacir");
        cliente02.setSobrenomeCliente("fraga");
        cliente02.setNumeroCliente("987456");
        cliente02.setCpfCliente("222.222.222-02");
        cliente02.setRgCliente("22.222.222-2");

        ContaCorrente contaCor01 = new ContaCorrente();
        contaCor01.setTitular(cliente01);
        contaCor01.setSaldo(500f);
        contaCor01.setLimiteChequeEspecial(1000f);

        ContaPoupanca contaPou01 = new ContaPoupanca();
        contaPou01.setTitular(cliente02);
        contaPou01.setSaldo(200f);
        contaPou01.setTaxaJuros(5f);


        System.out.println("###########################");
        System.out.println("######## evil b4nk ########");
        System.out.println("###########################");

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero do cliente: ");
        int nCli = teclado.nextInt();

        System.out.println("                           ");
        System.out.println("###################################");
        System.out.println("olá " + cliente01.getNomeCliente() + ",");
        System.out.println("você deseja fazer um saque, certo?");
        System.out.println("então digite o valor: ");
        System.out.println("###################################");

        Scanner teclado2 = new Scanner(System.in);
        Float valorSaque = teclado2.nextFloat();

        contaCor01.sacar(valorSaque);

        System.out.println("###################################");
        System.out.println("vc sacou " + valorSaque);
        System.out.println("seu novo saldo é: " + contaCor01.getSaldo());
        System.out.println("###################################");


        System.out.println(contaCor01.getSaldo());










    }
}
