import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class A {
    private String n;
    private double b;
    private List<String> t;

    public A(String n, double b) {
        this.n = n;
        this.b = b;
        this.t = new ArrayList<>();
        t.add("Account created with balance: " + b);
    }

    public void d(double x) {
        if (x > 0) {
            b += x;
            t.add("Deposited: " + x + " | Balance: " + b);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void w(double x) {
        if (x > 0 && x <= b) {
            b -= x;
            t.add("Withdrawn: " + x + " | Balance: " + b);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double g() {
        return b;
    }

    public void p() {
        System.out.println("Transaction History for " + n + ":");
        for (String s : t) {
            System.out.println(s);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String n = s.nextLine();
        System.out.print("Enter Initial Balance: ");
        double b = s.nextDouble();

        A a = new A(n, b);

        int c;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            c = s.nextInt();

            switch (c) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double d = s.nextDouble();
                    a.d(d);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = s.nextDouble();
                    a.w(w);
                    break;
                case 3:
                    System.out.println("Current Balance: " + a.g());
                    break;
                case 4:
                    a.p();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (c != 5);

        s.close();
    }
}

