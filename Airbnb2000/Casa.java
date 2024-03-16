// Arquivo: src/main/java/Airbnb2000/Casa.java

public class Casa extends Imovel {

    public Casa(String id, String endereco, double precoPorNoite) {
        super(id, endereco, precoPorNoite);
    }

    @Override
    public void reservar() {
        if (status.equals("Disponível")) {
            status = "Reservado";
            System.out.println("Casa " + id + " reservada com sucesso.");
        } else {
            System.out.println("Casa " + id + " não está disponível para reserva.");
        }
    }

    @Override
    public void checkIn() {
        if (status.equals("Reservado")) {
            status = "Ocupado";
            System.out.println("Check-in na Casa " + id + " realizado com sucesso.");
        } else {
            System.out.println("Casa " + id + " não está reservada.");
        }
    }

    @Override
    public void checkOut() {
        if (status.equals("Ocupado")) {
            status = "Disponível";
            System.out.println("Check-out na Casa " + id + " realizado com sucesso.");
        } else {
            System.out.println("Casa " + id + " não está ocupada.");
        }
    }
}
