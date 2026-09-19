abstract class Payment{
    abstract void pay();
    void paymentMessage(){
        System.out.println("Payment in processing .....");
    }
}
class UPI extends Payment{
    void pay(){
        System.out.println("Payment make using UPI!");
    }
}
class Card extends Payment{
    void pay(){
        System.out.println("Payment make using Card !");
    }
}
class pro1{
    public static void main(String[] args) {
        UPI u=new UPI();
        u.paymentMessage();
        u.pay();
        Card c=new Card();
        c.paymentMessage();
        c.pay();
    }

}