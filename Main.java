import java.util.ArrayList;
import java.util.Scanner;


class Item{
  
  String name;
  String serial;
  int cost;
  
  public Item(){}
  
  public Item (String name, String serial, int cost){
    this.name = name;
    this.serial = serial;
    this.cost = cost;
  }
 
     //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setSerial(String serial){
        this.serial = serial;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getSerial(){
        return serial;
    }

    public int getCost(){
        return cost;
    }

  }

  

class Main {
	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  ArrayList<Item> inventory = new ArrayList<Item>();
    
 

    
while(true){

System.out.println("Press 1 to add an item.");
System.out.println("Press 2 to delete an item.");
System.out.println("Press 3 to upload an item.");
System.out.println("Press 4 to show all the items");
System.out.println("Press 5 to to quit the program.");
int choice = sc.nextInt();
sc.nextLine();


if (choice == 1){
    Item newItem = new Item();

        System.out.println("Enter the name:");
        String name = sc.nextLine();
        newItem.setName(name);

        System.out.println("Enter the serial number:");
        String serial = sc.nextLine();
        newItem.setSerial(serial);

        System.out.println("Enter the value in dollars (whole number):");
        int cost = sc.nextInt();
        sc.nextLine();
        newItem.setCost(cost);
       
        inventory.add(newItem);
  
}

else if (choice == 2){
 System.out.println("Enter the serial number of the item to delete:");
        String serial = sc.nextLine();

        for(int i = 0; i < inventory.size(); i++){
            
            if(inventory.get(i).getSerial().equals(serial)){
                inventory.remove(i);
            }
        }
}

else if (choice == 3){
   System.out.println("Enter the serial number of the item to change:");
        String newSerial = sc.nextLine();

        System.out.println("Enter the new name:");
        String newName = sc.nextLine();
        
        System.out.println("Enter the new value in dollars (whole number):");
        int newCost = sc.nextInt();
        sc.nextLine();

        Item updatedItem = new Item(newName, newSerial, newCost);

        for(int i = 0; i < inventory.size(); i++){
            
            if(inventory.get(i).getSerial().equals(newSerial)){
                inventory.set(i, updatedItem);
            }
        }

    
}

  
else if (choice == 4){
  
for(int i = 0; i < inventory.size(); i++){
            Item temp = inventory.get(i);
            System.out.println(temp.getName() + "," + temp.getSerial() + "," + temp.getCost());
}
}

  
  else break;
}

  }
    
	}

