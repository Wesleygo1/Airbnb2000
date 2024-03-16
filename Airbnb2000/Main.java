// src/main/java/Airbnb2000/Main.java

public class Main {
    public static void main(String[] args) {
        GerenciadorImoveis gerenciador = new GerenciadorImoveis();

        // Adicionando imóveis ao gerenciador
        Casa casa1 = new Casa("1", "Endereço da Casa 1", 100.0);
        gerenciador.adicionarImovel(casa1);
        Apartamento apartamento1 = new Apartamento("3", "Endereço do Apartamento 1", 200.0);
        gerenciador.adicionarImovel(apartamento1);
        Vila vila1 = new Vila("4", "Endereço da Vila 1", 300.0);
        gerenciador.adicionarImovel(vila1);

        // Demonstração de operações
        System.out.println("Antes das operações:");
        gerenciador.listarDisponiveis().forEach(imovel -> System.out.println(imovel.getId() + " - " + imovel.getEndereco() + " - " + imovel.getPrecoPorNoite() + " - " + imovel.getStatus()));

        // Realizando operações de reserva
        casa1.reservar();
        apartamento1.reservar();
        vila1.reservar();

        // Listando imóveis disponíveis após reserva
        System.out.println("\nApós operações de reserva:");
        gerenciador.listarDisponiveis().forEach(imovel -> System.out.println(imovel.getId() + " - " + imovel.getEndereco() + " - " + imovel.getPrecoPorNoite() + " - " + imovel.getStatus()));

        // Simulando check-in
        casa1.checkIn();

        // Listando imóveis disponíveis após check-in
        System.out.println("\nApós operação de check-in na casa1:");
        gerenciador.listarDisponiveis().forEach(imovel -> System.out.println(imovel.getId() + " - " + imovel.getEndereco() + " - " + imovel.getPrecoPorNoite() + " - " + imovel.getStatus()));
    }
}
