package blackjack_console;

import blackjack_core.GameScreenContract;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleStringProviderTest {

    private final GameScreenContract.StringProvider stringProvider = new ConsoleStringProvider();

    @Test
    public void testGetGameInstructionsStringValues() {
        assertEquals("Press \"s\" to stick and \"t\" to twist", stringProvider.getGameInstructions());
    }

    @Test
    public void testGetStartingInstructionsStringValues() {
        assertEquals("Press \"n\" to start a new blackjack game", stringProvider.getStartingInstructions());
    }

    @Test
    public void testGetPlayAgainInstructionsStringValues() {
        assertEquals("Press \"n\" to start a new blackjack game", stringProvider.getPlayAgainInstructions());
    }

    @Test
    public void testGetPlayerBustAlertStringValues() {
        assertEquals("You've gone bust!", stringProvider.getPlayerBustAlert());
    }

    @Test
    public void testGetUnderMinThresholdAlertStringValues() {
        assertEquals("House value is less than 17.\nHouse Twists.", stringProvider.getUnderMinThresholdAlert());
    }

    @Test
    public void testGetHouseBustAlertStringValues() {
        assertEquals("House has gone bust!", stringProvider.getHouseBustAlert());
    }

    @Test
    public void testGetHouseAtLeastThresholdAlertStringValues() {
        assertEquals("House value is at least 17.\nHouse Sticks.", stringProvider.getHouseAtLeastThresholdAlert());
    }
}