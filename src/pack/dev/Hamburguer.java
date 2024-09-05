package pack.dev;

class Hamburguer implements Preco {
    private Double preco = 15.50;

    @Override
    public Double passarPreco() {
        return preco;
    }
}
