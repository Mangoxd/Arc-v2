package me.vrekt.arc.data.moving;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class MovingData {
    private static final Map<Player, MovingData> DATA_MAP = new HashMap<>();

    /**
     * Retrieve the players data.
     *
     * @param player the player
     * @return the data
     */
    public static MovingData getData(Player player) {
        DATA_MAP.putIfAbsent(player, new MovingData());
        return DATA_MAP.get(player);
    }

    /**
     * Remove the players data.
     *
     * @param player the player
     */
    public static void removeData(Player player) {
        if (DATA_MAP.containsKey(player)) {
            DATA_MAP.remove(player);
        }
    }

    private Location setback;
    private Location current;
    private Location previous;
    private Location ground;
    private Location safe;

    private boolean onGround, wasOnGround, flyingClientOnGround, positionClientOnGround;
    private boolean isAscending, isDescending, isClimbing;
    private boolean cancelMovingPackets;

    private long lastPacketUpdate;
    private double verticalSpeed, lastVerticalSpeed;

    private int airTicks, ascendingMoves, descendingMoves, groundTime;
    private int flyingPackets, positionPackets;
    private int iceTime, slimeblockTime, ladderTime;

    private VelocityData velocityData = new VelocityData();
    private long lastGameModeChange;

    public Location getSetback() {
        return setback;
    }

    public void setSetback(Location setback) {
        this.setback = setback;
    }

    public Location getCurrentLocation() {
        return current;
    }

    public void setCurrentLocation(Location current) {
        this.current = current;
    }

    public Location getPreviousLocation() {
        return previous;
    }

    public void setPreviousLocation(Location previous) {
        this.previous = previous;
    }

    public Location getGroundLocation() {
        return ground;
    }

    public void setGroundLocation(Location ground) {
        this.ground = ground;
    }

    public Location getSafe() {
        return safe;
    }

    public void setSafe(Location safe) {
        this.safe = safe;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public boolean wasOnGround() {
        return wasOnGround;
    }

    public void setWasOnGround(boolean wasOnGround) {
        this.wasOnGround = wasOnGround;
    }

    public boolean isFlyingClientOnGround() {
        return flyingClientOnGround;
    }

    public void setFlyingClientOnGround(boolean flyingClientOnGround) {
        this.flyingClientOnGround = flyingClientOnGround;
    }

    public boolean isPositionClientOnGround() {
        return positionClientOnGround;
    }

    public void setPositionClientOnGround(boolean positionClientOnGround) {
        this.positionClientOnGround = positionClientOnGround;
    }

    public boolean isAscending() {
        return isAscending;
    }

    public void setAscending(boolean ascending) {
        isAscending = ascending;
    }

    public boolean isDescending() {
        return isDescending;
    }

    public void setDescending(boolean descending) {
        isDescending = descending;
    }

    public boolean isClimbing() {
        return isClimbing;
    }

    public void setClimbing(boolean climbing) {
        isClimbing = climbing;
    }

    public VelocityData getVelocityData() {
        return velocityData;
    }

    public long getLastPacketUpdate() {
        return lastPacketUpdate;
    }

    public void setLastPacketUpdate(long lastPacketUpdate) {
        this.lastPacketUpdate = lastPacketUpdate;
    }

    public boolean cancelMovingPackets() {
        return cancelMovingPackets;
    }

    public void setCancelMovingPackets(boolean cancelMovingPackets) {
        this.cancelMovingPackets = cancelMovingPackets;
    }

    public double getVerticalSpeed() {
        return verticalSpeed;
    }

    public void setVerticalSpeed(double verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
    }

    public double getLastVerticalSpeed() {
        return lastVerticalSpeed;
    }

    public void setLastVerticalSpeed(double lastVerticalSpeed) {
        this.lastVerticalSpeed = lastVerticalSpeed;
    }

    public int getAirTicks() {
        return airTicks;
    }

    public void setAirTicks(int airTicks) {
        this.airTicks = airTicks;
    }

    public int getAscendingMoves() {
        return ascendingMoves;
    }

    public void setAscendingMoves(int ascendingMoves) {
        this.ascendingMoves = ascendingMoves;
    }

    public int getDescendingMoves() {
        return descendingMoves;
    }

    public void setDescendingMoves(int descendingMoves) {
        this.descendingMoves = descendingMoves;
    }

    public int getFlyingPackets() {
        return flyingPackets;
    }

    public void setFlyingPackets(int flyingPackets) {
        this.flyingPackets = flyingPackets;
    }

    public int getPositionPackets() {
        return positionPackets;
    }

    public void setPositionPackets(int positionPackets) {
        this.positionPackets = positionPackets;
    }

    public int getGroundTime() {
        return groundTime;
    }

    public void setGroundTime(int groundTime) {
        this.groundTime = groundTime;
    }

    public int getIceTime() {
        return iceTime;
    }

    public void setIceTime(int iceTime) {
        this.iceTime = iceTime;
    }

    public int getSlimeblockTime() {
        return slimeblockTime;
    }

    public void setSlimeblockTime(int slimeblockTime) {
        this.slimeblockTime = slimeblockTime;
    }

    public int getLadderTime() {
        return ladderTime;
    }

    public void setLadderTime(int ladderTime) {
        this.ladderTime = ladderTime;
    }

    public long getLastGameModeChange() {
        return lastGameModeChange;
    }

    public void setLastGameModeChange(long lastGameModeChange) {
        this.lastGameModeChange = lastGameModeChange;
    }
}
