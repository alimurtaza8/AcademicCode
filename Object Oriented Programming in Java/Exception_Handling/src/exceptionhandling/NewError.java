package exceptionhandling;

import java.util.Scanner;
class handling {
    int a;

    void exception() throws negException {
        if (a < 0) {
            throw new negException();
        } else {
            System.out.println(a);
        }
    }
}

class negException extends Exception {
    public String toString() {
        return "a cannot be negative";
    }
}

public class NewError {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        handling b = new handling();

        try {
            System.out.println("Enter any number:");
            int input = sc.nextInt(); 
            b.a = input; 
            b.exception();
        } catch (Exception e) {
            System.out.println(e);
        }
	}

}
		
		
		
		
		
