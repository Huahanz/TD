package Helpers;

public class MapData{
	//0 is empty
	//1 is wall
	//2 to 9 is tower
	public static int[][] map = {
			{0,1,0,0,0,0,0,0,0,0},
			{0,1,0,1,1,1,1,1,1,0},
			{0,1,0,1,0,0,0,0,1,0},
			{0,1,0,1,0,1,1,0,1,0},
			{0,1,0,1,0,1,1,0,1,0},
			{0,1,0,1,0,0,1,0,1,0},
			{0,1,0,1,1,1,1,0,1,0},
			{0,1,0,0,0,0,0,0,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0},
	};
	
	public static int[][] map1 = {
		{0,1,0,0,0,0,0,0,0,0},
		{0,1,0,1,1,1,1,1,1,0},
		{0,1,0,2,0,0,0,0,1,0},
		{0,1,0,2,0,1,1,0,1,0},
		{0,1,0,2,0,1,1,0,1,0},
		{0,1,0,1,0,0,1,0,1,0},
		{0,1,0,1,1,1,1,0,1,0},
		{0,1,0,0,0,0,0,0,1,0},
		{0,1,1,1,1,1,1,1,1,0},
		{0,0,0,0,0,0,0,0,0,0},
	};
	public static int[][] map2 = {
		{0,1,0,0,0,0,0,0,0,0},
		{0,1,0,1,1,1,1,1,1,0},
		{0,1,0,1,0,0,0,0,1,0},
		{0,1,0,1,0,1,1,0,1,0},
		{0,1,0,1,0,1,1,0,1,0},
		{0,1,0,1,0,0,1,0,1,0},
		{0,1,0,1,1,1,1,0,1,0},
		{0,1,0,0,0,0,0,0,1,0},
		{0,1,1,1,1,1,1,1,1,0},
		{0,0,0,0,0,0,0,0,0,0},
	};
	public static int[][] map4 = {
		{0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	};
	
	public static String[] mapImagePath = {
		"", "", "/Users/huahan/Pictures/PurpleD.jpg", "/Users/huahan/Pictures/PurpleRedS.jpg"
	};
	
	public static int[] towerSize = {0, 0, 1, 1, 1, 1, 1, 1, 1};	
	public static int[][] loadMap(int mapNum){
		int[][] r = null;
		if(mapNum == 0){
			r = map;
		}else if(mapNum == 1){
			r = map1;
		}else if(mapNum == 2){
			r = map2;
		}else if(mapNum == 4){
			r = map4;
		}
		Config.slotWidth = Config.defaultOneSlotWidth / r[0].length;
		Config.slotHeight = Config.defaultOneSlotHeight / r.length;
		return r;
	}
	public static int[][] getMap(int mapNum){
		return map = null;
	}
}