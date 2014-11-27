public class Barvy {
	public static void main(String [] args) {
		System.out.printf("<html><head><title>Safe web colours</title></head><body><h1>Safe web colours</h1><table>");
		for (int r = 0; r <=15; r+=3) {
			for (int g = 0; g <= 15; g+=3) {
				System.out.printf("<tr>");
				for (int b = 0; b <= 15; b+=3) {
					System.out.printf("<td width=\"100px\" bgcolor=\"#%x%x%x",r,g,b);
					System.out.printf("\">");
					System.out.printf("%x%x%x",r,g,b);
					System.out.printf("</td>");
				}
				System.out.printf("</tr>");
				System.out.printf("\n");
			}
		}
		System.out.printf("</table></body></html>");
	}
}