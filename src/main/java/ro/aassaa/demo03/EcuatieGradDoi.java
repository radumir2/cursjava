package ro.aassaa.demo03;

public class EcuatieGradDoi {
    public static String rezolva(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Ecuatie nedefinita!";
                } else {
                    return "Ecuatie imposibila!";
                }
            } else {
                double x = -c / b;
                return String.format("Ecuatie de gradul 1 cu solutia: %.2f", x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta == 0) {
                return String.format("Ecuatie de gradul 2 cu solutia dubla: %.2f", -b / (2 * a));
            } else if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                return String.format("Ecuatie de gradul 2 cu doua solutii reale: %.2f si %.2f", x1, x2);
            } else {
                double parte_reala = -b / (2 * a);
                double parte_imaginara = Math.abs(Math.sqrt(-delta) / (2 * a));
                return String.format("Ecuatie de gradul 2 cu doua solutii complexe: %.2f - %.2fi, %.2f + %.2fi",
                        parte_reala, parte_imaginara, parte_reala, parte_imaginara);
            }
        }
    }
}