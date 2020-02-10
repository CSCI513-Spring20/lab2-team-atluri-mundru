
public class Ship {
	Point currentLocation;
	OceanMap oceanMap;
	
	public Ship(OceanMap oceanMap) {
		this.oceanMap = oceanMap;
		currentLocation = oceanMap.getShipLocation();
	}
	public Point getShipLocation() {
		return currentLocation;
	}
	public void goEast() {
		if(currentLocation.x<oceanMap.getDimensions()-1 && oceanMap.lsOcean(curretnLocation.x=1 , currentLocation.y )
				{
			 currentLocation.x++;
		}
	}
	public goWest() {
		if(curretnLocation.x >0 && oceanMap.lsOcean(currentLocation.x=1 , currentLocation.y)) {
			currentLocation.x--;
			
		}
	}
	public goNorth() {
		if(curremtLocation.y >0 && oceanMap.lsOcean(currentLocation.x , currentLocation.y-1))
		{
			currentLocation.y--;
		}
	}
	public goSouth() {
		if(currentLocation.y < oceanMap.getDimensions()-1 && oceanMap.lsOcean(currentLocation.x , currentLocation.y-1)) {
			currentLocation.y++;
		}
	}
}
