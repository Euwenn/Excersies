import java.util.Stack;

public class Main
{
    /*
    Problem 2: Evaluate Reverse Polish Notation

    Evaluate the value of an arithmetic expression in Reverse Polish Notation (RPN).
    Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

    Example:
    Input: ["2", "1", "+", "3", "*"]
    Output: 9
    Explanation: (2 + 1) * 3 = 9
    Input: ["4", "13", "5", "/", "+"]
    Output: 6
    Explanation: 4 + (13 / 5) = 6
     */


    public static void main(String[] args)
    {
        String[] arrayStr = {"4", "13", "5", "/", "+"};

        System.out.println(evalNum(arrayStr));
    }

    public static double evalNum(String[] strArray)
    {
        Stack<String> strStack = new Stack<String>();
        for(int i = 0; i < strArray.length; i++)
        {
            if(strArray[i] != "+" && strArray[i] != "-" && strArray[i] != "*" && strArray[i] != "/")
            {
                strStack.push(strArray[i]);
            }
            else
            {
                switch (strArray[i])
                {
                    case "+":
                        double add1 = Double.parseDouble(strStack.pop());
                        double num2 = Double.parseDouble(strStack.pop());
                        double addBoth = add1 + num2;
                        strStack.push(Double.toString(addBoth));
                        break;
                    case "-":
                        double sub1 = Double.parseDouble(strStack.pop());
                        double num3 = Double.parseDouble(strStack.pop());
                        double subBoth = sub1 - num3;
                        strStack.push(Double.toString(subBoth));
                        break;
                    case "*":
                        double multiply1 = Double.parseDouble(strStack.pop());
                        double num4 = Double.parseDouble(strStack.pop());
                        double multiplyBoth = multiply1 * num4;
                        strStack.push(Double.toString(multiplyBoth));
                        break;
                    case "/":
                        double div1 = Double.parseDouble(strStack.pop());
                        double num5 = Double.parseDouble(strStack.pop());
                        double divBoth = div1 / num5;
                        strStack.push(Double.toString(divBoth));
                        break;
                    default:
                        continue;
                }
            }

        }
        return Double.parseDouble(strStack.pop());
    }
}