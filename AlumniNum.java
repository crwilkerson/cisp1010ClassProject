import java.util.Scanner;
import java.lang.Math;   
public class AlumniNum {
    //RNG generator for AlumniNum
    public static String getAlumniNum() {
	String random = Integer.toString((int)(Math.random()*100));
	return (random.length() < 2 ? random = "0" + random  : random);
    }
    
    public class getAlumniNum2 {
        Scanner sc = new Scanner(System.in);
        
    }
}



    
    
    
    
    
    
//    public int alumni_num;
//    //idk if I'll need more variables here or what
//    
//    //empty constructor
//    public AlumniNum(){
//        
//    }
//    
//    public AlumniNum(int alumni_num){
//        this.alumni_num = alumni_num;
//    }
//    
//    //need further uml diagram I guess, this one seems simple? 
//    //does this need a scanner for user input?
//

//}
