public class Compra{
    int valorTotal;
    int numeroParcelas;

    public Compra(int valor){
            valorTotal = valor;
            numeroParcelas = 1;
    }
    public Compra(int valor, int qtdParcelas){
        valorTotal = valor;
        numeroParcelas = qtdParcelas;
    }

    public int getValorTotal(){
        return valorTotal;
    }

    public int getNumeroParcelas(){
        return numeroParcelas;
    }

    public int getValorParcela(){
        return valorTotal/numeroParcelas;
    }

    void printaValorParcela(){
        System.out.println("O valor da parcela é de "+getValorParcela()+" reais.");
    }
}
