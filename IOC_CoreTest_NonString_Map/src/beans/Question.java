package beans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answer,User> answers;
	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displyInfo()
	{
		System.out.println("Question ID: "+id);
		System.out.println("Question Name :"+name);
		System.out.println("Answers...");
		Set <Entry<Answer,User>> set = answers.entrySet();
		Iterator<Entry<Answer,User>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Answer,User> entry = itr.next();
			System.out.println("Answer Information - "+entry.getKey());
			System.err.println("Posted by - "+entry.getValue());
		}
		
	}
}
