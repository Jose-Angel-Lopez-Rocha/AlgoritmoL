public class GeneradorDeNumeros {
    public GeneradorDeNumeros(double a, double Xo, double C, double m, int cantidad) {
        if (m <= 0) {
            System.out.println("m debe ser mayor que 0");
            return;
        }
        double m1 = m - 1;
        for (int i = 0; i < cantidad; i++) {
            double mod = (Xo * a) + C;
            double MOD = mod % m;
            double ri = MOD / m1;
            Xo = MOD;
            double rired = Math.round(ri * 10000.0) / 10000.0;
            System.out.println((i + 1) + " resultado: " + rired);
        }
    }
}