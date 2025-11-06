import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("========= UTILITÁRIOS DE DATA E HORA =========");

        LocalDateTime agora = LocalDateTime.now();
        LocalDate inicioProjeto = LocalDate.of(2025, 1, 20);
        LocalDate fimProjeto = LocalDate.of(2025, 3, 15);
        int ano1 = 2024;
        int ano2 = 2025;

        System.out.println("\n--- Teste 1: Formatação de Datas ---");

        System.out.println("Data/Hora Atual (Padrão BR): " +
                UtilitariosDataHora.formatar(agora, "dd/MM/yyyy HH:mm:ss"));

        System.out.println("Data Início (Padrão ISO): " +
                UtilitariosDataHora.formatar(inicioProjeto, "yyyy-MM-dd"));

        System.out.println("Data Fim (Por Extenso): " +
                UtilitariosDataHora.formatar(fimProjeto, "d 'de' MMMM 'de' yyyy"));

        System.out.println("\n--- Teste 2: Diferença em Dias ---");

        System.out.println("Início do Projeto: " +
                UtilitariosDataHora.formatar(inicioProjeto, "dd/MM/yyyy"));

        System.out.println("Fim do Projeto: " +
                UtilitariosDataHora.formatar(fimProjeto, "dd/MM/yyyy"));

        long dias = UtilitariosDataHora.diferencaEmDias(inicioProjeto, fimProjeto);
        System.out.println("Duração do Projeto (dias): " + dias);

        long diasInvertido = UtilitariosDataHora.diferencaEmDias(fimProjeto, inicioProjeto);
        System.out.println("Diferença invertida (deve ser negativa): " + diasInvertido);

        System.out.println("\n--- Teste 3: Verificação de Ano Bissexto ---");

        System.out.println("O ano " + ano1 + " é bissexto? " +
                UtilitariosDataHora.eAnoBissexto(ano1));

        System.out.println("O ano " + ano2 + " é bissexto? " +
                UtilitariosDataHora.eAnoBissexto(ano2));

        System.out.println("A data " + inicioProjeto + " está em ano bissexto? " +
                UtilitariosDataHora.eAnoBissexto(inicioProjeto));

        System.out.println("\n========= TESTES CONCLUÍDOS =========");
    }
}