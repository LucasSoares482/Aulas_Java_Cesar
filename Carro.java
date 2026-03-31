public class Carro {

    // Atributos (características do carro)
    String marca;
    String modelo;
    int ano;
    String cor;
    double preco;

    // Método para exibir as informações do carro
    void exibirInfo() {
        System.out.println("=== Informações do Carro ===");
        System.out.println("Marca : " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano   : " + ano);
        System.out.println("Cor   : " + cor);
        System.out.println("Preço : R$ " + preco);
        System.out.println();
    }

    public static void main(String[] args) {

        // Criando o primeiro carro
        Carro carro1 = new Carro();
        carro1.marca  = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano    = 2022;
        carro1.cor    = "Prata";
        carro1.preco  = 120000.00;

        // Criando o segundo carro
        Carro carro2 = new Carro();
        carro2.marca  = "Honda";
        carro2.modelo = "Civic";
        carro2.ano    = 2023;
        carro2.cor    = "Preto";
        carro2.preco  = 135000.00;

        // Exibindo as informações
        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
