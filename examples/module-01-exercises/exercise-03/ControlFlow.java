public class ControlFlow {
    public static void main(String[] args){
        int number = 8;
        if(number % 2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }

        for(int i = 1; i <= 3; i++){
            System.out.println("For loop: " + i);
        }

        int count = 5;
        while(count > 0){
            System.out.println(count);
            count--;
        }

        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
