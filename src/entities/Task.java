package entities;

public class Task extends Lesson   {

	private String description;
	private int questioncount;
	
	public Task() {
	}
	
	public Task(String title, String description, int questioncount) {
		super(title);
		this.description = description;
		this.questioncount = questioncount;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuestioncount() {
		return questioncount;
	}

	public void setQuestioncount(int questioncount) {
		this.questioncount = questioncount;
	}

	@Override
	public int duration() {
		int seconds =0;
	    seconds = getQuestioncount() * (5 * 60);
	    return seconds;
	}

	

}
