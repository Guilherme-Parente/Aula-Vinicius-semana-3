public class Mamifero extends Animal{
    protected boolean temPelo;

    public Mamifero(String nome, int idade, boolean temPelo) {
        super(nome, idade);
        this.temPelo = temPelo;
    }

    @Override
    public void comer() {
        System.out.println("Comendo!!!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tem pelo: " + (temPelo ? "sim" : "não"));
    }
}
