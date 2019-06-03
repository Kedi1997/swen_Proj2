package mycontroller.strategy;

/**
 * Strategy towards reducing health usage
 * @author kedi peng
 *
 */
public class HealthStrategy extends PathStrategy {
	
	public HealthStrategy() {
		// need to avoid water and health when in health conserving mode
		avoidTiles.add("water");
		avoidTiles.add("health");
	}

}
