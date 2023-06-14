import ru.netology.services.CalculateService;

public class Main {
    public static void main(String[] args) {
        CalculateService calculation = new CalculateService();

        int months = calculation.calculate(100_000,3_000,20_000);
        System.out.println("Месяцев отдыха " + months);

    }
}