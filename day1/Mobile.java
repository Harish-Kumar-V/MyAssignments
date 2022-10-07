package week1.day1;

public class Mobile {
public void makeCall(String mobileModel, float mobileWeight) {
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
public void sendMsg(boolean isFullCharged, int mobileCost) {
	System.out.println(isFullCharged);
	System.out.println(mobileCost);
	}
public static void main(String[] args) {
	Mobile m=new Mobile();
	m.makeCall("This is my Mobile", 180.5f);
	m.sendMsg(true, 18000);
	}
}
