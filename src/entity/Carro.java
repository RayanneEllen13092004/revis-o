package entity;

//Classe Carro
public class Carro {
    private String marca;
    private String cor;
    private Integer ano;
    private double velocidade;
    private boolean seminovo;

    //Métodos
    public void acelerar() {
        this.velocidade += 10;
        System.out.printf("A velocidade foi acelerada para %.2f. \n", velocidade);
    }

    public void frear() {
        this.velocidade -= 10;
        System.out.printf("A velocidade foi freada para %.2f. \n", velocidade);
    }

    public void pintar(String novaCor) {
        if (novaCor != null && !novaCor.isEmpty()){
            this.cor = novaCor;
            System.out.printf("A cor foi alterada para: %s.\n", this.cor);
        }else {
            System.out.println("Erro: cor inválida.");
        }
    }

//Método para verificar se carro é seminovo
    boolean seraSeminovo(){
        return this.ano > 2020 ? true : false;
    }

    //Constructor um com marca, ano e ano
    public Carro(String marca, String cor, Integer ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.seminovo = seraSeminovo();
    }

    //Constructor dois com apenas marca e ano
    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    @Override
        public String toString(){
            return String.format("Carro[marca=%s, cor=%s, ano=%i, velocidade=%d, seminovo=%b]",
                    this.marca, this.cor, this.ano, this.velocidade, this.seminovo);
    }


    //Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
        this.seminovo = seraSeminovo();
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
