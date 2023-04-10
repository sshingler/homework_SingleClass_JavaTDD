public class Calculator {

    private double number1;
    private double number2;

    public Calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {return this.number1;}
    public double getNumber2() {return this.number2;}
    public double addNumbers() {return this.number1 + this.number2;}
    public double subtractNumbers() {return this.number2 - this.number1;}
    public double multiplyNumbers() {return this.number1 * this.number2;}
    public double divideNumbers() {return this.number2 / this.number1;}
}
