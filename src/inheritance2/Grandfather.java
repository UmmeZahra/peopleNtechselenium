package inheritance2;

public class Grandfather {
	 String FirstName;
	 static String LastName = "Hussain";
	 static String Lenguage = "Bangla";
	 String Skintone;
	 String HairColor;
	 int age;
	 int hight;
	 
	 	public String getname(){
			return FirstName;
		}
		public void setname(String FirstName ){
			this.FirstName = FirstName;
		}
	    public void lastname()
	    {
	        System.out.println(LastName);
	    }
		public void skintone() {
			Skintone = "drak teen";
			System.out.println(Skintone);
		} 
}
