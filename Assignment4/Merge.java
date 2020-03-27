import java.util.Arrays;
import java.util.*;



public class Merge{


	public static Comparable[] merge(Comparable[] a, Comparable[] b){

		Comparable[] c = new Comparable[a.length + b.length];
		for(int i=0, j=0, k=0; k < c.length; k++){
			if (i == a.length){
				c[k] = b[j++];
			} else if (j == b.length){
				c[k] = a[i++];
			} else if (a[i].compareTo(b[j]) < 0){
				c[k] = a[i++];
			} else{
				c[k] = b[j++];
			}
		}
		return c;
	}

	public static Comparable[] mergeTwoHalf(Comparable[] a, int mid){

		int one = mid;
		int two = a.length - one;

		Comparable[] b = new Comparable[one];
		Comparable[] c = new Comparable[two];
		for(int i=0;  i < one; i++){
			b[i] = a[i];
		}
		for(int j=one, k = 0;  j < a.length; j++){
				c[k++] = a[j];
			}
	
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		Comparable[] d = merge(c, b);
		return d;
		}

		

	

	public static void main(String[] args){
		Comparable[] a = {"Alice", "Bob", "Dave", "Eddie", "Frank"};
		Comparable[] b = {"Alicia", "Beyonce", "Bradley", "Chris", "Dania", "Eddie"};
		Comparable[] c = merge(a, b);
		System.out.println(Arrays.toString(c));
    	
		Comparable[] e = {"Alice", "Bob", "Dave", "Eddie", "Frank", "Alicia", "Beyonce", "Bradley", "Chris", "Dania", "Eddie"};
		Comparable[] f = mergeTwoHalf(e, 5);
		System.out.println(Arrays.toString(f));



    }



}