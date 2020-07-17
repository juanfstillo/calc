package calculadora;

public class Magic {
	public static void main(String[] args) {
int myNumber = 31333;
		/*We will refer to myNumber as the original number from now on - it might be helpful to document this.*/
int stepOne = myNumber*myNumber;
int stepTwo = myNumber+stepOne;
int stepThree = stepTwo/myNumber;
int stepFour = stepThree + 17;
int stepFive = stepFour - myNumber;
int stepSix = stepFive/6;
System.out.println(stepSix);
	}
}