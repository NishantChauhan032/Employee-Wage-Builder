public class EmpWageBuilderArray {
  public static final int IS_PART_TIME=2;
  public static final int IS_FULL_TIME=1;

  private int numOfCompany = 0;
  private CompanyEmpWage[] companyEmpWageArray;
  
  public EmpWageBuilderArray(){
    companyEmpWageArray = new CompanyEmpWage[5];
  }

  private void addCompanyEmpWage(String company, int empRate, int numOfDays, int maxHrs){
    companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRate, numOfDays, maxHrs);
    numOfCompany++;
  }
   
  private void computeEmpWage(){
    for(int i=0; i<numOfCompany; i++){
       companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
       System.out.println(companyEmpWageArray[i]);
      }
  }
 
  private int computeEmpWage(CompanyEmpWage companyEmpWage){
   //variables 
  int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
  //computation
  while(totalEmpHrs <= companyEmpWage.maxHrs && totalWorkingDays<companyEmpWage.numOfDays){
	   totalWorkingDays++;
  
  int attendence = (int) Math.floor(Math.random() * 10 )%3;

    switch(attendence){
  
    case IS_PART_TIME:
         empHrs=4;
         break;
    case IS_FULL_TIME:
         empHrs=8;
         break;
    default:
         empHrs=0;
    }
    totalEmpHrs += empHrs;
    System.out.println("Day#: " + totalWorkingDays +" Emp Hr: "+empHrs);
   }
   return totalEmpHrs * companyEmpWage.empRate;
 }
 
 public static void main(String[] args){
   EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
   empWageBuilder.addCompanyEmpWage("D-Mart", 20 , 2, 10);
   empWageBuilder.addCompanyEmpWage("Reliance", 10 , 4 , 20);
   empWageBuilder.computeEmpWage();
 }
}
