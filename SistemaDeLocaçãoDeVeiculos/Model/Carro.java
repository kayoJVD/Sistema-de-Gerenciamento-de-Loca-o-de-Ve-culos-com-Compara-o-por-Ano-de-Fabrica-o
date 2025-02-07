package ChatGpt.SistemaDeLocaçãoDeVeiculos.Model;

public class Carro extends Veiculos{
    private String numberOfDoors;

    public Carro(String id, String model, String mark, int yerManufacture, double rentalPriceDay, String numberOfDoors) {
        super(id, model, mark, yerManufacture, "Carro", rentalPriceDay);
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Carro{" +
                "numberOfDoors='" + numberOfDoors + '\'' +
                '}';
    }



    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
