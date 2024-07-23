import java.math.BigDecimal;

public class ContaBanco {
    private Integer Numero;
    private String Agencia;
    private String NomeCliente;
    private BigDecimal Saldo;

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return Saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        Saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.println("Número da Conta: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Nome do Cliente: " + NomeCliente);
        System.out.println("Saldo: " + Saldo);
    }
}
