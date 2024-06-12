package calculator;

public class Addition extends Question{

    public Addition(Range range) {
        super("addition","+");
        operand1 = RandomNumber.getRandomInteger(range);
        operand2 = RandomNumber.getRandomInteger(range);
    }

    @Override
    public void calc() {
        calculated=true;
        answer=operand1+operand2;
    }
    int sum = operand1+operand2;
    @Override
    public String toString(){
        if(calculated){
            return operand1+"+"+operand2+"="+(operand1+operand2);
        }else {
            return operand1+"+"+operand2+"=";
        }
    }

}
