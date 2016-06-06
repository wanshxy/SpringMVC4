import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testAjax {
	public void  test(HttpServletRequest request,HttpServletResponse response){
		try {
			PrintWriter writer=response.getWriter();
			writer.write("asda");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
