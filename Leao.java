public class Leao extends Mamifero{
    private boolean juba;

    public Leao(String nome, int idade, boolean juba) {
        super(nome, idade, true);
        this.juba = juba;
    }

    @Override
    public void comer() {
        System.out.println("Se alimenta de carne!!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Possui Juba: " + (juba ? "Sim" : "Não"));

        System.out.println("Simba é triste pois o pai foi morto pelo tio");
    }
}
