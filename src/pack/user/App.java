package pack.user;

import pack.dev.Cardapio;
import pack.dev.VisaoImp;

public class App {
    public static void main(String[] args) throws Exception {
        VisaoImp lanchonete = new VisaoImp();

        Double hamburguer = lanchonete.getShape(Cardapio.HAMBURGUER);
        Double xburguer = lanchonete.getShape(Cardapio.XBURGUER);

        System.out.println(hamburguer);
        System.out.println(xburguer);
    }
}
