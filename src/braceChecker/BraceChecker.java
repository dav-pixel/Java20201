package braceChecker;

import java.awt.*;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;

    }


    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
           switch (text.charAt(i)){
               case '(':
               case '[':
               case '{':
                   stack.push(text.charAt(i));
               break;
               case ')':
                   if(text.charAt(i) == ')' && stack.pop() != '(' ){
                       System.out.println("Eror");

                   }
               case ']':
                   if(text.charAt(i) == ']' && stack.pop() != '['){
                       System.out.println("Eror");
                   }
               case '}':
                   if(text.charAt(i) == '}'  && stack.pop() != '{'){
                       System.out.println("Eror");
                   }

                   break;
               default:
                   break;



        }

        }



            }
        }




