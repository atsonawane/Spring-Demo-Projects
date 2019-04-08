package beans;

import java.util.Date;

public class Answer {
	private int id;
	private String answer;
	private Date postDate;
	public Answer(int id, String answer, Date postDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postDate = postDate;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postDate=" + postDate + "]";
	}
	
	
	
}
