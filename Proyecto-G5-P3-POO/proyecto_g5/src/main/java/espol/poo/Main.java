package espol.poo;
import espol.poo.controlador.ControladorPrincipal;
import espol.poo.modelo.TecnicasEnfoque;

public class Main {
    public static void main(String[] args) {
        ControladorPrincipal controlador = new ControladorPrincipal();
        controlador.iniciarMenuPrincipal();
        TecnicasEnfoque t = new TecnicasEnfoque();
        t.mostrarMenu();
    }
}