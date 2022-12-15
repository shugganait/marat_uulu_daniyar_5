public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero(320, 30);
        Hero hero2 = new Hero(400, 50, "regeneration");
        System.out.println("Hero 1 || health: " + hero1.getHealth() + " || damage: " + hero1.getDamage());
        System.out.println("Hero 2 || health: " + hero2.getHealth() + " || damage: " + hero2.getDamage() + " || ability: " + hero2.getSuperAbility());

        Boss mainBoss = new Boss();
        mainBoss.setHealth(1000);
        mainBoss.setDamage(80);
        mainBoss.setDefense("stop attacks");
        System.out.println("Boss || health: " + mainBoss.getHealth() + " || damage: " + mainBoss.getDamage() + " || super ability: " + mainBoss.getDefense());
        //Доп д.з-------------
        for (int i = 0; i < 3; i++){
            if (createHeroes()[i].getSuperAbility() == null) {
                System.out.println("Hero" + (i + 1) + " || health: " + createHeroes()[i].getHealth()+ " || damage: " + createHeroes()[i].getDamage());
            } else {
                System.out.println("Hero" + (i + 1) + " || health: " + createHeroes()[i].getHealth()+ " || damage: " + createHeroes()[i].getDamage() +
                    " || ability: " + createHeroes()[i].getSuperAbility());
            }

        }

    }
    public static Hero[] createHeroes() {
        Hero heroNum1 = new Hero(230, 20, "hidden");
        Hero heroNum2 = new Hero(300, 25);
        Hero heroNum3 = new Hero(270, 40, "double damage");
        Hero[] createheroes;
        return createheroes = new Hero[] {heroNum1, heroNum2, heroNum3};
    }
}