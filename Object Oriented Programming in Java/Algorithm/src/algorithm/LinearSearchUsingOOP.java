package algorithm;
import java.util.*;

class Airpot{
	private String country;
	private String city;
	private String code;

	public Airpot(String country, String city, String code) {
        this.country = country;
        this.city = city;
        this.code = code;
    }

	public String getCountry(){
		return country;
	}
	public String getCity(){
		return city;
	}
	public String getCode(){
		return code;
	}
	public static  String toFindUsingLS(String find, Airpot[] airport){

		int index = 0;
		while(index < airport.length){
			Airpot curr = airport[index];
			if(find.equals(curr.getCity())){
				return curr.getCode();
			}
			index++;
		}
		return null;
	}

	public static String toFindUsingBS(String find,Airpot[] airport){

		int low = 0;
		int high = airport.length-1;
		int mid ;
		while(low <= high){
			mid = low +(high-low/2);
			int compare = find.compareTo(airport[mid].getCity());
			if(compare < 0){
				high = mid -1;
			}
			else if(compare > 0){
				low = mid + 1;
			}
			else{
				return airport[mid].getCode();
			}
		}
		return null;
	}

}

public class LinearSearchUsingOOP {

	public static void main(String[] args) {
		
		Airpot[] airpot = {new Airpot("PAK","KHI","PKR"),new Airpot("IND","Bom","INR")}; 
		Arrays.sort(airpot);
		// String result = Airpot.toFindUsingLS("KHI",airpot);
		String bs = Airpot.toFindUsingBS("KHI", airpot);
		// System.out.println(result);
		System.out.println(bs);
	}

}



