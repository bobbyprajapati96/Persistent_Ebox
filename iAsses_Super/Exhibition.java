package iAsses_Super;

public class Exhibition extends Event {
   public Exhibition(String name,String detail,String type,String ownerName,double costPerDay,int noOfStall) {
	 super(name,detail,type,ownerName,costPerDay);
	 this.noOfStall=noOfStall;
   }


private int noOfStall;
}
