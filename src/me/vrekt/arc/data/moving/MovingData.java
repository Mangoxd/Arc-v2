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

    private Location current;
    private Location previous;
    private Location ground;

    private boolean onGround;
    private boolean wasOnGround;
    private boolean clientOnGround;
    private boolean isAscending;
    private boolean isDescending;
    private boolean isClimbing;

    private long lastMovingUpdate;
    private long lastPacketUpdate;
    private boolean cancelMovingPackets;

    private double verticalSpeed;
    private double lastVerticalSpeed;

    private int airTicks;
    private int ascendingMoves, descendingMoves;
    private int movingPackets;

    private VelocityData velocityData = new VelocityData();

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

    public boolean isClientOnGround() {
        return clientOnGround;
    }

    public void setClientOnGround(boolean clientOnGround) {
        this.clientOnGround = clientOnGround;
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

    public long getLastMovingUpdate() {
        return lastMovingUpdate;
    }

    public void setLastMovingUpdate(long lastMovingUpdate) {
        this.lastMovingUpdate = lastMovingUpdate;
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

    public int getMovingPackets() {
        return movingPackets;
    }

    public void setMovingPackets(int movingPackets) {
        this.movingPackets = movingPackets;
    }
}