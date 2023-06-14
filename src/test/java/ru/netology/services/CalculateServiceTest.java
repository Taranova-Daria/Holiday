package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Month.csv")
    void shouldCalculateCalculateService(int expected,int income, int expenses,int threshold ) {
        CalculateService calculation = new CalculateService();
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);
    }
}