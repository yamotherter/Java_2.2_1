public class BonusMilesService {
    /* Создаём метод calculate, который принимает стоимость билета,
    производит рассчёт и возвращает количество бонусных миль
     */
    public int calculate (int cost) {
        int mile_cost = 20;
        int miles = cost / mile_cost;
        return miles;
    }
}
