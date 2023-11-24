public class Airpur {
    //declar Year of manufacture
    public static int year = 2020;

    //declar name of this airpurifier
    public static String name = "AirGod1";

    //declar number of this airpurifier
    public static int number = 696969;

    //show age of this airpurifier
    public static void myAge(){
        int currentYear = 2023;
        System.out.println("now my age is " +(currentYear - year) +" years");
    }

    //instance variables
    private boolean turnStatus =false;
    private double pm =0.0;
    private int fanSpeed =0;
    private int inStatus =100;

    // Constructor to initialize the instance variables
    public Airpur(boolean turnStatus, double pm, int fanSpeed, int inStatus){
        this.turnStatus = turnStatus;
        this.pm =pm;
        this.fanSpeed=fanSpeed;
        this.inStatus=inStatus;
    }

    //instance method for check is this on or off
    public void turnAir(){
        this.turnStatus = !turnStatus;
    }

    //instance method for update pm value
    public void updatePm(double newPm){
        this.pm = newPm;
    }

    //instance method for update fanspeed
    public void changeSpeed(int newSpeed){
        this.fanSpeed = newSpeed;
    }

    //instance method for update inside status
    public void showInsideStatus(int newStatus){
        this.inStatus= newStatus;
    }

    //to display new information
    public void displayInfo(){
        System.out.println("hello! this is "+ name);
        myAge();
        System.out.println("my id is "+ number);
        if(this.turnStatus){
            System.out.println("I am turning on");
        }
        else{
            System.out.println("I am turning off");
        }
        System.out.println("number of pm is "+ this.pm);
        System.out.println("fanspeed is  "+ this.fanSpeed);
        System.out.println("inside status is "+ this.inStatus +"%");
    }

    public static void main(String[] args){
        //put new information
        Airpur remote1 = new Airpur(true, 200, 3, 60);

        //show by using displayInfo()
        remote1.displayInfo();

    }

}

