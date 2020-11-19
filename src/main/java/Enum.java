public class Enum {
    public enum Size {
        SMALL(60, "S", "very thin person"),
        MEDIUM(70, "M", "just thin"),
        LARGE(80, "L", "typical, normal size"),
        EXTRA_LARGE(90, "XL", "a little bit overweighted");

        String abbreviation;
        int weight;
        String description;


        Size(int weight, String abbreviation, String description) {
            this.weight = weight;
            this.abbreviation = abbreviation;
            this.description = description;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        System.out.printf("XL stands for approximately %d kilos\n", findWeightByAbbreviation("XL"));
        System.out.printf("M size means: %s \n", findDescriptionByAbbreviation("M"));
        System.out.println(findWeightByAbbreviation("s"));
        System.out.println(findWeightByAbbreviation("s".toUpperCase()));
        System.out.println(Size.SMALL.getAbbreviation());
        System.out.println(findDescriptionByWeight(71));
    }

    private static int findWeightByAbbreviation(String abbreviation) {
        for (Size value : Size.values()) {
            if (abbreviation.equals(value.abbreviation)) {
                return value.weight;
            }
        }
        return -1;
    }

    private static String findDescriptionByAbbreviation(String abbreviation) {
        for (Size value : Size.values()) {
            if (abbreviation.equals(value.abbreviation)) {
                return value.description;
            }
        }
        return "not found";
    }

    private static String findDescriptionByWeight(int weight) {
        for (Size value : Size.values()) {
            if (weight == value.weight) {
                return value.description;
            }
        }
        return "not found";
    }

}




