class AirConditioner{

static boolean isConnected=false;
static int currentVolume=0;
static int maxVolume=6;
static int minVolume=1;

public static void onOrOff(){
System.out.println("onOrOff method started");
isConnected=(isConnected==false)?true:false;
//if (!isConnected) ? isConnected=true:isConnected=false;
  //if (isConnected ==false){
 // isConnected=true;
  //System.out.println("AC is turned on");
 // }else if(isConnected==true){
 // isConnected=false;
 // System.out.println("AC is turned off");
System.out.println("onOrOff method ended");
	return;

  }
    
//}

public static void getFeatures(){
System.out.println("getFeatures method started");
String name="AC";
String brand="Samsung";
System.out.println("Name :"+name);
System.out.println("Brand name:" +brand);
System.out.println("getFeatures method ended");
return;


}
public static void increaseVolume() {
System.out.println("increaseVolume method started");
if (isConnected==true){
	System.out.println("AC is on... ");
if(currentVolume < maxVolume){
    currentVolume=currentVolume+1;
    System.out.println("The volume is increased to"+currentVolume);
}
else {
System.out.println("The volume is at maximum");
}
}
else{
	System.out.println("Switch on the AC ");
}
System.out.println("increaseVolume method ended");
return;
}

public static void decreaseVolume() {
System.out.println("decreaseVolume method started");
if (isConnected==true){
if(currentVolume > minVolume)
{
currentVolume=currentVolume-1;
System.out.println("The volume is decreased to"+currentVolume);
}
else
{
System.out.println("The volume is at minimum");
}
System.out.println("increaseVolume method ended");
System.out.println();
return;
}
}
}