package week1.day2;

public class FibonacciSereis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int range=8,j,firstNum=0,secNum=1, sum;
    System.out.println(firstNum);
    for ( j = 1; j<range; j++) {
    sum=firstNum+secNum;
    firstNum=secNum;
    secNum=sum;
    System.out.println(sum);
		
	}
	}

}
