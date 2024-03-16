// Arquivo: src/main/java/Airbnb2000/GerenciadorImoveis.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorImoveis {
    private List<Imovel> imoveis;

    public GerenciadorImoveis() {
        this.imoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public List<Imovel> listarDisponiveis() {
        return imoveis.stream()
                .filter(imovel -> imovel.getStatus().equals("Disponível"))
                .collect(Collectors.toList());
    }
}
