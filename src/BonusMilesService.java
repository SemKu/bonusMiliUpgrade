public class BonusMilesService {
    public int calculate(int priceTicket) {
        int amountPrice = 20;
        int bonusMili = priceTicket / amountPrice;
        return bonusMili;
    }
}