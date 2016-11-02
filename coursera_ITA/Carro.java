public class Carro{
    int potencia;
    int velocidade;
    String nome;

    void acelerar(){
        velocidade += potencia;
    }

    void freiar(){
        velocidade /= 2;
    }

    int getVelocidade(){
        return velocidade;
    }

    String getNome(){
        return nome;
    }

    void imprimir(){
        System.out.println("O carro "+getNome()+" esta a "+getVelocidade()+" KM/H");
    }
}
