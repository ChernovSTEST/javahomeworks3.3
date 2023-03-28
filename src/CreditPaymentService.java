public class CreditPaymentService {
    public double calculate(int amount, double interestRate, int loanTerm) {
        double monthlyInterestRate = interestRate / 12;
        double coefficient = monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTerm)
                / (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);
        double monthlyPayment = amount * coefficient;
        return monthlyPayment;
    }
}