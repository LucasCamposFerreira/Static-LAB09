public class Main {

    public static void main(String[] args) {
        System.out.println("========= GERENCIADOR DE LOGS ESTÁTICO =========");

        System.out.println("\n--- Teste 1: Logando no CONSOLE (Padrão) ---");

        GerenciadorLog.logInfo("Aplicação iniciada.");
        GerenciadorLog.logWarn("Módulo de cache está desativado.");
        GerenciadorLog.logError("Falha ao conectar no banco de dados.");

        System.out.println("\n--- Teste 2: Mudando destino para ARQUIVO ---");

        GerenciadorLog.setDestino(DestinoLog.ARQUIVO);
        GerenciadorLog.setArquivoLog("sistema.log");

        System.out.println("Destino do log alterado para 'sistema.log'.");

        GerenciadorLog.logInfo("Iniciando processamento em lote.");
        GerenciadorLog.logInfo("Lote 1/10 processado.");
        GerenciadorLog.logWarn("Item 'SKU-123' não encontrado no estoque.");
        GerenciadorLog.logError("Falha crítica no processamento do lote 2.");
        GerenciadorLog.logInfo("Processamento finalizado com erros.");

        System.out.println("\nVerifique o arquivo 'sistema.log' na pasta do projeto.");
        System.out.println("========= TESTES CONCLUÍDOS =========");
    }
}