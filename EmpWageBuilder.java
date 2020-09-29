public class EmpWageBuilder{
    public static final int IS_PART_TIME=2;
    public static final int IS_FULL_TIME=1;
    public static final int RATE_PER_HOUR=20;
    public static final int NO_OF_WORKING_DAYS=20;

   public static void main(String[] args){
     System.out.println("Welcome to Employee Wage Computation Program");

      int empHours=0;
      int empWage=0;
      int totalEmpWage=0;

    for(int day=0; day<NO_OF_WORKING_DAYS; day++){

      double attendence = Math.floor(Math.random()*10) % 3;
           switch ((int)attendence){
                 case IS_FULL_TIME:
                      empHours=8;
                      break;
                 case IS_PART_TIME:
                      empHours=4;
                      break;
                 default :
                      empHours=0;
                 }
 
         empWage = empHours * RATE_PER_HOUR;
         totalEmpWage+= empWage;
         }
        System.out.println("Employee Wage for 20 Working Days : " + totalEmpWage);
    
    }
 }

