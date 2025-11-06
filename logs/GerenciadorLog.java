import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorLog {

    private static DestinoLog destino = DestinoLog.CONSOLE;
    private static String NOME_ARQUIVO_LOG = "aplicacao.log";

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private GerenciadorLog() {
    }

    public static void setDestino(DestinoLog novoDestino) {
        destino = novoDestino;
    }

    public static void setArquivoLog(String nomeArquivo) {
        NOME_ARQUIVO_LOG = nomeArquivo;
    }

    public static void logInfo(String mensagem) {
        escreverLog("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        escreverLog("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        escreverLog("ERROR", mensagem);
    }

    private static void escreverLog(String nivel, String mensagem) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logFormatado = timestamp + " [" + nivel + "] " + mensagem;

        if (destino == DestinoLog.CONSOLE) {
            if (nivel.equals("ERROR")) {
                System.err.println(logFormatado);
            } else {
                System.out.println(logFormatado);
            }
        } else if (destino == DestinoLog.ARQUIVO) {
            try (PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(NOME_ARQUIVO_LOG, true)))) {

                out.println(logFormatado);
            } catch (IOException e) {
                System.err.println("ERRO CRÍTICO: Falha ao escrever no arquivo de log: " + e.getMessage());
                System.err.println(logFormatado);
            }
        }
    }
}