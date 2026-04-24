public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 4);
        Moto moto = new Moto("MOTO-01", 50.0, true);

        PacoteEntrega p1 = new PacoteEntrega("BR999", 10.5, "Pendente");
        PacoteEntrega p2 = new PacoteEntrega("BR100", 5.0, "Pendente");

        Rota r1 = new Rota(p1, caminhao);
        Rota r2 = new Rota(p2, moto);

        System.out.println(caminhao);
        System.out.println(moto);
        System.out.println(p1);
        System.out.println(p2);

        r1.entregar();
        r2.entregar();
    }
}

