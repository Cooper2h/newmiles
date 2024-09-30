public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRub = 20; // количество рублей для одной бонусной мили
        return price / milesPerRub; // рассчитываем количество бонусных миль
    }
}