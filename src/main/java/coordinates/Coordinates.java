package coordinates;

public record Coordinates(int x, int y) {
    public String getCoordinates(){
        return this.x + ":" + this.y;
    }
}
