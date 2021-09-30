import java.util.*;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    
    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHitPoints(){
        return this.hitPoints;
    }
    
    public int getStrength(){
        return this.strength;
    }
    
    @Override
    public List<String> write(){
        List<String> value = new ArrayList<String>();
        value.add(0, this.name);
        value.add(1, "" + this.hitPoints);
        value.add(2, "" + this.strength);
        
        return value;
    }
    
    @Override
    public void read(List<String> values){
        if(values != null && values.size() > 0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }
    
    @Override
    public String toString(){
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}