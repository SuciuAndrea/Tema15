public class VagonCalatoriB extends Vagon {
    private static int PASAGERI = 50;
    private static int COLETE = 400;

    @Override
    public void deschideUsile() {
        System.out.println("Usile s-au deschis automat.");
    }

    @Override
    public void inchideUsile() {
        System.out.println("Usile s-au inchis automat.");
    }

    public void blocheazaGeamurile() {
        System.out.println("Geamurile s-au blocat.");
    }

    @Override
    public String getTipVagon() {
        return "CalatoriB";
    }
}

