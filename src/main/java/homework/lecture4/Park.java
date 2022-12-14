package homework.lecture4;

public class Park {
    public static void main(String[] args) {
        Attractions calipso = new Attractions("Calipso", "Whirling", "Pavilion #7", true, 5);
        Attractions mars = new Attractions("Mars", "Whigglings", "Pavilion #1", true, 8);
        Attractions clown = new Attractions("Clown", "Flips", "Pavilion #3", false, 6);
        Attractions eggs = new Attractions("Magic Eggs", "Turns", "Pavilion #11", true, 4);

        calipso.showAttractionInfo(calipso);
        mars.showAttractionInfo(mars);
        clown.showAttractionInfo(clown);
        eggs.showAttractionInfo(eggs);
    }


    public static class Attractions {
        public String attractionName;
        public String attractionFeature;
        public String attractionPlace;
        public boolean openEveryDay;
        public int attractionPrice;
        public Attractions(String attractionName, String attractionFeature, String attractionPlace, boolean openEveryDay, int attractionPrice) {
            this.attractionName = attractionName;
            this.attractionFeature = attractionFeature;
            this.attractionPlace = attractionPlace;
            this.openEveryDay = openEveryDay;
            this.attractionPrice = attractionPrice;
        }

        public void showAttractionInfo(Attractions attraction){
            System.out.println("The attraction is " + attraction.attractionName + " is situated on" + attraction.attractionPlace + " and it is " + attraction.openEveryDay + " open every day, and the price is only " + attraction.attractionPrice + " .");
        }
    }

}
