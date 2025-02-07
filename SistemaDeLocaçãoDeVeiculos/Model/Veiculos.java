package ChatGpt.SistemaDeLocaçãoDeVeiculos.Model;

import java.util.Objects;

public class Veiculos {
    private String id;
    private String model;
    private String mark;
    private int yerManufacture;
    private String vehicleCategory;
    private double rentalPriceDay;

    public Veiculos(String id, String model, String mark, int yerManufacture, String vehicleCategory, double rentalPriceDay) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.yerManufacture = yerManufacture;
        this.vehicleCategory = vehicleCategory;
        this.rentalPriceDay = rentalPriceDay;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", yerManufacture=" + yerManufacture +
                ", vehicleCategory='" + vehicleCategory + '\'' +
                ", rentalPriceDay=" + rentalPriceDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculos veiculos = (Veiculos) o;
        return Objects.equals(id, veiculos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYerManufacture() {
        return yerManufacture;
    }

    public void setYerManufacture(int yerManufacture) {
        this.yerManufacture = yerManufacture;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public double getRentalPriceDay() {
        return rentalPriceDay;
    }

    public void setRentalPriceDay(double rentalPriceDay) {
        this.rentalPriceDay = rentalPriceDay;
    }
}
