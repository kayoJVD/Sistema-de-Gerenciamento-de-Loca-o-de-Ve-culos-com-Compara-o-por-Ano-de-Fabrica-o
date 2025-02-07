Sistema de Locação de Veículos

Descrição

O Sistema de Locação de Veículos é um projeto Java que permite gerenciar um catálogo de veículos disponíveis para locação. O sistema organiza diferentes tipos de veículos, como Carros, Motos e Caminhões, e oferece funcionalidades como adição de veículos, listagem, ordenação por ano de fabricação e busca do veículo mais antigo.

Tecnologias Utilizadas

Linguagem: Java

Paradigma: Programação Orientada a Objetos (POO)

Coleções: List (ArrayList)

Ordenação: Comparator

Estrutura do Projeto

O projeto está organizado em diferentes pacotes:

1. Model (Modelo de Dados)

Contém as classes que representam os veículos e suas propriedades:

Veiculos: Classe base para todos os veículos.

Carro: Extende Veiculos, adicionando o número de portas.

Moto: Extende Veiculos, adicionando o tipo da moto.

Caminhao: Extende Veiculos, adicionando a capacidade de carga.

2. Controller (Lógica de Negócio)

Locadora<T>: Classe genérica que gerencia os veículos.

Adiciona veículos ao catálogo.

Lista veículos cadastrados.

Ordena veículos por ano de fabricação.

Busca o veículo mais antigo.

ComparatorYearManufacture: Implementação de Comparator para ordenar veículos pelo ano de fabricação.

3. View (Interface de Usuário)

Main: Classe principal que instancia e executa a aplicação, demonstrando suas funcionalidades.

Funcionalidades

Adicionar diferentes tipos de veículos ao catálogo.

Listar todos os veículos disponíveis.

Ordenar os veículos por ano de fabricação.

Identificar o veículo mais antigo cadastrado.

Como Executar o Projeto

Pré-requisitos:

Java 8 ou superior instalado

IDE (IntelliJ, Eclipse, NetBeans) ou linha de comando

Passos para execução:

Clone este repositório.

git clone https://github.com/seu-repositorio.git

Compile o projeto.

javac -d bin src/ChatGpt/SistemaDeLocaçãoDeVeiculos/**/*.java

Execute o programa.

java -cp bin ChatGpt.SistemaDeLocaçãoDeVeiculos.View.Main

Exemplo de Saída

Carros ordenados por ano:
Lista de Carros
Veiculos{id='1', model='Uno com escadas', mark='Fiat', yerManufacture=1998, vehicleCategory='Carro', rentalPriceDay=100.0}
--------------
Veiculos{id='2', model='Ferrari', mark='ferrari', yerManufacture=2024, vehicleCategory='Carro', rentalPriceDay=5000.0}
--------------

Veículos mais antigos:
Veiculos{id='2', model='Fan 125', mark='Honda', yerManufacture=2010, vehicleCategory='Moto', rentalPriceDay=50.0}
Veiculos{id='1', model='Uno com escadas', mark='Fiat', yerManufacture=1998, vehicleCategory='Carro', rentalPriceDay=100.0}
Veiculos{id='2', model='Volkswagen Delivery 11.180', mark='Volksvagem', yerManufacture=2022, vehicleCategory='Caminhão', rentalPriceDay=900.0}

Melhorias Futuras

Implementação de um sistema de banco de dados para persistência de dados.

Interface gráfica para facilitar a interação com o usuário.

Funcionalidade de aluguel e devolução de veículos.

Autor

Kayo Alves

Licença

Este projeto está licenciado sob a MIT License - veja o arquivo LICENSE para mais detalhes.
