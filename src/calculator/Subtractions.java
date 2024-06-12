package calculator;

public class Subtractions extends Question {

    public Subtractions(Range range) {
        super("subtraction","-");
        int num1 = RandomNumber.getRandomInteger(range);
        int num2 = RandomNumber.getRandomInteger(range);
        if (num1>num2){
            operand1=num1;
            operand2=num2;
        }
        else {
            operand1=num2;
            operand2=num1;
        }

    }
    @Override
    public void calc() {
        calculated=true;
        answer=operand1-operand2;
    }

    @Override
    public String toString(){
        if(calculated){
            return operand1+"-"+operand2+"="+(operand1-operand2);
        }else {
            return operand1+"-"+operand2+"=";
        }
    }


}
