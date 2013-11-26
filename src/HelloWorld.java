
import edu.uw.cs.lil.tiny.geoquery.GeoGenericExperiment;
import edu.uw.cs.lil.tiny.geoquery.GeoMain;
import edu.uw.cs.utils.log.ILogger;
import edu.uw.cs.utils.log.LoggerFactory;

/**
 * Main class for GeoQuery experiments.
 * 
 * @author Yoav Artzi
 */
public class HelloWorld {
	public static final ILogger	LOG	= LoggerFactory.create(GeoMain.class);
	
	public static void main(String[] args) {
		//if (args.length < 1) {
	//		LOG.error("Missing arguments. Expects a .exp file as argument.");
		//	System.exit(-1);
		//}/
		String[] args2 = new String[]{"/Users/brawner/workspace/baking/recipes/spf_files/experiments/template/test/test.exp"};
		GeoGenericExperiment.main(args2);
	}
}