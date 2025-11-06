public class ConversorMoeda {
    private static double TAXA_USD_PARA_BRL = 5.40; // 1 Dólar = 5.40 Reais
    private static double TAXA_USD_PARA_EUR = 0.92; // 1 Dólar = 0.92 Euros

    private ConversorMoeda() {
    }

    public static void atualizarTaxas(double novaTaxaUsdParaBrl, double novaTaxaUsdParaEur) {
        System.out.println("[Conversor] Atualizando taxas...");
        ConversorMoeda.TAXA_USD_PARA_BRL = novaTaxaUsdParaBrl;
        ConversorMoeda.TAXA_USD_PARA_EUR = novaTaxaUsdParaEur;
        System.out.println("[Conversor] Novas taxas: 1 USD = " + novaTaxaUsdParaBrl + " BRL | 1 USD = " + novaTaxaUsdParaEur + " EUR");
    }

    public static double realParaDolar(double valorReal) {
        return valorReal / TAXA_USD_PARA_BRL;
    }

    public static double dolarParaReal(double valorDolar) {
        return valorDolar * TAXA_USD_PARA_BRL;
    }

    public static double dolarParaEuro(double valorDolar) {
        return valorDolar * TAXA_USD_PARA_EUR;
    }

    public static double euroParaDolar(double valorEuro) {
        return valorEuro / TAXA_USD_PARA_EUR;
    }

    public static double realParaEuro(double valorReal) {
        double valorEmDolar = realParaDolar(valorReal);
        return dolarParaEuro(valorEmDolar);
    }

    public static double euroParaReal(double valorEuro) {
        double valorEmDolar = euroParaDolar(valorEuro);
        return dolarParaReal(valorEmDolar);
    }
}