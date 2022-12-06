public class TestShapes {
    public static void main(String[] args) {
        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        /*doShapes(player);*/
        doShapes(tile);
        tile.getAdjacent();

    }

    public static void doShapes(TilePiece shape){
        shape.displayShape();
        shape.getAdjacent();
    }
}
