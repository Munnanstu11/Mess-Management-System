package project;


public class Member {
    private String name;
    private int meals;
    private double shopping;
    
    public Member(){
        
    }
    
    public Member(String name, int meals, double shopping){
        this.name = name;
        this.meals = meals;
        this.shopping = shopping;
    }
    
    //accessors
    public String getName(){
        return name;
    }
    
    public int getMeals(){
        return meals;
    }
    
    public double getShopping(){
        return shopping;
    }
    
    //mutators
    public void setName(String name){
        this.name = name;
    }
    
    public void setMeals(int meal){
        this.meals = meals;
    }
    
    public void setShopping(double shopping){
        this.shopping = shopping;
    }
    
    @Override
    public String toString(){
        return name + " " + meals + " " + shopping;
    }
    
    
    
    
}
