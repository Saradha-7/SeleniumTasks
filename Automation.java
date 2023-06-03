package week3.day1;

public class Automation extends MultipleLangauge {
	
	public void Java() {
		System.out.println("Java is a programming language");
	}
	
	public void Selenium() {
		System.out.println("Selenium is a open source tool");
	}
	public void python() {
		System.out.println("Python is very easy to learn");
	}
	@Override
	public void ruby() {
		System.out.println("Ruby also one of the programming language");
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();
		

	}

}
