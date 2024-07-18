
public class Task implements Priority, Comparable<Task> {
	
	//Define the Status enum
	enum Status{NOT_STARTED, IN_PROCESS, COMPLETE}
	
	private final String name;
	private int priority;
	private Status status;
	
	public Task() {
		name = "";
		priority = MIN_PRIORITY;
	}//end empty-argument Constructor

	public Task(String taskName) {
		
		name= taskName;
		priority = MED_PRIORITY;
		status = Status.NOT_STARTED; //initialize status
	}//end preferred constructor
	
	
	//getters and setters
	public Status getStatus() {
		return status;
	}//end getStatus
	
	public void setStatus(Status status) {
		this.status = status;
	}//end setStatus

	public String getName() {
		return name;
	}//end getName
	
	
	public int getPriority() {
		return priority;
	}//end getPriority

	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority


	//toString
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString

	//compareTo
	@Override
	public int compareTo(Task o) {
		if(this.getPriority() == o.getPriority()) return 0;
		
		else if(this.getPriority() > o.getPriority()) return 1;
		
		else return -1;
	}//end compareTo


}//end class
