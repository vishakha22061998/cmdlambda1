
package cmdlambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CmdDemo implements RequestHandler<Object, String>
{

	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input:" + input);
		//System.out.println("Hello World!");
		return "Hello World!.......";
	}
	
}