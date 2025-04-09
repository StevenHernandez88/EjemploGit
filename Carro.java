public class Carro{
    String color;
    String placa;

    public Carro(String color, String placa){
        this.color = color;
        this.placa = placa;
    }

    @Override
    public String toString(){
        return "color: "+ this.color + " placa: " + this.placa;
    }

}