import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilitariosDataHora {

    private UtilitariosDataHora() {
    }

    public static String formatar(LocalDateTime dataHora, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return dataHora.format(formatter);
    }

    public static String formatar(LocalDate data, String padrao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(padrao);
        return data.format(formatter);
    }

    public static long diferencaEmDias(LocalDate dataInicio, LocalDate dataFim) {
        return ChronoUnit.DAYS.between(dataInicio, dataFim);
    }

    public static boolean eAnoBissexto(int ano) {
        return Year.isLeap(ano);
    }

    public static boolean eAnoBissexto(LocalDate data) {
        return data.isLeapYear();
    }
}