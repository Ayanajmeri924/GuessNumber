import java.util.Scanner;


class guess{
    private int counter = 0;
    private int Mynumber;
    private int rand;

    public guess(){
        rand= (int) (Math.random()*101)+1;
    }
    public void setnumber(int n){
        Mynumber=n;
    }
    public int iscorrect(){
        if(rand==Mynumber){
            return 0;
        }else if(rand>Mynumber){
            return 1;//input is low so we should give larger number
        }else{
            return -1;//input is high so we should give smaller number
        }
    }
    public void setcounter(){
        counter+=1;
    }
    public int getCounter(){
        return counter;
    }

}

public class guessGame{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("TWO PLAYER GAME: \n RULES \n 1.WHOEVER GUESS THE CORRECT NUMBER WITH LESS INPUT IS THE WINNER \n    LET'S START THE GAME \n ");
        System.out.println(" ");
        // int x=in.nextInt();
        int i;
        int[] scores = new int[2];
        for ( i=1;i<=2;i++){
            guess obj=new guess();

            System.out.println("player "+ i);
            // for(int j=1;j<=x;j++){
            //     obj.guess;
            // }
            // System.out.println();
            while (true) {
                System.out.print("enter user input between 1 to 100:  ");
                int n=in.nextInt();
                obj.setnumber(n);
                obj.setcounter();
    
                if(obj.iscorrect()==0){
                    System.out.println("Congratutation!!! ");
                    System.out.print("player "+i+" score = [HIDDEN FOR SECURITY PERPOSE]");
                    scores[i-1]=obj.getCounter();
                    // System.out.print(scores[i-1]);
                    System.out.println();
                    break;
                }else if(obj.iscorrect()==-1){
                    System.out.println("enter a smaller number to find");
                }else if(obj.iscorrect()==1){
                    System.out.println("enter a larger number to find");
    
                }
            }
            
            // int player1=obj.getCounter();
        }
        System.out.println("");
        System.out.println("THEREFORE THE WINNER IS :");

        
        while(true){
            System.out.print("PRESS 1 TO VIEW WINNER: ");
        int press=in.nextInt();
            if(press==1){
                if (scores[0] < scores[1]) {
                    System.out.println("Player 1 is the winner with " + scores[0] + " attempts!");
                } else if (scores[0] > scores[1]) {
                    System.out.println("Player 2 is the winner with " + scores[1] + " attempts!");
                } else {
                    System.out.println("It's a tie! Both players took " + scores[0] + " attempts.");
                }
                break;
            }else{
                System.out.println("WRONG PRESS \n PRESS AGAIN: ");
            }
        }
        
        

        System.out.println("BOTH PLAYER POINTS");
        System.out.println("PLAYER 1 POINT = "+scores[0]);
        System.out.println("PLAYER 2 POINT = "+scores[1]);
        in.close();
    }
}

//yt code:
// import java.util.Scanner;

// class Game{
//     private int counter = 0;
//     private int myNumber;
//     private int compNumber;

//     public Game(){
//         compNumber = (int) (Math.random()*100);
//     }
//     public void setNumber(int n){
//         myNumber = n;
//     }
//     public int isCorrect(){
//         if(myNumber == compNumber){
//             return 0;
//         }
//         else if(myNumber > compNumber){
//             return -1;
//         }
//         else{
//             return 1;
//         }
//     }
//     public void setCounter(){
//         counter++;
//     }
//     public void getCounter(){
//         System.out.println("The number of guesses were "+ counter);
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Game obj = new Game();
//         Scanner sc = new Scanner(System.in);
        

//         while(true){
//             System.out.println("Enter a number between 1 to 100 (1-100): ");
//             int n = sc.nextInt();
//             obj.setNumber(n);

//             if(obj.isCorrect() == 0){
//                 obj.setCounter();
//                 System.out.println("Congratulations!! You have guessed the correct number");
//                 obj.getCounter();
//                 break;
//             }
//             else if(obj.isCorrect() == -1){
//                 obj.setCounter();
//                 System.out.println("Enter smaller number!!");
//             }
//             else if(obj.isCorrect() == 1){
//                 obj.setCounter();
//                 System.out.println("Enter larger number!!");
//             }
//         }
//     }
// }