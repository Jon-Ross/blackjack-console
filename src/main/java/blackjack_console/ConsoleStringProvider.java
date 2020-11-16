package blackjack_console;

import blackjack_core.GameScreenContract;

public class ConsoleStringProvider implements GameScreenContract.StringProvider {

    @Override
    public String getGameInstructions() {
        return "Press \"s\" to stick and \"t\" to twist";
    }

    @Override
    public String getStartingInstructions() {
        return "Press \"n\" to start a new blackjack game";
    }

    @Override
    public String getPlayAgainInstructions() {
        return "Press \"n\" to start a new blackjack game";
    }

    @Override
    public String getPlayerBustAlert() {
        return "You've gone bust!";
    }

    @Override
    public String getUnderMinThresholdAlert() {
        return "House value is less than 17.\nHouse Twists.";
    }

    @Override
    public String getHouseBustAlert() {
        return "House has gone bust!";
    }

    @Override
    public String getHouseAtLeastThresholdAlert() {
        return "House value is at least 17.\nHouse Sticks.";
    }
}
