import java.util.ArrayList;
import java.util.Scanner;
public class TopicAlumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Greeting
        System.out.println("Hello there! Please enter your name. ");
        String user_name = sc.nextLine();
        
        //Prompts user for Alumni # input
        System.out.println("Nice to meet you " + user_name + "! What is your Alumni Number?");
        getAlumniNum();
        
        System.out.println(" ");
        
        //Events ArrayList
        System.out.println("Here are our events: ");
        ArrayList<String> event_names = new ArrayList<>();
        event_names.add("1. TED Talk Chattanooga: Life After College");
        event_names.add("2. Indie Panel: Drowning in Student Loans? Lizzie's Top 10 Tips For Not Being A Degenerate");
        event_names.add("3. Indie Panel: How The Hardcore Scene Saved My Life In College");
        event_names.add("4. TED Talk Chattanooga: Careers, Pathways, & More");
        System.out.println(event_names.get(0));
        System.out.println(event_names.get(1));
        System.out.println(event_names.get(2));
        System.out.println(event_names.get(3));
        
        System.out.println(" ");
        
        //Speaker ArrayList
        System.out.println("The corresponding event speakers are as follows: ");
        ArrayList<String> event_speaker = new ArrayList<>();
        event_speaker.add("1. Jeremy McKinnon");
        event_speaker.add("2. Lizzie McGuire");
        event_speaker.add("3. Sammy Ciaramitaro");
        event_speaker.add("4. Morgan Freeman");
        System.out.println(event_speaker.get(0));
        System.out.println(event_speaker.get(1));
        System.out.println(event_speaker.get(2));
        System.out.println(event_speaker.get(3));
        
        System.out.println(" ");
        
        //Event Location ArrayList
        System.out.println("The corresponding event locations are as follows: ");
        ArrayList<String> event_loc = new ArrayList<>();
        event_loc.add("1. HUM Building Theater");
        event_loc.add("2. Outdoor Amphitheater");
        event_loc.add("3. Outdoor Amphitheater");
        event_loc.add("4. HUM Building Theater");
        System.out.println(event_loc.get(0));
        System.out.println(event_loc.get(1));
        System.out.println(event_loc.get(2));
        System.out.println(event_loc.get(3));
        
        System.out.println(" ");
        
        //Event Dates ArrayList
        System.out.println("The corresponding event dates are as follows: ");
        ArrayList<String> event_date = new ArrayList<>();
        event_date.add("1. 12/15/2021");
        event_date.add("2. 5/20/2021");
        event_date.add("3. 5/15/2021");
        event_date.add("4. 12/20/2021");
        System.out.println(event_date.get(0));
        System.out.println(event_date.get(1));
        System.out.println(event_date.get(2));
        System.out.println(event_date.get(3));
        
        System.out.println(" ");

        //Event Times ArrayList
        System.out.println("The corresponding event times are as follows: ");
        ArrayList<String> event_time = new ArrayList<>();
        event_time.add("1. 7:35 PM");
        event_time.add("2. 3:15 PM");
        event_time.add("3. 2:45 PM");
        event_time.add("4. 8:00 PM");
        System.out.println(event_time.get(0));
        System.out.println(event_time.get(1));
        System.out.println(event_time.get(2));
        System.out.println(event_time.get(3));
        
        //Guest Number ArrayList
        ArrayList<Integer> guest_num = new ArrayList<>();
        guest_num.add(150);
        guest_num.add(68);
        guest_num.add(15);
        guest_num.add(135);
        System.out.println();
        System.out.println("The amount of guests attending each event are as follows:  ");
        System.out.println("1. " + guest_num.get(0));
        System.out.println("2. " + guest_num.get(1));
        System.out.println("3. " + guest_num.get(2));
        System.out.println("4. " + guest_num.get(3));

        System.out.println(" ");
        
        //Register for an event prompt
        System.out.println("Which event would you like to register for? (Pick #1-#4)");
        int user_input2 = sc.nextInt();
        
        //Checks for user input value & increments ArrayList element
        if(user_input2 == 1){
            int index = 0; 
            Integer value = guest_num.get(0); 
            value = value + 1; 
            guest_num.set(index, value); 
        }
        else if(user_input2 == 2){
            int index = 1; 
            Integer value = guest_num.get(1); 
            value = value + 1; 
            guest_num.set(index, value); 
        }
        else if(user_input2 == 3){
            int index = 2; 
            Integer value = guest_num.get(2);
            value = value + 1; 
            guest_num.set(index, value); 
        }
        else if(user_input2 == 4){
            int index = 3; 
            Integer value = guest_num.get(3); 
            value = value + 1; 
            guest_num.set(index, value);
        }
        
        //Prompts user if they want to register for another event
        System.out.println("(True/False) Would you like to register for another event? **Students may only register for 2 events** ");
        boolean user_bool = sc.nextBoolean();
        
        //Checks boolean if they want to register for another event
        if(user_bool == true){
            System.out.println("Which event would you like to register for? (Pick #1-#4)");
            int user_input3 = sc.nextInt();
                    if(user_input3 == 1){
                        int index = 0;
                        Integer value = guest_num.get(0);
                        value = value + 1;
                        guest_num.set(index, value);
                    }
                    else if(user_input3 == 2){
                    int index = 1;
                    Integer value = guest_num.get(1);
                    value = value + 1;
                    guest_num.set(index, value);
                    }
                    else if(user_input3 == 3){
                    int index = 2;
                    Integer value = guest_num.get(2);
                    value = value + 1;
                    guest_num.set(index, value);
                    }
                    else if(user_input3 == 4){
                    int index = 3;
                    Integer value = guest_num.get(3);
                    value = value + 1;
                    guest_num.set(index, value);
                    }
                    System.out.println(" ");
                    System.out.println("The new attendee count is: ");
                    System.out.println(guest_num.get(0));
                    System.out.println(guest_num.get(1));
                    System.out.println(guest_num.get(2));
                    System.out.println(guest_num.get(3));
                    System.out.println(" ");
                    System.out.println("Thank you for registering and browsing our events!");
        }
        else{
            System.out.println(" ");
            System.out.println("The new attendee count is: ");
            System.out.println(guest_num.get(0));
            System.out.println(guest_num.get(1));
            System.out.println(guest_num.get(2));
            System.out.println(guest_num.get(3));
            System.out.println(" ");
            System.out.println("Thank you for registering and browsing our events!");
        }
    }
    
    //Class for getting AlumniNum
    public static void getAlumniNum() {
        Scanner sc = new Scanner(System.in);
        int alumnum_input = sc.nextInt();
        System.out.println("Thank you! Alumni #" + alumnum_input);
    }
}

    //End of program


