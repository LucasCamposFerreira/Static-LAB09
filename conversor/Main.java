public class Main {
    public static void main(String[] args) {
        System.out.println("========= CONVERSOR DE MOEDAS ESTÁTICO =========");
        System.out.println("--- Câmbio Inicial (Taxas Padrão) ---");

        double valorBRL = 1000.00;
        double valorUSD = 500.00;
        double valorEUR = 250.00;

        System.out.printf("R$ %.2f = US$ %.2f\n", valorBRL, ConversorMoeda.realParaDolar(valorBRL));
        System.out.printf("US$ %.2f = R$ %.2f\n", valorUSD, ConversorMoeda.dolarParaReal(valorUSD));
        System.out.printf("US$ %.2f = € %.2f\n", valorUSD, ConversorMoeda.dolarParaEuro(valorUSD));
        System.out.printf("€ %.2f = US$ %.2f\n", valorEUR, ConversorMoeda.euroParaDolar(valorEUR));
        System.out.printf("R$ %.2f = € %.2f\n", valorBRL, ConversorMoeda.realParaEuro(valorBRL));
        System.out.printf("€ %.2f = R$ %.2f\n", valorEUR, ConversorMoeda.euroParaReal(valorEUR));
        System.out.println("\n--- Câmbio Atualizado (Dólar subiu, Euro enfraqueceu) ---");
        ConversorMoeda.atualizarTaxas(5.80, 0.95);
        System.out.printf("R$ %.2f = US$ %.2f\n", valorBRL, ConversorMoeda.realParaDolar(valorBRL));
        System.out.printf("US$ %.2f = R$ %.2f\n", valorUSD, ConversorMoeda.dolarParaReal(valorUSD));
        System.out.printf("US$ %.2f = € %.2f\n", valorUSD, ConversorMoeda.dolarParaEuro(valorUSD));
        System.out.printf("€ %.2f = R$ %.2f\n", valorEUR, ConversorMoeda.euroParaReal(valorEUR));
    }
}