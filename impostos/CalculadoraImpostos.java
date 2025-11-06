public class CalculadoraImpostos {

    private static final double ALIQUOTA_ICMS = 0.18;
    private static final double ALIQUOTA_ISS = 0.05;
    private static final double ALIQUOTA_IRRF = 0.275;
    private static final double LIMITE_ISENCAO_IRRF = 2259.20;

    private CalculadoraImpostos() {
    }

    public static double calcularICMS(double valorBase) {
        return valorBase * ALIQUOTA_ICMS;
    }

    public static double calcularISS(double valorBase) {
        return valorBase * ALIQUOTA_ISS;
    }

    public static double calcularIRRF(double valorBase) {
        if (valorBase <= LIMITE_ISENCAO_IRRF) {
            return 0.0;
        } else {
            return valorBase * ALIQUOTA_IRRF;
        }
    }
}