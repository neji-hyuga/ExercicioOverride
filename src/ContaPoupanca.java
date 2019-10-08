public class ContaPoupanca extends Conta {

    private Float taxaJuros;

    public void recolherJuros (float juros){
        setSaldo(getSaldo() - juros);
    }

    public Float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}

