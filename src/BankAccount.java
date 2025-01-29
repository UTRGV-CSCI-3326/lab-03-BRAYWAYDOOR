public class BankAccount{
    public static void main(String args[]){
        //starting balance
        double balance = 2175.37;
        balance -= 302.50;
        balance += 50.03;
        balance /= 2;
        balance += 20;
        balance -= 1;
        balance *= 2;
        balance += 1;
        //limits the final balance to two decimal points.
        double finalBalance = Math.round(balance * 100.0) / 100.0;
        System.out.println("$" + finalBalance + " <- This is Bob's current balance.");
    }
}
