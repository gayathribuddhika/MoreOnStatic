
package moreonstatic;


public class NewClass {
    private String first;
    private String last;
    private static int members = 0;
    
    public NewClass(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        
        System.out.printf("The Constructor for %s %s, The Members in the club is:%d\n",first,last,members);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}
