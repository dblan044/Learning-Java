import java.util.*;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    
    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getHitPoints(){
        return this.hitPoints;
    }
    
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    
    public int getStrength(){
        return this.strength;
    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    public String getWeapon(){
        return this.weapon;
    }
    
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    
    @Override
    public List<String> write(){
        List<String> value = new ArrayList<String>();
        value.add(0, this.name);
        value.add(1, "" + this.hitPoints);
        value.add(2, "" + this.strength);
        value.add(3, this.weapon);
        
        return value;
    }
    
    @Override
    public void read(List<String> values){
        if(values != null && values.size() > 0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }
    
    @Override
    public String toString(){
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}