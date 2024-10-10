package ladder;

public class LadderCreator {

    public static Ladder of(int row, int numberOfPerson){
        ValidNumber rowNum = validateRow(row);
        ValidNumber personNum = validateNumberOfPerson(numberOfPerson);

        int bridgeLimit = row * numberOfPerson / 2;
        Ladder ladder = new Ladder(rowNum, personNum, bridgeLimit);
        BridgeCreator.drawLine(ladder);

        return ladder;
    }

    private static ValidNumber validateRow(int row) {
        if (row < 1){
            throw new NotValidNumberException("row");
        }
        return new ValidNumber(row);
    }

    private static ValidNumber validateNumberOfPerson(int numberOfPerson) {
        if (numberOfPerson < 2){
            throw new NotValidNumberException("numberOfPerson");
        }
        return new ValidNumber(numberOfPerson);
    }
}
