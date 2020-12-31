package by.htp.task10.main.Airline;

public class ChartAirline {
	
	private Airline[] ai;
	private int Groupairline;
	
	
	public ChartAirline(int num){
		
		ai = new Airline[num];
		Groupairline = 0;
		
	}
	
	public void add (Airline a) {
		
		ai[Groupairline] = a;
		Groupairline++;

	}
	
	public void setAirline(Airline[] ai) {
		
		this.ai = ai;
	}
	
	public Airline[] getAirline() {
		
		return ai;
		
	}

}
