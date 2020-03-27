import java.util.*;

public class Worker implements Comparable<Worker>{

	String name;
	int years;
	String title;
	String branch;
	public static final Comparator<Worker> BY_NAME = new ByName();
	public static final Comparator<Worker> BY_YEARS = new ByYears();
	public static final Comparator<Worker> BY_TITLE = new ByTitle();
	public static final Comparator<Worker> BY_BRANCH = new ByBranch();

	public Worker(String name, int years, String title, String branch){

		this.name = name;
		this.years = years;
		this.title = title;
		this.branch = branch;
	}

	public Worker(String line){

		String[] items = line.split(",");
		this.name = items[0];
		this.years = Integer.parseInt(items[1]);
		this.title = items[2];
		this.branch = items[3];
	}

	public int compareTo(Worker other){
		return this.years - other.years;
	}

	public String toString(){
		return name + ", " + years + ", " + title + ", " + branch;
	}

	static class ByName implements Comparator<Worker>{
		public int compare(Worker first, Worker second){
			return first.name.compareTo(second.name);
		}
	}

	static class ByYears implements Comparator<Worker>{
		public int compare(Worker first, Worker second){
			return first.years - second.years;
		}
	}

	static class ByTitle implements Comparator<Worker>{
		public int compare(Worker first, Worker second){
			return first.title.compareTo(second.title);
		}
	}
	static class ByBranch implements Comparator<Worker>{
		public int compare(Worker first, Worker second){
			return first.branch.compareTo(second.branch);
		}
	}


}