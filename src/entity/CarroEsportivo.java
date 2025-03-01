package entity;
//Super Class
public class CarroEsportivo extends Carro{
    public Boolean modoEsportivo = true;

    //Constructor um
    public CarroEsportivo(String marca, String cor, Integer ano) {
        super(marca, cor, ano);
        this.modoEsportivo = false;//por quê?
    }

    //Constructor dois
    public CarroEsportivo(String marca, String cor) {
        super(marca, cor);
        this.modoEsportivo = false;//
    }

    //Método Esportivo
    public void ativarModoEsportivo(){
        this.modoEsportivo = true;
        this.setVelocidade(this.getVelocidade()+ 100);
        System.out.printf("Modo esportivo ativado! A nova velocidade é: " + this.getVelocidade() + "km/h.");
    }

    //Getter
    public Boolean getModoEsportivo() {
        return modoEsportivo;
    }
}
