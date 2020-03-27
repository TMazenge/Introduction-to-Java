import java.util.*;
import java.io.*; 

public class Workers{

	public static void main(String[] args){
		ArrayList<Worker> a = new ArrayList<Worker>();
		a.add(new Worker("Timothy", 4, "Manager", "Nashville"));
		a.add(new Worker("Noah", 10, "Secretary", "Detroit"));
		a.add(new Worker("Michael", 15, "Chair", "Virginia"));
		a.add(new Worker("Luke", 1, "Spokesperson", "Boston"));

		Collections.sort(a);
		System.out.println(a);
	
		ArrayList<Worker> b = new ArrayList<Worker>();
		b.add(new Worker("Timothy", 4, "Manager", "Nashville"));
		b.add(new Worker("Noah", 10, "Secretary", "Detroit"));
		b.add(new Worker("Michael", 15, "Chair", "Virginia"));
		b.add(new Worker("Luke", 1, "Spokesperson", "Boston"));

		Collections.sort(b, Worker.BY_NAME);
		System.out.println(b);

		ArrayList<Worker> c = new ArrayList<Worker>();
		c.add(new Worker("Timothy", 4, "Manager", "Nashville"));
		c.add(new Worker("Noah", 10, "Secretary", "Detroit"));
		c.add(new Worker("Michael", 15, "Chair", "Virginia"));
		c.add(new Worker("Luke", 1, "Spokesperson", "Boston"));


		Collections.sort(c, Worker.BY_YEARS);
		System.out.println(c);


		ArrayList<Worker> d = new ArrayList<Worker>();
		d.add(new Worker("Timothy", 4, "Manager", "Nashville"));
		d.add(new Worker("Noah", 10, "Secretary", "Detroit"));
		d.add(new Worker("Michael", 15, "Chair", "Virginia"));
		d.add(new Worker("Luke", 1, "Spokesperson", "Boston"));

		Collections.sort(d, Worker.BY_TITLE);
		System.out.println(d);


		ArrayList<Worker> e = new ArrayList<Worker>();
		e.add(new Worker("Timothy", 4, "Manager", "Nashville"));
		e.add(new Worker("Noah", 10, "Secretary", "Detroit"));
		e.add(new Worker("Michael", 15, "Chair", "Virginia"));
		e.add(new Worker("Luke", 1, "Spokesperson", "Boston"));


		Collections.sort(e, Worker.BY_BRANCH);
		System.out.println(e);

	}
}