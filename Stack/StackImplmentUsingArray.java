import java.util.Scanner;

public class StackImplmentUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int top=-1;
        while(true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(top==size-1){
                        System.out.println("Stack is full");
                    }
                    else{
                        System.out.println("Enter the element to push");
                        int ele=sc.nextInt();
                        top++;
                        arr[top]=ele;
                    }
                    break;
                case 2:
                    if(top==-1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Element popped is "+arr[top]);
                        top--;
                    }
                    break;
                case 3:
                    if(top==-1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Element at the top is "+arr[top]);
                    }
                    break;
                case 4:
                    if(top==-1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Elements in the stack are");
                        for(int i=top;i>=0;i--){
                            System.out.println(arr[i]);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }
}
