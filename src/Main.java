import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =0;
        boolean water = false;
        boolean firewood = false;
        boolean food = false;
        int temp ;
        int i;
        boolean cave1 = false;
        boolean forest1 = false;
        boolean river1 = false;
        System.out.println("Welcome.\n****************************");
        System.out.println("Are you ready for an adventure");
        System.out.println("""
                Choose your character:
                1. Samuray:\s
                DAMAGE: 5
                HEALTH: 21
                MONEY: 15
                ****************************
                2. ARCHER:
                DAMAGE: 7
                HEALTH: 18
                MONEY: 20
                ****************************
                3. KNIGHT:\s
                DAMAGE: 3\s
                HEALTH: 24
                MONEY: 5""");

        n = sc.nextInt();
        Character hero = new Character(5,21,15,"Samuray", 21);
        switch (n) {
            case 1 -> hero = new Character(5, 21, 15, "Samuray", 21);
            case 2 -> hero = new Character(12, 100, 100, "Okçu", 18);
            case 3 -> hero = new Character(3, 24, 5, "Şovalye", 24);
            default -> System.out.println("yanlış tuşlama yaptınız.");
        }
        Character zombie = new Character(3,10,4,"Zombie", 10);
        Character vampire = new Character(4,14,7,"Vampire",14);
        Character bear = new Character(7,20,12,"Bear",20);
        SafeHouse sh = new SafeHouse(hero);

        Item shop = new Item();
        Item[] weapons = shop.weapons();
        Item[] armors = shop.armors();
        Shop merchant = new Shop(weapons,armors,hero);

        Maps cave = new Maps(zombie,zombie,zombie,hero,"Cave");
        Maps forest = new Maps(vampire,vampire,vampire,hero, "Forest");
        Maps river = new Maps(bear,bear,bear,hero, "River");


        while(!(food && firewood && water)){
            System.out.println("You are Safehouse right now.");
            System.out.println("Your health is: " + hero.getHealth() + "\n" +
                    "Your Balance is: " + hero.getMoney());
            System.out.println("Please choose your next move.\n" +
                    "1.Merchant\n" +
                    "2.Go to an advanture");
            temp = sc.nextInt();

            if(temp == 1){
                merchant.buyItem(merchant.showItems(weapons,armors));
            }
            if(temp == 2){
                System.out.println("You can go to \n" +
                        "1.Cave\n" +
                        "2.Forest\n" +
                        "3.River\n" +
                        "Please choose one location.");
                i = sc.nextInt();

                if(i == 1){
                    cave1 = cave.fight();
                    food = cave1;
                }

                if(i == 2){
                    if(!(forest1 && river1)){
                        forest1 = forest.fight();
                        firewood = forest1;
                    }
                    else {
                        System.out.println("Please first visit other places");
                    }
                }

                if(i == 3){
                    if(cave1 && forest1){
                        river1 = river.fight();
                        water = river1;

                    }
                    else {
                        System.out.println("Please complete first two dungeon");
                    }



                }
            }






        }

        System.out.println("Congrats you win the Game ^_^");







        //System.out.println("Karakterin hasarı: " + hero.getDamage() + "\n Karakterin canı: " + hero.getMaxHealth());

    }
}
