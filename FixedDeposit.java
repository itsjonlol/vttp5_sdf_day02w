public class FixedDeposit extends BankAccount {

    private float interest; // static means can change only once?
    private Integer duration;

    public FixedDeposit(String holderName) {
        super(holderName);

        this.interest = 3.0f;
        this.duration = 6;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }



    @Override
    public void deposit(float amount) {
        System.out.println("Operation not allowed");

    }
   
    @Override
    public void withdraw(float amount) {
        System.out.println("Operation not allowed");
        
    }
    @Override
    public float getBalance() {
        //balance + interest viz if interest is 3 and balance is 100, the getBalance() should return 103; balance is private so use getter
        float total = this.getBalance() * ((this.interest/100.0f)+this.duration);
        return total;
    }

    // public void showAccountInfo() {
    //     System.out.println("Account No.  + this.getAccountNo()")
    // }
    


    
}
