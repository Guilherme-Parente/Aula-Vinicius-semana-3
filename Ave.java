public class Ave extends Animal{
    protected boolean temPelo;
    protected boolean podeVoar;

    public Ave(String nome, int idade, boolean temPelo, boolean podeVoar) {
        super(nome, idade);
        this.temPelo = temPelo;
        this.podeVoar = podeVoar;
    }

    @Override
    public void comer() {
        System.out.println("Comendo!!!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tem pelo: " + (temPelo ? "sim" : "não"));
        System.out.println("Pode voar " + (podeVoar ? "sim" : "não"));
    }
}
