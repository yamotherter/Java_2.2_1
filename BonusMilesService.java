public class BonusMilesService {
    public int calculate (int cost) {
        int mile_cost = 20;
        int miles = cost / mile_cost;
        return miles;
    }
}
