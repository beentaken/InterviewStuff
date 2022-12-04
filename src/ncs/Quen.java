 package ncs;

import java.util.*;
//https://github.com/hongeee/HackerRank/tree/e3a725b9969f5bc0610f8b04a4070e6392fb1366/src/main/java/com/hongeee/hackerrank/meshkorea
public class Quen {
	public static List<String> bitPattern(List<Integer> num) {
        // Write your code here
        Queue<Integer> queue = new LinkedList<Integer>(num);
        Set<Integer> set = new HashSet<>();

        StringBuilder bit1 = new StringBuilder();
        StringBuilder bit2 = new StringBuilder();

        while (!queue.isEmpty()) {
            int i = queue.poll();

            // whether occur earlier in the array
            if (!set.contains(i)) {
                // add bit1 value : 0
                set.add(i);
                bit1.append(0);
            } else {
                // add bit1 value : 1
                bit1.append(1);
            }

            // whether occur later in the array
            if (!queue.contains(i)) {
                // add bit2 value : 0
                bit2.append(0);
            } else {
                // add bit2 value : 1
                bit2.append(1);
            }
        }

        List<String> str = new ArrayList<>();
        str.add(bit1.toString());
        str.add(bit2.toString());

        return str;
    }
	
	
	public static void main(String[] args) {
		
	}	
}
