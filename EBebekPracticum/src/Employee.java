import java.util.Scanner;

public class Employee {
	
	private String name;
	private double 	salary;
	private int workHours;
	private int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		if(this.salary < 1000) {
			return 0;
		}
		
		else  {
			return (salary*3/100);
		}
	}
	
	public double bonus(int workHours) {
		
		if(this.workHours > 40) {
			return ((workHours - 40)*30);
		}
		else {
			return 0;
		}
	}
	
	public double raiseSalary(int hireYear) {
		if(2021-hireYear < 10 && 2021-hireYear >= 0) {
			return (salary*5/100);
		}
		
		else if(2021 - hireYear >= 10 && 2021 - hireYear < 20) {
			return (salary * 10 / 100);
		}
		
		else if (2021 - hireYear >= 20){
			return (salary * 15 / 100);
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adı: " + name + " \nMaaşı: " + salary + " \nÇalışma Saati: " + workHours 
				+ " \nBaşlangıç yılı: " + hireYear;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Maaş Hesaplamana Sistemine Hoşgeldiniz");
		System.out.print("Lütfen isminizi giriniz:");
		String name = scanner.nextLine();
		System.out.print("Lütfen aylık maaşınızı giriniz: ");
		double salary = scanner.nextDouble();
		System.out.print("Lütfen haftalık çalışma saatinizi giriniz: ");
		int workHours = scanner.nextInt();
		System.out.print("Lütfen çalışmaya başladığınız yılı giriniz: ");
		int hireYear = scanner.nextInt();
		
		
		Employee employee1 = new Employee(name, salary, workHours, hireYear);
		System.out.println(employee1);
							
		double vergi = employee1.tax(salary);
		double bonusMaas = employee1.bonus(workHours);
		double maasArtisi = employee1.raiseSalary(hireYear);
		
		System.out.println("Vergi: " + vergi);
		System.out.println("Bonus: " + bonusMaas);
		System.out.println("Maaş artışı: " + maasArtisi);
		
		System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (salary -  vergi + bonusMaas));
		System.out.println("Toplam maaş: " +  (salary -  vergi + bonusMaas + maasArtisi));
		
	}
	
	
}
