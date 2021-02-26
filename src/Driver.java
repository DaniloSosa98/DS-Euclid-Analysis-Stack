
public class Driver {

    public static void main(String[] args) {
        System.out.println("Recursive Euclid: ");
        System.out.println(Reuclid_gcd(12, 8));
        System.out.println("-------------------------------------------------");
        
        System.out.println("Iterative Euclid: ");
        System.out.println(Ieuclid_gcd(12, 8));
        System.out.println("-------------------------------------------------");
        
        System.out.println("Reverse String with explicit stack: ");
        Istring("Hello");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Reverse String with runtime stack: ");
        String a = "Hello";
        int n = a.length();
        System.out.println(Rstring(a, n));
        System.out.println("-------------------------------------------------");
        
        System.out.println("Print 1-50: ");
        System.out.println(Rnumber(50));
        System.out.println("-------------------------------------------------");
        
        System.out.println("Sum 1 to n: ");
        System.out.println(sum(0,5));
        System.out.println("-------------------------------------------------");
        
        System.out.println("Print array with index");
        int[] array = new int[]{1, 2, 3, 4, 5};
        array(0, array);
        System.out.println("-------------------------------------------------");
        
        System.out.println("Count Digits");
        String number = "123";
        System.out.println(digit(number, 0));
        System.out.println("-------------------------------------------------");
        
        System.out.println("Hailstone #27 sequence");
        System.out.println(hailstone(27, 0));
        //hailstonePrint(27, 0);
        System.out.println("-------------------------------------------------");
       
        
        System.out.println("Hailstone largest sequence");
        System.out.print("# 77,031 ");
        System.out.print(hailstone(77031, 0));
        System.out.println("\n-------------------------------------------------");
        
    }

    public static int Reuclid_gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return Reuclid_gcd(b, a % b);
        }

    }

    public static int Ieuclid_gcd(int a, int b) {
        int t;
        while(b!=0){
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public static void Istring(String a) {
        Stack stack = new Stack(a.length());
        
        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
    
    public static char Rstring(String a, int n) {
        if (n == 0) {
            return ' ';
        } else {
            System.out.print(a.charAt(n-1));
            return Rstring(a, n-1);
        }
    }
    
    public static int Rnumber(int a) {
        if (a == 1) {
            return 1;
        }else{
            System.out.print(a + " ");
            return Rnumber(a-1);
        }
    }
    
    public static int sum(int first, int last){
        
        if (last==0) {
            return first;
        } else {
            first = first + (last - 1);
            return sum(first + 1, last-1);
        }
        
    }
    
    public static int array(int index, int[] array){
        
        if (index==array.length-1) {
            System.out.println(array[index] + " Index: "+ index);
            return 0;
        } else {
            System.out.println(array[index] + " Index: "+ index);
            return array(index+1, array);
        }
        
    }
    
    public static int digit(String a, int count) {
        if (count == a.length()) {
            return count;
        } else {
            count++;
            return digit(a, count);
        }
    }
    
    public static int hailstone(int n, int count) {
        if (n == 1) {
            count++;
            System.out.print(" Size of sequence: ");
            return count;
        } else if(n%2==0){
            count++;
            return hailstone(n/2, count);
        }else{
            count++;
            return hailstone((3*n)+1, count);
        }
    }
    
    public static int hailstonePrint(int n, int count) {
        if (n == 1) {
            count++;
            System.out.println("Size of sequence: ");
            return count;
        } else if(n%2==0){
            System.out.println(n/2 + " ");
            count++;
            return hailstone(n/2, count);
        }else{
            System.out.println((3*n)+1 + " ");
            count++;
            return hailstone((3*n)+1, count);
        }
    }
}
