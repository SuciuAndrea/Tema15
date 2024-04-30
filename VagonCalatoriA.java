public class VagonCalatoriA extends Vagon {
    private static  int CAPACITATE_PASAGERI = 40;
    private static int CAPACITATE_COLETE = 300;

    @Override
    public void deschideUsile() {
        System.out.println("Usile s-au deschis automat.");
    }

    @Override
    public void inchideUsile() {
        System.out.println("Usile s-au inchis automat.");
    }

    @Override
    public String getTipVagon() {
        return "CalatoriA";
    }
}
