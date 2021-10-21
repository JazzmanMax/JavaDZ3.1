public class BonusMilesService {
    public int calculate(int ticketCost) {
        int spent = 20;
        int milesBonus = 1;
        int miles;
        miles = ticketCost / spent * milesBonus;

        return miles;
    }
}
