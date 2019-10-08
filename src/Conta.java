public abstract class Conta {

    private Float saldo;
    private Cliente titular;

    public void sacar (Float valorSaque){
        if (valorSaque < saldo){
            saldo = saldo - valorSaque;
        }
    }

    public void depositar (Float valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public void imprimirSaldo (){
        System.out.println(saldo);
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
