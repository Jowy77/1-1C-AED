package pkg1.pkg1c.aed;

import java.util.ArrayList;
import java.util.List;
import pkg1.pkg1c.aed.modelo.Camion;
import pkg1.pkg1c.aed.modelo.Turismo;
import pkg1.pkg1c.aed.modelo.Vehiculo;
import pkg1.pkg1c.aed.utiles.Listar;
import pkg1.pkg1c.aed.vistas.PrincipalView;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = List.of(new Camion(30.35, "HL-2222-KKK", false),
                new Turismo(80.53, "AL-2221-KKA", false),
                new Camion(70.29, "BL-2223-VKB", false),
                new Turismo(200.79, "CL-2224-KKC", false),
                new Camion(10.29, "DL-2225-BKD", false),
                new Turismo(50.89, "EL-2226-KKE", false),
                new Camion(70.14, "FL-2227-KKF", false),
                new Turismo(129.19, "XP-2258-AKG", false),
                new Camion(212.19, "GL-2728-LXG", false),
                new Turismo(122.10, "GL-1228-MKG", false));

        /*String a = Listar.mostrar(listaVehiculos);
        System.out.println(a);*/
        PrincipalView view = new PrincipalView(listaVehiculos);

        view.setVisible(true);
    }

}
