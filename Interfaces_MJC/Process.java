
public class Process implements Priority, Comparable<Process>{
	
	public String processID;
	public int priority;
	
	public Process() {
		processID = "";
		priority = MIN_PRIORITY;
	}//end empty-argument constructor
	
	public Process(String processID) {
		this.processID = processID;
		priority = MED_PRIORITY;
	}//end preferred constructor

	
	//getters and setters
	
	public String getProcessID() {
		return processID;
	}//end getProcessID

	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcessID

	public int getPriority() {
		return priority;
	}//end getPriority
	
	
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	
	
	//toString
	
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString

	
	//unsure why this is needed, but Eclipse would not let me move on without this method.
	
		

	//compareTo
	@Override
	public int compareTo(Process o) {
		if(this.getPriority() == o.getPriority()) return 0;
		
		else if(this.getPriority() > o.getPriority()) return 1;
		
		else return -1;
	}//end compareTo


}//end class
