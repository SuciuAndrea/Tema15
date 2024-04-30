import java.util.ArrayList;
import java.util.List;

public class Contribuabil {
    private String name;
    private List<Proprietate> proprietati;

    public Contribuabil(String name) {
        this.name = name;
        this.proprietati = new ArrayList<>();
    }

    public void adaugaProprietate(Proprietate proprietate) {
        proprietati.add(proprietate);
    }

    public String genereazaFluturas() {
        StringBuilder builder = new StringBuilder();
        builder.append("Contribuabil: ").append(nume).append("\n");
        builder.append("Proprietăți\n");
        for (Proprietate proprietate : proprietati) {
            builder.append(proprietate.toString()).append("\n");
        }
        double taxaTotala = proprietati.stream().mapToDouble(Proprietate::calculeazaTaxa).sum();
        builder.append("Suma totală: ").append(taxaTotala);
        return builder.toString();
    }

    public static void main(String[] args) {
        Contribuabil contribuabil = new Contribuabil("Ion Popescu");
        contribuabil.adaugaProprietate(new Proprietate("Strada V Parvan Nr. 2", new TipProprietate("cladire"), 20));
        contribuabil.adaugaProprietate(new Proprietate("Strada V Parvan Nr. 2", new TipProprietate("teren"), 10));
        contribuabil.adaugaProprietate(new Proprietate("Strada Lugoj Nr. 4", new TipProprietate("cladire"), 25));

        String fluturasTaxe = contribuabil.genereazaFluturasTaxe();
        System.out.println(fluturasTaxe);
    }
}

