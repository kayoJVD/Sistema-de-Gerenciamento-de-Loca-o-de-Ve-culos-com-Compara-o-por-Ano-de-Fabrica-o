# Sistema de Locação de Veículos

Este projeto é um sistema de locação de veículos que permite gerenciar diferentes tipos de veículos, como carros, motos e caminhões. O sistema permite adicionar veículos, listar veículos, ordenar veículos por ano de fabricação e encontrar o veículo mais antigo.

## Estrutura do Projeto

O projeto está organizado nas seguintes pastas e arquivos:

- `Model`: Contém as classes de modelo que representam os veículos.
  - `Veiculos.java`: Classe base para todos os veículos.
  - `Carro.java`: Classe que representa um carro.
  - `Moto.java`: Classe que representa uma moto.
  - `Caminhao.java`: Classe que representa um caminhão.
- `Controller`: Contém a classe controladora que gerencia a locação de veículos.
  - `Locadora.java`: Classe genérica que gerencia a lista de veículos.
- `View`: Contém a classe principal que executa o programa.
  - `Main.java`: Classe principal que demonstra o uso do sistema.

## Classes e Métodos

### Veiculos

A classe `Veiculos` é a classe base para todos os veículos e contém os seguintes atributos e métodos:

- Atributos:
  - `id`: Identificador do veículo.
  - `model`: Modelo do veículo.
  - `mark`: Marca do veículo.
  - `yerManufacture`: Ano de fabricação do veículo.
  - `vehicleCategory`: Categoria do veículo.
  - `rentalPriceDay`: Preço de locação por dia.

- Métodos:
  - Construtor para inicializar os atributos.
  - Métodos `get` e `set` para cada atributo.
  - Método `toString` para representar o veículo como uma string.
  - Métodos `equals` e `hashCode` para comparar veículos.

### Carro

A classe `Carro` estende a classe `Veiculos` e adiciona o atributo `numberOfDoors` (número de portas).

### Moto

A classe `Moto` estende a classe `Veiculos` e adiciona o atributo `typeMotorcycle` (tipo de motocicleta).

### Caminhao

A classe `Caminhao` estende a classe `Veiculos` e adiciona o atributo `loadCapacity` (capacidade de carga).

### Locadora

A classe `Locadora` é uma classe genérica que gerencia uma lista de veículos. Ela contém os seguintes métodos:

- `addVehicles(T vehicle)`: Adiciona um veículo à lista.
- `listVehicles()`: Lista todos os veículos.
- `orderForYear()`: Ordena os veículos por ano de fabricação.
- `searchOlder()`: Encontra o veículo mais antigo.

### Main

A classe `Main` demonstra o uso do sistema de locação de veículos. Ela cria instâncias de `Locadora` para carros, motos e caminhões, adiciona veículos a essas locadoras, ordena os veículos por ano de fabricação e lista os veículos.

## Como Executar

Para executar o projeto, compile e execute a classe `Main`:

```bash
javac ChatGpt/SistemaDeLocaçãoDeVeiculos/View/Main.java
java ChatGpt/SistemaDeLocaçãoDeVeiculos/View/Main
```

## Contribuição

Sinta-se à vontade para contribuir com melhorias para este projeto. Para contribuir, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma nova branch: `git checkout -b minha-nova-feature`.
3. Faça suas alterações e commit: `git commit -m 'Adiciona nova feature'`.
4. Envie para o repositório original: `git push origin minha-nova-feature`.
5. Crie um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

---
