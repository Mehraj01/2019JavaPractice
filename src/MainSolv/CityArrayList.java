package MainSolv;
import java.util.ArrayList;
public class CityArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>city= new ArrayList<>();
		
		city.add("Baku");
		city.add("Boston");
		city.add("New York");
		city.add("Chicago");
		city.add("Miami");
		city.add("London");
		city.add("Paris");
		city.add("Tokyo");
		city.add("Moskva");
		city.add("Istanbul");
		city.add("Berlin");
		
		int count=0;
		String a="";
		for( String d : city){
			a+=d;
			count++;
			System.out.print(d+"*|*");
		}
		System.out.println();
		System.out.println("Count of cities are:........"+count+" cities in city ArrayList.");
		
		ArrayList<String>longName= new ArrayList<>();
		System.out.println(longName.isEmpty());
		
		for ( int i=0; i<city.size(); i++){
			if(city.get(i).length()>6){
				longName.add(city.get(i));
			}
		}
		
		System.out.println("Cities longer than 6 char........"+longName);
	
	
		
	}
		public int size(){
		CityArrayList city = null;
		int countOfCity=city.size();
		System.out.println(countOfCity);
		return countOfCity;

		
	}
	

}
