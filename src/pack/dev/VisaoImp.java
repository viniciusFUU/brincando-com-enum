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
            default:
                break;
        }
        return result;
    }
}
