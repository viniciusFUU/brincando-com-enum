package pack.dev;

public class VisaoImp implements Visao {
    Double result = null;

    @Override
    public Double getShape(Cardapio cardapio) {
        switch (cardapio) {
            case HAMBURGUER:
                result = new Hamburguer().passarPreco();
                break;
            case XBURGUER:
                result = new Xburguer().passarPreco();
                break;
            case XSALADA:
                result = new Xsalada().passarPreco();
                break;
            case XBACON:
                result = new Xbacon().passarPreco();
                break;
            case XBACONSALADA:
                result = new XBaconSalada().passarPreco();
                break;
            case XCALABRESA:
                result = new XCalabresa().passarPreco();
                break;
            case XEGG:
                result = new XEgg().passarPreco();
                break;
        }
        return result;
    }
}
