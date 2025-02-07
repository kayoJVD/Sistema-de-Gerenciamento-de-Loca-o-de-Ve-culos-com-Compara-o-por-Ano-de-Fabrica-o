package ChatGpt.SistemaDeLocaçãoDeVeiculos.View;

import ChatGpt.SistemaDeLocaçãoDeVeiculos.Controller.Locadora;
import ChatGpt.SistemaDeLocaçãoDeVeiculos.Model.Caminhao;
import ChatGpt.SistemaDeLocaçãoDeVeiculos.Model.Carro;
import ChatGpt.SistemaDeLocaçãoDeVeiculos.Model.Moto;

public class Main {
    public static void main(String[] args) {
        Locadora<Carro> locadoraCarro = new Locadora();
        Locadora<Caminhao> locadoraCaminhao = new Locadora();
        Locadora<Moto> locadoraMoto = new Locadora();
        Carro carro1 = new Carro("1", "Uno com escadas", "Fiat", 1998, 100, "2");
        Carro carro2 = new Carro("2", "Ferrari", "ferrari", 2024, 5000, "2");

        Caminhao caminhao1 = new Caminhao("1", "Caminhão Volvo FH 540", "Volksvagem", 2024, 1000,"50 toneladas");
        Caminhao caminhao2 = new Caminhao("2", "Volkswagen Delivery 11.180", "Volksvagem", 2022, 900,"50 toneladas");

        Moto moto1 = new Moto("1", "Hornet", "Honda CB", 2013, 100, "Esportiva");
        Moto moto2 = new Moto("2", "Fan 125", "Honda", 2010, 50, "ESD:");


        locadoraCarro.addVehicles(carro1);
        locadoraCarro.addVehicles(carro2);


        locadoraCaminhao.addVehicles(caminhao1);
        locadoraCaminhao.addVehicles(caminhao2);


        locadoraMoto.addVehicles(moto1);
        locadoraMoto.addVehicles(moto2);

        locadoraCarro.orderForYear();
        System.out.println("Carros ordenados por ano:");

        System.out.println("Lista de Carros");
        locadoraCarro.listVehicles();

        locadoraMoto.orderForYear();
        System.out.println("Motos ordenados por ano:");
        System.out.println("Lista de Motos");
        locadoraMoto.listVehicles();

        locadoraCaminhao.orderForYear();
        System.out.println("caminhões ordenados por ano:");
        System.out.println("Lista de Caminhões");
        locadoraCaminhao.listVehicles();

        System.out.println("Veiculos mais antigos");

        System.out.println(locadoraMoto.searchOlder());
        System.out.println(locadoraCarro.searchOlder());
        System.out.println(locadoraCaminhao.searchOlder());






    }
}
