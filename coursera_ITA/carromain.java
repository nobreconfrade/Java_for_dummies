public class carromain{
    public static void main(String[] args){
        Carro altis1 = new Carro();
        altis1.velocidade = 0;
        altis1.potencia = 20;
        altis1.nome = "Altis";

        altis1.acelerar();
        altis1.acelerar();
        altis1.acelerar();
        altis1.acelerar();
        altis1.imprimir();
        altis1.freiar();
        altis1.imprimir();
    }
}
