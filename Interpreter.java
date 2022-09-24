import java.util.Stack;

public class Interpreter {
    public static int[] brainfuck(char[] op){
        var result = new int[20];
        var openBrackets = new Stack<Integer>();
        var counterIndexStack = new Stack<Integer>();
        var resultPointer = 0;
        var operationPointer = 0;
        while(operationPointer<op.length){
            switch (op[operationPointer]){
                case '>':
                    resultPointer++; break;
                case '<':
                    resultPointer--; break;
                case '+':
                    result[resultPointer]++; break;
                case '-':
                    result[resultPointer]--; break;
                case '[':
                    if(!counterIndexStack.isEmpty() && result[counterIndexStack.peek()]<=0){
                        while (op[operationPointer]!=']') operationPointer++;
                    } else {
                        openBrackets.push(operationPointer);
                        counterIndexStack.push(resultPointer);
                    }
                    break;
                case ']':
                    if(result[counterIndexStack.peek()]<=0){
                        openBrackets.pop();
                        counterIndexStack.pop();
                    } else{
                        operationPointer = openBrackets.peek();
                    }
                    break;
                case '.':
                    System.out.print((char)result[resultPointer]);
            }
            operationPointer++;
        }
        return result;
    }
}
