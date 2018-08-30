package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
public class Application {
    
		public int countwords(String words)
		{
			String[] seperateWords= StringUtils.split(words,' ');
			return(seperateWords==null)?0:seperateWords.length;
		}
		
		public void greet()
		{
			List<String> greetings =new ArrayList<>();
			greetings.add("HELLO");
			
			for(String greeting : greetings)
			{
				System.out.println("Greeting: "+greeting);
			}
		}
		public Application() 
		{
        System.out.println ("Inside Application");
		}
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application obj = new Application();
		obj.greet();
		int count =app.countwords("I have four words");
		System.out.println("Word Count: "+ count);
    }
}