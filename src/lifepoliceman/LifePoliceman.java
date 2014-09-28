package lifepoliceman;
import java.util.Scanner;



public class LifePoliceman {

    void awake(){
        String s ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Проснулся сотрудник ГИБДД? Yes/No");
        s = scan.nextLine();
        if(s.equalsIgnoreCase("Yes")){
            documents();  
        }
        else{
            if(s.equalsIgnoreCase("No"))
                gosleep();
        }    
    }
    
    void documents(){
        String s ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Ксива найдена? Yes/No");//Выйти или нне выйти на работу?
            s = scan.nextLine();
            if(s.equalsIgnoreCase("Yes")){
                work();
            }
            else{
                if(s.equalsIgnoreCase("No"))
                    gosleep();
            }
    }
        
    void work(){ //работа гаишника
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Есть нарушитель? Yes/No");//есть ли нарушитель?
        s = scan.nextLine();
        if(s.equalsIgnoreCase("Yes")){
            stopcar();
        }
        else{
            if(s.equalsIgnoreCase("No"))
                dayover();
        }
    }
    void stopcar(){
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Остановился нарушитель? Yes/No");//остановка нарушителя
        s = scan.nextLine();
        if(s.equalsIgnoreCase("Yes")){
            fine();    
        }
        else{
            if(s.equalsIgnoreCase("No"))
                chase();
        }
            
        
    }
    
    void chase(){
        String s = "";
        Scanner scan = new Scanner(System.in);  
        System.out.println("Догоняем зверского нарушителя!.....");
        System.out.println("Догнали подонка? Yes/No?");
        s = scan.nextLine();
        if(s.equalsIgnoreCase("Yes"))
            fine();
        else{
            if(s.equalsIgnoreCase("No"))
                dayover();
        }
        
    }
    
    void fine(){ //штрафовать
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Штрафуем негодника!");
        
        System.out.println("Денег достаточно? Yes/No?");
        s = scan.nextLine();
        if(s.equalsIgnoreCase("Yes")){
            dayover();
        }
        else{
           if (s.equalsIgnoreCase("No")) 
               work();
        }                  
    }
    
    void dayover(){
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Рабочий день подошел к концу? Yes/No?");
            s = scan.nextLine();
            if(s.equalsIgnoreCase("Yes")){
                gosleep();
            }
            else{
                if(s.equalsIgnoreCase("No"))
                    work();
                }
    } 
    
    
    
    void gosleep(){
        System.out.println("День окончен, ждем новый день!");
        awake();
    }
    public static void main(String[] args) { 
        LifePoliceman policeman = new LifePoliceman();
        policeman.awake();
    }
    
}