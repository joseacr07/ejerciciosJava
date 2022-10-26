import java.util.ArrayList;
public class Abstraction {
    public static void main(String[] args){
        ArrayList <Person> group = new ArrayList <Person>();
        group.add(new Italian("Marco"));
        group.add(new Spanish("Maria"));
        group.add(new Catalan("Marcel"));

        for (Person person : group) {
            person.greetings();
            if (person instanceof Catalan){
                ((Catalan) person).makePatumaka();
            } else if (person instanceof Italian){
                ((Italian) person).makeSpachetti();
            } else if (person instanceof Spanish){
                ((Spanish) person).makePaella();
            }
        }
        
    }
}