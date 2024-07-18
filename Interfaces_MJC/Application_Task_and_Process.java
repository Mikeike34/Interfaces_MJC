

public class Application_Task_and_Process {

	public static void main(String[] args) {
		
		Task clean = new Task("cleaning");
		Process manage = new Process("MAN467");
		
		System.out.println("Process Object\n==================");
		System.out.println("Process ID: "+manage.getProcessID());
		System.out.println("Current priority: "+manage.getPriority());
		manage.setProcessID("MNG986");
		System.out.println("Process ID: "+manage.getProcessID());
		manage.setPriority(10);
		System.out.println("Current priority: "+manage.getPriority());
		
		Process convert = new Process("CNV479");
		System.out.println("When comparing the priority of process manage to process convert: "+manage.compareTo(convert));
		
		
		System.out.println("\nTask Object\n==================");
		System.out.println(clean.getName());
		System.out.println("Current priority: "+clean.getPriority());
		System.out.println("Current status: "+clean.getStatus());
		clean.setStatus(Task.Status.COMPLETE);
		System.out.println("Current status: "+clean.getStatus());
		clean.setPriority(1);
		System.out.println("Current priority: "+clean.getPriority());
		
		Task sweep = new Task("sweeping");
		System.out.println("When comparing the priority of task clean to task sweep: "+clean.compareTo(sweep));
		
	
		

	}//end main

}//end class
