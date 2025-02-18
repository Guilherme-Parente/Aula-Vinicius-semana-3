public class Pomba extends Ave{
    private boolean cabecaPequena;

    public Pomba(String nome, int idade, boolean cabecaPequena) {
        super(nome, idade, true, true);
        this.cabecaPequena = cabecaPequena;
    }

    @Override
    public void comer() {
        System.out.println("Se alimenta de graos e sementes!!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Possui a cabeça pequena: " + (cabecaPequena ? "Sim" : "Não"));
    }
}
