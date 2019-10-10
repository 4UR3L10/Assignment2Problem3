import java.util.Stack;

public class Assignment2Problem3
{

    public static void main(String[] args)
    {
	// Stacks.
	Stack<Integer> stackOne = new Stack<>();
	Stack<Integer> stackTwo = new Stack<>();
	
	// Setting it up.
	stackOne.push(9);
	stackOne.push(6);
	stackOne.push(8);
	stackOne.push(5);
	stackOne.push(4);
	stackOne.push(11);
	stackOne.push(4);
	System.out.println(stackOne);
	
	// TempVars.
	int tempOne = 0;
	int tempTwo = 0;
		
	// While StackTwo 
	while(!stackOne.isEmpty())
	{
	    tempOne = stackOne.pop();
	    
	    // Push value with no comparison.
	    if(stackTwo.isEmpty())
	    {
		stackTwo.push(tempOne);
	    }
	    // Else compare with the one is already on the stack.
	    else
	    {
		// If Popped from StackOne is bigger than last inserted in StackTwo.
		// Pop from StackTwo and push the smaller value.
		if(tempOne > stackTwo.peek())
		{
		    //tempTwo = stackTwo.pop();
		    stackOne.push(stackTwo.pop());
		    stackTwo.push(tempOne);
		}
		// If Popped from StackOne is smaller or equal than last inserted in StackTwo.
		else
		{
		    stackTwo.push(tempOne);
		}
	    }
	}
	System.out.println(stackTwo);
	System.out.println(stackOne);
    }       
}
