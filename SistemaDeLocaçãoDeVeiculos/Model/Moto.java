package ChatGpt.SistemaDeLocaçãoDeVeiculos.Model;

public class Moto extends Veiculos{
    private String typeMotorcycle;

    public Moto(String id, String model, String mark, int yerManufacture, double rentalPriceDay, String typeMotorcycle) {
        super(id, model, mark, yerManufacture, "Moto", rentalPriceDay);
        this.typeMotorcycle = typeMotorcycle;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" +
                "typeMotorcycle='" + typeMotorcycle + '\'' +
                '}';
    }

    public String getTypeMotorcycle() {
        return typeMotorcycle;
    }

    public void setTypeMotorcycle(String typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;
    }
}
