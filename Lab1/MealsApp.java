
public class MealsApp {

	public static void main(String[] args) {
/*
		String day = "Saturday";
		String meal = "";
		switch (day) {
		case "Saturday":
		meal = "Soup";
		break;
		
		case "Sunday":
			meal = "Salad";
			break;
		}
		System.out.println(meal);
		//end of Task 4 part 4 (Switch statement)
		*/
		
		
		/*
		String day = "Saturday";
		String meal = "Salad";
		if(day.equals("Saturday"))
			meal = "Soup";
		else
			meal = "Salad";
		System.out.println(meal);
		//end of Task 4 Part 5 (if-else statement)
		*/
		
		String day = "Saturday";
		String meal = (day.equals("Saturday") ? "Soup" : "Salad");
		System.out.println(meal);
		//end of Task 4 Part 6 (Conditional Statement)
		
	}

	
	
}
