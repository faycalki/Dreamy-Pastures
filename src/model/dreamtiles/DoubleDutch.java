/**
 * @author Faycal Kilali, Peter MacAulay
 * @version 0.5
 * <p>
 * player the other card from you hand
 */

package model.dreamtiles;

import model.IPlayer;
import model.IZzzToken;

import java.util.ArrayList;

public class DoubleDutch extends DreamTile {
    private final String description;
    private final int initialZzzsRequired;
    private final ArrayList<IZzzToken> tokens;
    private final boolean isInfinite;

    public DoubleDutch() {
        initialZzzsRequired = 3;
        tokens = new ArrayList<IZzzToken>();
        isInfinite = false;
        description = "DoubleDutch: Play The Other Card From Your Hand";
    }

    /**
     * player the other card from you hand
     * @param player activating tile
     */
    @Override
    public void activateTile(IPlayer player) {
        // Check if player has any zzz tokens
        if (getPlayerZzzs(player).size() == 0){
            return;
        }
        //TODO: figure out how to player two card

        //removes tokens required to use the token from DreamTile and gives them back to the player
        removeTokens(player, initialZzzsRequired, tokens, isInfinite);
    }

    /**
     * gets DreamTile description
     */
    @Override
    public String getDescription(){
        return description;
    }

    /**
     * gets DreamTile initial Zzzs Required
     */
    @Override
    public int getInitialZzzsRequired(){
        return initialZzzsRequired;
    }

    /**
     * gets DreamTile's Zzz tokens on it
     */
    @Override
    public ArrayList<IZzzToken> getTokens(){
        return tokens;
    }

    /**
     * gets if DreamTile can accept infinite Zzzs
     */
    @Override
    public boolean getIsInfinite(){
        return isInfinite;
    }

    /**
     * returns IZzzTokens that a player has on a DreamTIle
     *
     * @param player accessing their DreamTiles
     * @return Zzzs player has on DreamTile
     */
	 @Override
    public ArrayList<IZzzToken> getPlayerZzzs(IPlayer player) {
        ArrayList<IZzzToken> playerZzzs = new ArrayList<>();
        for (IZzzToken zzz : tokens) {
            if (zzz.getPlayer().equals(player)) {
                playerZzzs.add(zzz);
            }
        }
        return playerZzzs;
    }

    /**
     * adds a IZzzToken to the tokens ArrayList
     *
     * @param zzzToken to be added to DreamTile
     */
    public void addToken(IZzzToken zzzToken) {
        tokens.add(zzzToken);
    }



}
