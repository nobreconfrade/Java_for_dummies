import java.util.Scanner;
public class compramain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor total da compra e a quantidade de parcelas caso a compra seja parcelada:");
        int valor = input.nextInt();
        int qtdParcelas = input.nextInt();
        Compra a1 = new Compra(valor,qtdParcelas);
        // System.out.println("O valor total: "+a1.getValorTotal());
        // System.out.println("O nrº parcelas: "+a1.getNumeroParcelas());
        a1.printaValorParcela();
        System.out.println("O mesmo valor da parcela é de "+a1.getValorParcela()+" reais.");
    }
}
