public class Main
{
    //function called DiffMinMax3 with 3 int args 
    public static int DiffMinMax(int a, int b, int c){
        int max,min;
        //if else loop to find max and min 
        if(a>b && a>c)
        {
            max=a;
        }
        else if(b>a && b>c)
        {
            max=b;
        }
        else
        {
            max=c;
        }
        if(a<b && a<c)
        {
            min=a;
        }
        else if(b<a && b<c)
        {
            min=b;
        }
        else
        {
            min=c;
        }
        //return the diff 
        return (max-min);
    }
    //main driver method 
	public static void main(String[] args) {
	    //call the function with inputs
	    System.out.println("The difference of the Max and Min numbers are: "+DiffMinMax(1,1,1));
		
	}
}
