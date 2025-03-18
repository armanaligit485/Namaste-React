import java.util.Scanner;

class Test{
    static int a=10;
    // static void display(){
    //     System.out.println("Value of a before Inalilization(Default) : "+ a);
    // }
    public static String[] increaseSize(String[] arr){
        String[] s = new String[arr.length+1];
        for(int i=0;i<arr.length;i++){
            s[i]=arr[i];
        }
        return s;
    }

    public static String[] xyz(){
        Scanner sc = new Scanner(System.in);
        String[] array = new String[0];
        return sc.nextLine().split(" ");
    }
    public static void main(String[] args) {
       String[] s=xyz(); 
       for(String i : args){
        System.out.println(i);
       }

    }
}