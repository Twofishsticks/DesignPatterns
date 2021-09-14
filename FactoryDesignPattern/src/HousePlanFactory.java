public class HousePlanFactory {
    public static HousePlan createHousePlan(String type) {
        // convert input into what type of house it should be
        // make the right house, return it
        String checker = type.toLowerCase();
        if(checker.equals("log cabin")) {
            LogCabinPlan homie = new LogCabinPlan();
            return homie;
        } else if(checker.equals("tiny home")) {
            TinyHomePlan homie = new TinyHomePlan();
            return homie;
        } else if(checker.equals("contemporary home")) {
            ContemporaryPlan homie = new ContemporaryPlan();
            return homie;
        } else {
        return null;
        }
    }
}
