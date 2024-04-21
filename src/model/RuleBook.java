/**
 * Holds the rules of the game
 *
 * @author Faycal Kilali, Peter MacAulay
 * @version 0.5
 */

package model;

public class RuleBook implements IRuleBook {
    private String rules;

    /**
     * sets the rules of the game
     */
    public RuleBook() {
        rules = "\u001B[1mTM\u001B[0m\n" +
                        "A Game for 1-4 Players\n" +
                        "You are the Dream Sheep – the sheep that people count in order to drift off to dreamland!\n\n" +
                        "Each time you jump the fence, you help everyone fall asleep easier. But beware the Nightmares that haunt these dreams and threaten a rude awakening!\n\n" +
                        "Play your cards right, use your ZzZs on the sweetest dreams, and prove you are the dreamiest sheep of all!\n\n" +
                        "\u001B[1mContents\u001B[0m\n" +
                        "Setup\n" +
                        "Form the deck for the game by shuffling together all of the chosen Nightmare’s cards with the Sheep cards, removing any cards intended for a higher number of players. For a 2-player game, use only cards marked with a “2” (in the upper-right corner), for a 3-player game, use “2” and “3” cards. For a 4-player game, all Sheep cards are used.\n" +
                        "Shuffle the 30 Dream tiles and place them in a stack face-down near the Scoreboard. Reveal the top Dream tile and place it on space 5 of the Game board; reveal the next tile and place it on space 10. Then reveal 4 additional Dream tiles and place them near the Scoreboard to create the Dream tile market.\n" +
                        "Whoever went to sleep the earliest last night becomes the first player. Give that player the First Sheep token. You are ready to begin!\n\n" +
                        "Symbols\n" +
                        "Turn Structure\n" +
                        "Dreamy Pastures uses some symbols to refer to different game elements. Keep an eye out for these symbols on your journeys!\n" +
                        "Consists of 4 steps:\n" +
                        "- Play a Card\n" +
                        "- Use Dream Tiles\n" +
                        "- Resolve Fence Crossing\n" +
                        "- Draw Cards\n" +
                        "Gameplay\n" +
                        "If a player moves the number of spaces indicated on their card, and lands on a space with the Nightmare token, they will IMMEDIATELY become Scared (see “Nightmare & Becoming Scared”, page 8-9).\n" +
                        "Anything occurring after movement (Using a Dream tile on that space, crossing the Fence, etc) happens after the Nightmare Scares a player.\n" +
                        "Racing phase\n" +
                        "NOTE:\n" +
                        "Some cards say “AND”, requiring the player to take both actions, while others say “OR,” requiring a player to choose between moving their Sheep token or the other effect listed on the card.\n\n" +
                        "Use Dream Tiles\n" +
                        "Resolve Fence Crossing\n" +
                        "Beware!!\n" +
                        "If the effect of a Dream tile causes a player to land on a space with the Nightmare token, they will IMMEDIATELY become Scared (see “Nightmare & Becoming Scared”, page 8-9). Anything occurring after movement (Using a Dream tile, crossing the Fence, etc) happens after the Nightmare Scares a player.\n" +
                        "NOTE:\n" +
                        "A player may only Call It A Night immediately after crossing the Fence. If they choose to continue, they will not be able to Call It A Night until they complete another lap around the Game board and cross the Fence again.\n" +
                        "EXAMPLE\n" +
                        "1. The Yellow Sheep plays a card and chooses to move 3 spaces with it.\n\n" +
                        "Draw Card\n" +
                        "If the active player is the only Sheep currently playing in the Racing Phase (because all other Sheep have either Woken Up or Called It A Night), they must reveal the top card of the deck before drawing their cards for the turn.\n" +
                        "If the revealed card is a Nightmare card, the instructions on the card are resolved and the card is discarded, and a new card is drawn.\n" +
                        "Players who Call It A Night do not draw cards for the remainder of the round. Otherwise, the player simply discards that card with no effect, and continues to draw as normal.\n" +
                        "Usually, this step causes a player to draw 1 card, but due to the effects of certain Dream tiles, it is possible for a player to have no cards in hand. If this is the case, the player will draw 2 cards instead.\n" +
                        "If a player draws a Nightmare card, they MUST reveal and resolve the instructions on it. Then they continue drawing until they have 2 Sheep cards (Non-Nightmare cards) in hand.\n" +
                        "Once the player has drawn for the turn, they announce that their turn is over and play passes to the next player in turn order.\n\n" +
                        "\u001B[1mNightmare & Becoming Scared\u001B[0m\n" +
                        "\u001B[3mNOTE:\u001B[0m\n" +
                        "A player becomes Scared if they end their movement directly on the same space as the Nightmare. However, a player may move past a Nightmare without becoming Scared!\n\n" +
                        "Whenever a player draws a Nightmare card for any reason (including at the start of the Racing Phase), they MUST immediately reveal it and resolve the instructions on the card. The most common instruction is to move the Nightmare.\n\n" +
                        "There are 2 different types of movement that Nightmares may make:\n" +
                        "1. \u001B[1mMOVE\u001B[0m\n" +
                        "When a card instructs the Nightmare to MOVE, The Nightmare token moves the same way as a Sheep, but does not use Dream tiles.\n\n" +
                        "\u001B[1mEXAMPLE\u001B[0m\n" +
                        "If a Nightmare moves ONTO a player’s space during ANY part of its movement, that player becomes Scared and must lay their Sheep token on its side to mark this.\n\n" +
                        "2. \u001B[1mJUMP\u001B[0m\n" +
                        "When a card instructs the Nightmare to JUMP, it does not move onto or through any spaces in between its current space and its destination (the space that it is instructed to jump to). Only players who are in the exact space that the Nightmare jumps to will become Scared. Players in the spaces between the original space and the jump destination are not affected.\n" +
                        "\u001B[3m“\u001B[1mI neEd to crosS the fence agAin before the Nightmare does!\u001B[0m”\u001B[0m\n\n" +
                        "\u001B[1mEnd of Round & Winning\u001B[0m\n";
    }

    @Override
    public String getRules() {
        return rules;
    }

    @Override
    public void setRules(String rules) {
        this.rules = rules;
    }
}
