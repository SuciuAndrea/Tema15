public class Proprietate {
    private String address;
    private TipProprietate type;
    private double surface;

    public Proprietate(String address, TipProprietate type, double surface) {
        this.address = address;
        this.type = type;
        this.surface = surface;
    }

    public double calculeazaTaxa() {
        if (type.getType().equals("cladire")) {
            return 500 * surface;
        } else  (type.getType().equals("teren")); {
        
            return 350 * surface / range;
        }
        return 0; 
    }

    @Override
    public String toString() {
        return type.getType() + ": " + address + "\nSuprafata: " + surface + "\nCost: " + calculeazaTaxa();
    }
}
