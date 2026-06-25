package sbi.insurance.login;

public class StudentService {
	private int rollNoi;
	private String name;
	private String city;
	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentService(int rollNoi, String name, String city) {
		super();
		this.rollNoi = rollNoi;
		this.name = name;
		this.city = city;
	}
	public int getRollNoi() {
		return rollNoi;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	 

}
