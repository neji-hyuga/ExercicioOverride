public class ContaCorrente extends Conta {

    private Float limiteChequeEspecial;

    public Float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void depositarCheque (Cheque cheque){
        setSaldo(getSaldo() + cheque.getValorCheque());
    }

    @Override
    public void sacar (Float saque){
        if (getSaldo() + limiteChequeEspecial > saque){
            setSaldo(getSaldo() - saque);

        }
    }


}
