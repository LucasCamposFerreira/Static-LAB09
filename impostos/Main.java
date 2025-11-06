public class Main {

    public static void main(String[] args) {
        System.out.println("========= CALCULADORA DE IMPOSTOS ESTÁTICA =========");

        double valorVendaProduto = 1500.00;
        double valorServicoPrestado = 4000.00;
        double salarioFuncionarioA = 8000.00;
        double salarioFuncionarioB = 2100.00;

        System.out.println("\n--- Teste ICMS ---");
        double icms = CalculadoraImpostos.calcularICMS(valorVendaProduto);
        System.out.printf("Base de Cálculo ICMS: R$ %.2f | Imposto Devido: R$ %.2f\n", valorVendaProduto, icms);

        System.out.println("\n--- Teste ISS ---");
        double iss = CalculadoraImpostos.calcularISS(valorServicoPrestado);
        System.out.printf("Base de Cálculo ISS: R$ %.2f | Imposto Devido: R$ %.2f\n", valorServicoPrestado, iss);

        System.out.println("\n--- Teste IRRF (Salário Alto) ---");
        double irrf_A = CalculadoraImpostos.calcularIRRF(salarioFuncionarioA);
        System.out.printf("Base de Cálculo IRRF: R$ %.2f | Imposto Devido: R$ %.2f\n", salarioFuncionarioA, irrf_A);

        System.out.println("\n--- Teste IRRF (Salário Isento) ---");
        double irrf_B = CalculadoraImpostos.calcularIRRF(salarioFuncionarioB);
        System.out.printf("Base de Cálculo IRRF: R$ %.2f | Imposto Devido: R$ %.2f\n", salarioFuncionarioB, irrf_B);

        System.out.println("\n========= TESTES CONCLUÍDOS =========");
    }
}