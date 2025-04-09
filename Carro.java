public class Carro extends Vehiculo{
    String color;
    String placa;

    public Carro(String color, String placa){
        this.color = color;
        this.placa = placa;
    }

    @Override
    public String pintarCarro(){
        return "Se está pintando el carro";
    }

    @Override
    public String toString(){
        return "color: "+ this.color + " placa: " + this.placa;
    }

}