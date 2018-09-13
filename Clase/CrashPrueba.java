import java.util.Date;
public class CrashPrueba{
	public static void main(String args[]){
		Date jan96[] = new Date[31];
		for (int i=0; i<jan96.length; i++) {
			//jan96[i] = new Date();
			jan96[i] = new Date();
			jan96[i].setYear(96);
			jan96[i].setMonth(0);
			jan96[i].setDate(i+1);
		}
	}
}