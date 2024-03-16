// Arquivo: src/main/java/Airbnb2000/Imovel.java

public abstract class Imovel {
    protected String id;
    protected String endereco;
    protected double precoPorNoite;
    protected String status; // "Disponível", "Reservado", "Ocupado"

    public Imovel(String id, String endereco, double precoPorNoite) {
        this.id = id;
        this.endereco = endereco;
        this.precoPorNoite = precoPorNoite;
        this.status = "Disponível";
    }

    public abstract void reservar();

    public abstract void checkIn();

    public abstract void checkOut();

    // Métodos getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
