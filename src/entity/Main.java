package entity;

//Main
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Azul", 2022); //carro um
        Carro carro2= new Carro("Ferrari", "Vermelha", 2019); //carro dois
        CarroEsportivo carro3 = new CarroEsportivo("Kwid", "cinza", 2020);

        carro1.acelerar();
        carro1.frear();
        carro1.pintar("Vermelho");
        System.out.println("Carro 1 (Ford) é seminovo? " + carro1.seraSeminovo());

        System.out.println(" ");

        carro2.acelerar();
        carro2.frear();
        carro2.pintar("Branco");
        System.out.println("Carro 2 (Ferrari) é seminovo? " + carro2.seraSeminovo());

        System.out.println(" ");

        System.out.println("\nModo esportivo está ativo? " + carro3.getModoEsportivo());
        carro3.ativarModoEsportivo();
        System.out.println("\nModo esportivo está ativo? " + carro3.getModoEsportivo());
    }


}