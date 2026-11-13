public class PersonTest
{
	public static void main(String[] args)
	{
		Person alois = new Person("Alois", 2);
		
		alois.greeting();
		
		System.out.println(alois.getName() + " is a soupa cool name!");
		System.out.println(alois.getPets() + " pets is a good number of pets to have.");
	}
}
