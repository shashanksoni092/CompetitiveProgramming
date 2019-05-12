	//Question::Compute the number of person siting in a room such that there is a 90% probability
//of two person having same day birthday.
//P(having same birthday)=1-P(having different birthday)=1-(1-365/365*364/365*363/365*....(n-1)/365)

package MathsSTL;

public class BirthdayParadox {

	static float probability=1;
	static int numerator=365;
	static int denominator=365;
	static int n=0;
	public static void main(String[] args) {

		//float p=probability;
		while(probability>0.1)
		{
			probability*=((float)numerator/denominator);
			numerator--;
			n++;
			System.out.println(probability +" and "+n);
		}
		 //Simplified version of same thing
		 //System.out.println(Math.ceil(Math.sqrt(2 * 365 * Math.log(1 / (1 - 0.9)))));
		
	}

}
