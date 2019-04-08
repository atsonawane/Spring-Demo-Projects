package beans;

public class Answer {
	private int id;
	private String name;
	private String sortBy;
	public Answer(int id, String name, String sortBy) {
		super();
		this.id = id;
		this.name = name;
		this.sortBy = sortBy;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", sortBy=" + sortBy + "]";
	}
	
	
	
}
