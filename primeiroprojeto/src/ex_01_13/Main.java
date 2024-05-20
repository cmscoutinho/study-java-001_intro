package ex_01_13;

public class Main {
    public static void main(String[] args) {
        double tempCelsius = 25.0;
        double tempFahrenheit;

        tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + ((int) tempFahrenheit));
    }
}
