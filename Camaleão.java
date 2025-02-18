public class Camaleão extends Reptil {
    private boolean Sobrevivente;

    public Camaleão(String nome, int idade, boolean Sobrevivente) {
        super(nome, idade, true, true, false);
        this.Sobrevivente = Sobrevivente ;
    }

    @Override
    public void comer() {
        System.out.println ("Se alimenta de insetos,plantas,frutas e alguns roedores");

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Sua maior caracteristica é: Camuflagem");
    }
}

