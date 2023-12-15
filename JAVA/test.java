import java.util.*;
 class test{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int r=0;
   
    while(n>0){
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    while(sum>0){
        r=sum%10;
    switch(r){
        case 0:System.out.print("zero ");
        break;
        case 1:System.out.print("one ");
        break; 
        case 2:System.out.print("two ");
        break; 
        case 3:System.out.print("three ");
        break; 
        case 4:System.out.print("four ");
        break; 
        case 5:System.out.print("five ");
        break; 
        case 6:System.out.print("six ");
        break; 
        case 7:System.out.print("seven ");
        break; 
        case 8:System.out.print("eight ");
        break; 
        case 9:System.out.print("nine ");
        break;
        default:System.out.print("envalide entered");
    }
    sum=sum/10;
}

    }
}
