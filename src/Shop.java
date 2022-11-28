import java.util.Scanner;

public class Shop {
    Item[] weapons;
    Item[] armors;
    Character player;



    public int showItems(Item[] weapons, Item[] armors){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Merchant. We have beatiful items for your adventure and strenght.\n" +
                "Here this is our item list.\n" +
                "*******************************");
                for(Item i: weapons){
                    System.out.println(i);
                }
             System.out.println("*******************************");
                for(Item i: armors){
                    System.out.println(i);
                }
        System.out.println("Please insert an id number to buy item.\n" +
                "You don't want to buy anything? No problem just enter 0.");
                int n = sc.nextInt();
                return n;
    }

    public void buyItem(int n){
        int j = n - 1;
        int k = n - 4;
        if(n == 0){
            System.out.println("See you next time ^_^");

        }

        if(n>=1 && n<= 3) {
            if (weapons[j].getPrice() <= player.getMoney()) {
                player.setDamage(player.getDamage() + weapons[j].getItemDamage());
                player.setMoney(player.getMoney() - weapons[j].getPrice());
                System.out.println("Woow you look awesome with this weapon.\n" +
                        "Your new damage is: " + player.getDamage());
                System.out.println("Your new balance is: " + player.getMoney());
            }
            else {
                System.out.println("Sorry you can't afford this weapon :/");
            }
        }

        if(n>= 4 && n<=6){
            if(armors[k].getPrice() <= player.getMoney()){
                player.setMaxHealth(player.getMaxHealth() + armors[k].getItemHealth());
                player.setMoney(player.getMoney() - armors[k].getPrice());
                System.out.println("Woow you look awesome in this armor.\n" +
                        "Your new Max Health is: " + player.getMaxHealth());
                System.out.println("Your new balance is: " + player.getMoney());
            }
            else{
                System.out.println("Sorry your balance isn't enough for that.");
                            }

        }




    }

    public Shop(Item[] weapons, Item[] armors, Character player) {
        this.weapons = weapons;
        this.armors = armors;
        this.player = player;
    }
}
