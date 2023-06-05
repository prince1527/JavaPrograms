import java.util.ArrayList;
import java.util.*;


public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		players.add("gavaskar");
		players.add("Kapil Dev");
		players.add("ravi Shastri");
		
		System.out.println(players);
		
		String[] balls = {"fb", "bb","pb"};
		ArrayList<String> ball_list = new ArrayList<String>(Arrays.asList(balls));
		System.out.println(ball_list);
		
		Iterator <String> itr = players.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
