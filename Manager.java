package VictoriaSecreat;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
public class Manager  {
    private String name;
    private int prize;
    private int cease;
    public Manager(String name,int prize,int cease) {
        this.name = name;
        this.prize = prize;
        this.cease = cease;
    }
    public String getName()
    {
        return name;
    }
    public int getPrize() {
        return prize;
    }
    public int getCease() {
        return cease;
    }
    @Override
    public String toString() {
        return name + "\n price" + prize + "\n size" + cease;
    }
        public static void main(String[] args) {
            List<Manager> stuff = Arrays.asList(new Manager("chmo", 2,2 ), new Manager("popushcheniy", 4,3 ));
            stuff.sort(Comparator.comparing(Manager::getCease).thenComparing(Manager::getPrize));
            for (Manager manager : stuff) {
                System.out.println(manager.toString());
            }
        }
        public Manager findUsingEnhancedForLoop(String name,List<Manager>stuff) {
            for (Manager manager : stuff) {
                if (manager.getName().equals("chmo")) {
                    return manager;
                }
                return null;
            }
            return null;
        }
    }



