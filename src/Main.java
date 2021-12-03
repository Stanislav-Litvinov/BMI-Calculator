public class Main {
    public static void main(String[] args) {
        BmiService bodyMassIndex = new BmiService();

        double bmiLow = bodyMassIndex.calculate(200, 43);
        System.out.println("ИМТ равен: " + bmiLow);

        double bmiMinimal = bodyMassIndex.calculate(170, 57);
        System.out.println("ИМТ равен: " + bmiMinimal);

        double bmiNormal = bodyMassIndex.calculate(174, 75);
        System.out.println("ИМТ равен: " + bmiNormal);

        double bmiOverWeight = bodyMassIndex.calculate(176, 82);
        System.out.println("ИМТ равен: " + bmiOverWeight);

        double bmiObesity1 = bodyMassIndex.calculate(175, 100);
        System.out.println("ИМТ равен: " + bmiObesity1);

        double bmiObesity2 = bodyMassIndex.calculate(175, 120);
        System.out.println("ИМТ равен: " + bmiObesity2);

        double bmiObesity3 = bodyMassIndex.calculate(175, 200);
        System.out.println("ИМТ равен: " + bmiObesity3);

    }
}
