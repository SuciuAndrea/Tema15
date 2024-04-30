public class Tren {
    private static int MAX_VAGOANE = 15;
    private Vagon[] vagoane;
    private int numarVagoane;

    public Tren() {
        vagoane = new Vagon[MAX_VAGOANE];
        numarVagoane = 0;
    }

    public void adaugaVagon(Vagon vagon) {
        if (numarVagoane < MAX_VAGOANE) {
            vagoane[numarVagoane++] = vagon;
        } else {
            System.out.println("Nu se mai pot adauga vagoane. Trenul este plin.");
        }
    }

    public boolean equals(Tren tren) {
        int capacitateTotala1 = calculeazaCapacitateTotala();
        int capacitateTotala2 = tren.calculeazaCapacitateTotala();
        return capacitateTotala1 == capacitateTotala2;
    }

 

    public void afiseazaTipuriVagoane() {
        for (Vagon vagon : vagoane) {
            if (vagon != null) {
                System.out.println(vagon.getTipVagon());
            }
        }
    }

    public static void main(String[] args) {
        Tren tren1 = new Tren();
        tren1.adaugaVagon(new VagonCalatoriA());
        tren1.adaugaVagon(new VagonCalatoriB());
        tren1.adaugaVagon(new VagonMarfa());

        Tren tren2 = new Tren();
        tren2.adaugaVagon(new VagonCalatoriA());
        tren2.adaugaVagon(new VagonMarfa());

        System.out.println("Trenurile sunt egale: " + tren1.equals(tren2));

        System.out.println("Tipurile de vagoane din trenul 1:");
        tren1.afiseazaTipuriVagoane();
    }
}
