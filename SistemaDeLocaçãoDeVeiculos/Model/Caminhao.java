package ChatGpt.SistemaDeLocaçãoDeVeiculos.Model;

public class Caminhao extends Veiculos{
    private String loadCapacity;

    public Caminhao(String id, String model, String mark, int yerManufacture, double rentalPriceDay, String loadCapacity) {
        super(id, model, mark, yerManufacture, "Caminhão", rentalPriceDay);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Caminhao{" +
                "loadCapacity='" + loadCapacity + '\'' +
                '}';
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
