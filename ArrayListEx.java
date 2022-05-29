package college;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> sc = new ArrayList<>();
		ArrayList<Integer> sc1 = new ArrayList<>(10);
		sc.add(12);
		sc.add(13);
		sc.add(16);
		sc.add(65);
		sc.add(98);
		sc1.add(133);
		sc1.add(1667);
		sc1.add(655);
		sc1.add(98345);
		sc.addAll(sc1);
		sc.set(2, 1000);
		sc.remove(4);
		System.out.println("clone ArrayList is  "+sc.clone());
		System.out.println("hash code the ArrayList is  "+sc.hashCode());
		System.out.println("Iterater : "+sc.iterator());
		for(int i=0;i<sc.size();i++) {
			System.out.print(sc.get(i));
			System.out.print(", ");
		}
		
		System.out.println("\n ------LinkedList Start------ ");
		LinkedList<Integer> lk = new LinkedList<>();
		lk.add(1);
		lk.add(4);
		lk.add(2);
		lk.add(3);
		lk.addLast(999);
		for(int i=0;i<lk.size();i++) {
			System.out.print(lk.get(i));
			System.out.print(", ");
		}

	}

}
