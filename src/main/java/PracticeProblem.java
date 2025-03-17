public class PracticeProblem {

	public static int goodString(String str) {
		int n = str.length();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					min = Math.min(min, i + (n - 1 - j));
				}
			}
		} return (min == Integer.MAX_VALUE) ? -1 : min;
		}
	public static void main(String args[]) {
		int result = goodString("pqr");
		System.out.println(result);
	}

}
