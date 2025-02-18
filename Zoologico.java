public class Zoologico {
    public static void main(String[] args) {
        Animal leao = new Leao("Simba", 7, true);

        leao.comer();
        leao.imprimir();
        System.out.println("------------------------");

        Animal Camaleão = new Camaleão( "Geraldo", 5, true);

        Camaleão.comer();
        Camaleão.imprimir();
        System.out.println("------------------------");

        Animal Pomba = new Pomba("Junior", 3, true);

        Pomba.comer();
        Pomba.imprimir();
    }
}
