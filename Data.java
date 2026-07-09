import java.util.Random;
import java.util.Scanner;

public class Data
{
    String[] accountNumber = {"0101-123", "0101-456", "0101-789", "0101-012", "0101-345"};
    String[] accountTitle= {"Mr. Ali", "Mr. Ahmed", "Mr. Raza", "Mr. Huzaifa", "Mr. Umair"};
    public int[] accountPin = {1234, 5678, 9012, 3456, 7890};
    double[] accountBalance = {50000.0, 60000.0, 70000.0, 80000.0, 90000.0};
    String account_Number;
    int account_pin;
    int custemer;
    boolean pinCorrect; 
    public int manuOption; 
    String resiverAccountNumber;
    double amountToTransfer;
    int resivercustumer;
    double depositAmount;
    double withdrawAmount;
    boolean recipt;
    String otp;
    String userOtp;
    boolean detailNotFound;
    // String userOtp1;

    double balance;
    double transfer;
    double transforAmmount;
}

class Function extends Data
{

    public Function() 
    {
        System.out.println("---------Bank ATM--------");
    }
    
    public void clrscr()
    {
        System.out.print("\033[H\033[2J");
    }
    //otp generate
    public void OTP() {
        String allChars = "0123456789";

        //int length = 4; // length of the password
        String password = new String();
        Random r = new Random();

        for (int i=0; i<3; i++) {
            // Generate a random index between 0 (inclusive) and allChars.length() (exclusive)
            int index = r.nextInt(allChars.length());
            
            // Get the character at the random index and append it to the password
            password += allChars.charAt(index);
        }

        System.out.println(" One Time OTP: " + password);
        this.otp = password;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter OTP Here: ");
        this.userOtp = sc.nextLine();
        // return(password);
        // CheckDetails();
    }

    public void Details()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        this.account_Number = sc.nextLine();

        System.out.print("Account Pin: ");
        this.account_pin = sc.nextInt();
        
        OTP();

        // System.out.print("Enter OTP Here: ");
        // this.userOtp = sc.nextLine();

        CheckDetails();
    }

    public void CheckDetails()
    {
        int i=0;
        // this.detailNotFound = false;
        while(i<5)
        {
            if(this.account_Number.equals(this.accountNumber[i]))
            {
                // this.detailNotFound = true;
                this.pinCorrect = false;
                if (this.account_pin == this.accountPin[i]) 
                {
                    if (this.userOtp.equals(this.otp)) 
                    {
                        System.out.println("Login Succesfull---------");
                        System.out.println("-------------------------");
                        System.out.println("Hello.! " + this.accountTitle[i]);
                        System.out.println("-------------------------");
                        this.pinCorrect = true;
                        this.custemer = i;
                        return;
                    }
                    // else 
                    // {
                    //     System.out.println("Re-Try OTP: ");
                    //     OTP();
                    //     break;
                    // }
                }
                else if(!this.pinCorrect)
                {
                    System.out.println("Invalid Account Pin. \n > Re-enter Pin.");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Account Pin: ");
                    this.account_pin = sc.nextInt();

                    CheckDetails();
                    return;
                }
            }
            
            else
            {
                // break;
                // Scanner sc = new Scanner(System.in);
                
                // System.out.print("Account Number: ");
                // this.account_Number = sc.nextLine();
        
                // System.out.print("Account Pin: ");
                // this.account_pin = sc.nextInt();
                // CheckDetails();
                // Details();
                // return;
            }
            // Details();
            i++;
            // continue;
            // clrscr();
        }
        System.out.println("No Detals Found.. \n > Check Your Account Number or Pin.");
        Details();
    }

    public void Manu()
    {
        System.out.println("Manu: \n1) balance Check\n2) Money Transfer\n3) Deposit\n4) Withdraw\n5) Leave ATM \n6) Exist");
        Scanner sc = new Scanner(System.in);
        System.out.println("> Select Any Option.\n-------------------");
        this.manuOption = sc.nextInt();
        clrscr();
        Click();
    }

    public void Click()
    {
        Scanner sc = new Scanner(System.in);
        if(this.manuOption == 1)
        {
            System.out.print("Current Balance is: ");
            System.out.println(this.accountBalance[this.custemer]);
            Manu();
            return;
        }
        
        else if(this.manuOption == 2)
        {
            
            begin:
            for (int j=1; j<3;) 
            {
                System.out.print("Resiver Account Number: ");
                this.resiverAccountNumber = sc.nextLine();
                for (int i=0; i<5; i++) 
                {
                    if(this.resiverAccountNumber.equals(this.accountNumber[i]))
                    {
                        System.out.println("Resiver Account Title: " + this.accountTitle[i]);
                        System.out.print("Amount To Transfer: ");
                        this.amountToTransfer = sc.nextDouble();

                        this.recipt = true;
                        this.resivercustumer = i;
                        this.accountBalance[this.custemer] = this.accountBalance[this.custemer] - this.amountToTransfer;
                        this.accountBalance[i] = this.accountBalance[i] + this.amountToTransfer;
                        Recipt();
                        Manu();
                        return;
                    }
                }
                System.out.println("Account Not Found.\n > Re-enter.");
                continue begin;
            }
            // System.out.println(this.accountBalance[this.custemer]);
        }
        DepositandWithdraw();
    }

    public void DepositandWithdraw()
    {
        if(this.manuOption == 3)
        {
            System.out.print("Enter Deposit Amount: ");
            Scanner sc = new Scanner(System.in);
            this.depositAmount = sc.nextDouble();

            this.accountBalance[this.custemer] += this.depositAmount;
            Manu();
            return;
        }
        else if(this.manuOption == 4)
        {
            System.out.print("Enter Withdrawal Amount: ");
            Scanner sc = new Scanner(System.in);
            this.withdrawAmount = sc.nextDouble();

            this.accountBalance[this.custemer] -= this.withdrawAmount;
            Manu();
            return;
        }
        else if(this.manuOption == 5)
        {
            Details();
            Manu();
        }
        else if(this.manuOption == 6)
        {
            System.exit(0);
            return;
        }
        else 
        {
            System.out.println("Invalid Option Re-enter(1 to 5).");
            Manu();
            return;
        }
    }

    public void Recipt()
    {
        if (this.recipt) 
        {
            System.out.println("----------------------------");
            System.out.println("-  Transcation Succesfull  -");
            System.out.println("- From:                    -");
            System.out.println("- " + this.accountTitle[this.custemer] + "  " + "A/N: " + this.accountNumber[this.custemer]);
            System.out.println("- To:                      -");
            System.out.println("- " + this.accountTitle[this.resivercustumer] + "  " + "A/N: " + this.accountNumber[this.resivercustumer]);
            System.out.println("---------------------------");
            clrscr();
            Manu();
            return;
        }
        // else
        // {
        //     Manu();
        // }
    }
}
