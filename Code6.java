class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        //throw new UnsupportedOperationException("Please implement the CalculatorConundrum.calculate() method");
        if(operation==null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        else if(operation.equals("+")){
            return operand1+" + "+operand2+" = "+(operand1+operand2);
        }
        else if(operation.equals("*")){
            return operand1+" * "+operand2+" = "+(operand1*operand2);
        }
        else if(operation.equals("/")){
            if(operand2==0){
                // Creating an ArithmeticException as the cause
                ArithmeticException cause = new ArithmeticException("Division by zero");
                // Throwing IllegalOperationException with the cause
                throw new IllegalOperationException("Division by zero is not allowed", cause);
            }
            return operand1+" / "+operand2+" = "+(operand1/operand2);
        }
        else if(operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else{
            throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        }
    }
}
