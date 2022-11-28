import java.util.Scanner;

public class Maps {
    private String name;
    private Character player;
   private Character monster1;
   private Character monster2;
   private Character monster3;

    public Maps(Character monster1, Character monster2, Character monster3, Character player, String name) {
        this.player = player;
        this.monster1 = monster1;
        this.monster2 = monster2;
        this.monster3 = monster3;
        this.name = name;
    }

    public boolean fight(){
        System.out.println("Welcome to the " + name + "\nYour mission is defeat monsters and get the main items.");
        Scanner sc = new Scanner(System.in);
        System.out.println("You have encounter with 3 " + monster1.getName());
        System.out.println("1. Fight\n2. Run to SafeHouse");
        int i = sc.nextInt();
        int temp;
        int n = 0;
        if(i == 1){
             for (;monster3.getHealth() >0;){
                 if(n == 1){
                     break;
                 }

                 for(;monster3.getHealth() > 0;){
                     System.out.println("You Hit to " + monster3.getName() + " with " + player.getDamage() + " damage.");
                     monster3.setHealth(monster3.getHealth() - player.getDamage());
                     temp = sc.nextInt();

                     System.out.println(monster3.getName() + " Hit you with " + monster3.getDamage() + " damage points");
                     player.setHealth(player.getHealth() - monster3.getDamage());
                     temp = sc.nextInt();


                 }
                 if (monster3.getHealth() <= 0) {
                     player.setMoney(player.getMoney() + monster3.getMoney());
                     System.out.println("You beat the " + monster3.getName() + " and earned " + monster3.getMoney() + "coin");
                     System.out.println("Your health is: " + player.getHealth());
                     System.out.println("You want to go to Safehouse or fight\n" +
                             "1. Run Away!\n" +
                             "2. Fight");
                     n = sc.nextInt();
                     if(n == 1){
                         break;
                     }


                 }




                 for(; monster2.getHealth() > 0;){
                     if(n == 1){
                         break;
                     }

                     for(;monster2.getHealth() > 0;){
                         System.out.println("You Hit to " + monster2.getName() + " with " + player.getDamage() + " damage.");
                         monster2.setHealth(monster2.getHealth() - player.getDamage());
                         temp = sc.nextInt();

                         System.out.println(monster2.getName() + " Hit you with " + monster2.getDamage() + " damage points");
                         player.setHealth(player.getHealth() - monster2.getDamage());
                         temp = sc.nextInt();


                     }
                     if (monster2.getHealth() <= 0) {
                         player.setMoney(player.getMoney() + monster2.getMoney());
                         System.out.println("You beat the " + monster2.getName() + " and earned " + monster2.getMoney() + " coin");
                         System.out.println("Your health is: " + player.getHealth());
                         System.out.println("You want to go to Safehouse or fight\n" +
                                 "1. Run Away!\n" +
                                 "2. Fight");
                         n = sc.nextInt();

                         if(n == 1){
                             break;
                         }

                     }



                     for (;monster1.getHealth() > 0;){

                         System.out.println("You Hit to " + monster1.getName() + " with " + player.getDamage() + " damage.");
                         monster1.setHealth(monster1.getHealth() - player.getDamage());
                         temp = sc.nextInt();

                         System.out.println(monster1.getName() + " Hit you with " + monster1.getDamage() + " damage points");
                         player.setHealth(player.getHealth() - monster1.getDamage());
                         temp = sc.nextInt();


                     }
                     if (monster1.getHealth() <= 0) {
                         player.setMoney(player.getMoney() + monster1.getMoney());
                         System.out.println("You beat the " + monster1.getName() + " and earned " + monster1.getMoney() + "coin");
                         System.out.println("Your health is: " + player.getHealth());
                         System.out.println("You want to go to Safehouse or fight\n" +
                                 "1. Run Away!\n" +
                                 "2. Fight");
                         n = sc.nextInt();
                        if(n == 1){
                            break;
                        }


                     }


                 }





             }

            }

        if(monster3.getHealth() <= 0){
            return true;
        }


        if(i == 2){
            System.out.println("Your going to safehouse.");

        }

        return false;

    }









}
