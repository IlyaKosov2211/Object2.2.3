public class BonusMilesService {
    public int calculate(int price){
        int amountOfRubInOneMile = 20;
        int miles = price / amountOfRubInOneMile;
        return miles;
    }
}
