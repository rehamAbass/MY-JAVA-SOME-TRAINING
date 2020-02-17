import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class t {

	public static int a(List <String> l) {
		Set <String> set= new HashSet<>();
		for(String str:l)
			set.add(str.toUpperCase());
		System.out.println(set.toString());
		return set.size();
	}
	
	public static void main(String[] args) {
		String []arr = {"One","one","Two","two"};
		System.out.println(t.a(Arrays.asList(arr)));
	}

}
