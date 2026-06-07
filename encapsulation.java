class BankAccount {
    // প্রাইভেট ভ্যারিয়েবল, বাইরে থেকে সরাসরি পরিবর্তন করা যাবে না
    private double balance;

    // Setter মেথড (ডেটা সেট বা আপডেট করার জন্য)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid!");
        }
    }

    // Getter মেথড (ডেটা দেখার জন্য)
    public double getBalance() {
        return balance;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // account.balance = 5000; -> এভাবে সরাসরি অ্যাক্সেস করলে এরর আসবে।
        
        account.deposit(5000); // সঠিক নিয়ম
        System.out.println("Balance : " + account.getBalance()); // আউটপুট: ব্যালেন্স: 5000.0
    }
}
