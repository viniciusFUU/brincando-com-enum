package pack.user;

import pack.dev.Cardapio;
import pack.dev.VisaoImp;

public class App {
    public static void main(String[] args) throws Exception {
        VisaoImp lanchonete = new VisaoImp();

        Double hamburguer = lanchonete.getShape(Cardapio.HAMBURGUER);
        Double xBurguer = lanchonete.getShape(Cardapio.XBURGUER);
        Double xSalada = lanchonete.getShape(Cardapio.XSALADA);
        Double xBacon = lanchonete.getShape(Cardapio.XBACON);
        Double xBaconSalada = lanchonete.getShape(Cardapio.XBACONSALADA);
        Double XCalabresa = lanchonete.getShape(Cardapio.XCALABRESA);
        Double xEgg = lanchonete.getShape(Cardapio.XEGG);

        System.out.println(hamburguer);
        System.out.println(xBurguer);
        System.out.println(xSalada);
        System.out.println(xBacon);
        System.out.println(xBaconSalada);
        System.out.println(XCalabresa);
        System.out.println(xEgg);
    }
}
