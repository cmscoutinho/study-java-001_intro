package ex_02_14;

public class Ex02 {
    public static void main(String[] args) {
        double varDouble = 3.4;
        int varInt = (int) varDouble;

        System.out.println(String.format("%.2f após o casting: %d.",varDouble,varInt));
    }
}
