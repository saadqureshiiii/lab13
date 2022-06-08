package lab5;
class printer {	
	int total = 10;	
	void printing_pages(String name, int print_pages)
	{
		if (total >= print_pages) {
			System.out.println(name + " Printing "
							+ print_pages);
			total = total - print_pages;
			System.out.println("Pages after Printing: "+ total);
			try {	
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println(name+ " you can not Printing pages  "+print_pages);
			System.out.println("your current pages is: " + total);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void add_pages(String name, int add_pages)
	{
		System.out.println(name + " Add pages " + add_pages);
		total = total + add_pages;
		System.out.println("Pages after adding: "+ total);		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer obj = new printer();
		obj.printing_pages("Printer HP90", 11);
		System.out.println("");
		obj.add_pages("Printer HP90", 5);
		
	}

}