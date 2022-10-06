package kodlamaioDemo.core.Logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanýna kodlandý" + data);
		
	}

}
