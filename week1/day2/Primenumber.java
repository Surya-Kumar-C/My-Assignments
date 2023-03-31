package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=13, j, k, flag=0;
		j=i/2;
		if (i==0||i==1) {
			System.out.println(i + "is not prime number");
		} else {
        for (k = 2; k <=j; k++) {
		if (i%k==0) {
		flag=1;
		break;
			}

			}
        if (flag==1) {
        	System.out.println(i + "is not prime number");
        }
        	else {
        	System.out.println(i + "is prime number");
        }
        }
		}
	}
	
		

	

