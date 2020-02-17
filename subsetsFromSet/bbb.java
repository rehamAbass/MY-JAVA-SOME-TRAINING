import java.util.HashSet;
import java.util.Set;

public class bbb <E>{

	public static <E> Set<Set<E>> subset3(Set<E> s1){
		Set<Set<E>> s2= new HashSet<>();
		for(E e1 : s1)
			for(E e2 : s1) 
				for(E e3 : s1) {
					
					Set <E> s3 =new HashSet<>();
					s3.add(e1);
					s3.add(e2);
					s3.add(e3);
					if(s3.size()<3) continue;
					s2.add(s3);
					}
		return s2;
	}
	
	public static void main(String[] args) {
		Set <Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(3);
	
		System.out.println(subset3(s).toString());
	}

}
