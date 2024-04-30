public class VagonMarfa extends Vagon {
    private static int COLETE = 400;

    @Override
    public void deschideUsile() {
        System.out.println("Usile se deschid manual pentru vagonul de marfa.");
    }

    @Override
    public void inchideUsile() {
        System.out.println("Usile se inchid manual pentru vagonul de marfa.");
    }

    @Override
    public String getTipVagon() {
        return "Marfa";
    }
}
