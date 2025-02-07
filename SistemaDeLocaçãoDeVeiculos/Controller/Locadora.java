package ChatGpt.SistemaDeLocaçãoDeVeiculos.Controller;

import ChatGpt.SistemaDeLocaçãoDeVeiculos.Model.Veiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorYearManufacture implements Comparator<Veiculos>{
    @Override
    public int compare(Veiculos o1, Veiculos o2) {
        return Integer.compare(o1.getYerManufacture(), o2.getYerManufacture());
    }
}

public class Locadora <T extends Veiculos> {
    private List<T> vehicles = new ArrayList<>();

    public void addVehicles(T vehicle){
        vehicles.add(vehicle);
    }

    public void listVehicles(){
        for (T t : vehicles) {
            System.out.println(t);
            System.out.println("--------------");
        }
    }

    public void orderForYear(){
         vehicles.sort(Comparator.comparingInt(Veiculos::getYerManufacture));
    }

    public T searchOlder(){
        return vehicles.stream().min(Comparator.comparingInt(Veiculos::getYerManufacture)).orElse(null);
    }
}
