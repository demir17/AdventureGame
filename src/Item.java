public class Item {
    private int id;
    private String name;
    private int price;
    private int itemDamage;
    private int itemHealth;

    public Item() {

    }


    @Override
    public String toString() {
        return "ID: "+ id +  " Name: "+ name+ " "+ "Price: " + price + " "+ "Damage: " + itemDamage + " " + "Health: " + itemHealth;
    }



    public static Item[] weapons(){
        Item weapons[] ={
                new Item(1,"Gun",10,2,0),
                new Item(2,"Sword", 35,3,0),
                new Item(3,"Rifle", 45,7,0)};
        return weapons;
    }

    public static Item[] armors(){
        Item armors[] = { new Item(4,"Light Armor", 15,0 , 10),
                new Item(5,"Medium Armor", 25,0,14),
                new Item(6,"Heavy Armor", 40,0, 20)};

        return armors;

    }







    public Item(int id, String name, int price, int itemDamage, int itemHealth) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.itemDamage = itemDamage;
        this.itemHealth = itemHealth;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemDamage() {
        return itemDamage;
    }

    public void setItemDamage(int itemDamage) {
        this.itemDamage = itemDamage;
    }

    public int getItemHealth() {
        return itemHealth;
    }

    public void setItemHealth(int itemHealth) {
        this.itemHealth = itemHealth;
    }
}
