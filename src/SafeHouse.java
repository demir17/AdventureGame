public class SafeHouse {
    private boolean onLocation = true;
    Character character;

    public SafeHouse(Character character) {
        this.character = character;
    }

    public int healthRegen(int m, int c){
        if(isOnLocation() == true){
        System.out.println("You are in the safe house your soul has been renewed");
        c = m;
        }
                return c;
    }


    public boolean isOnLocation() {
        return onLocation;
    }

    public void setOnLocation(boolean onLocation) {
        this.onLocation = onLocation;
    }
}



