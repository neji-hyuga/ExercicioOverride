import java.util.Date;

public class Cheque {

    private String numeroBanco;
    private Float valorCheque;
    private Date dataPagamento;

    public String getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(String numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public Float getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(Float valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
