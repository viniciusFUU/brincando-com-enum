package pack.dev;

class XEgg implements Preco{
    private Double preco = 20.0;

    @Override
    public Double passarPreco() {
        return preco;
    }
}
