import java.util.Stack;

public class StackLIFO {
	public static void main(String[] args) {
		Stack<String> videos = new Stack<>();
		System.out.println(videos.isEmpty());

		
		
		videos.push("Tamil_movies");
		videos.push("Hindi_movies");
		videos.push("English_movies");
		videos.push("Italian_movies");
		System.out.println(videos);

//		String myfavoriteLanguage = videos.pop();
//
//		System.out.println(myfavoriteLanguage);
//		System.out.println(videos.peek());
		System.out.println(videos.search("Tamil_movies")); // Searching intem not their the value is -1
		for (int j = 0; j < 1000000000; j++) {
			videos.push("Astro");
			// stack overflow errors 
		}
	}
}
