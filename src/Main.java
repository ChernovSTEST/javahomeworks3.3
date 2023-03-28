public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1 = service.calculate(1_000_000, 0.1, 12);
        System.out.println("Ежемесячный платеж: " + monthlyPayment1);
        double monthlyPayment2 = service.calculate(2_000_000, 0.15, 24);
        System.out.println("Ежемесячный платеж: " + monthlyPayment2);
        double monthlyPayment3 = service.calculate(3_000_000, 0.2, 36);
        System.out.println("Ежемесячный платеж: " + monthlyPayment3);
    }
}