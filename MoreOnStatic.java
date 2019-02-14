
package moreonstatic;


public class MoreOnStatic {

    
    public static void main(String[] args) {
        NewClass member1= new NewClass("Gayathri", "Buddhika");
        NewClass member2= new NewClass("Tharushi", "Buddhika");
        NewClass member3= new NewClass("Prageeth", "Shan");
        
        System.out.println(" ");
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());
        
        System.out.println(" ");
        System.out.println(NewClass.getMembers());
    }
    
}
