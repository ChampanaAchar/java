class VoterId{
static String enrolledAs;
static boolean isage;
static String dob;
static String fatherName;
static String motherName;
static String place;
 public static int applicationForm(String name,boolean year,String birthDate,String father,String mother,String taluk){
 int date=21;
 enrolledAs=name;
 isage=year;
 dob=birthDate;
 fatherName=father;
 motherName=mother;
 place=taluk;
 return date;
 }
 
  public static int getDetails(){
  int detailPrintAt=12;
  System.out.println("Name of the person :"+enrolledAs);
  System.out.println("Age is above:"+isage);
  System.out.println("Birth Date:"+dob);
  System.out.println("Father name is:"+fatherName);
  System.out.println("Mother name is:"+motherName);
  System.out.println("Place of submission:"+place);
  return detailPrintAt;
  }
}