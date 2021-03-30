import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PrePostBean implements  InitializingBean,DisposableBean {
	private String text;
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public void display() {
		System.out.println("Text Message is:"+getText());
	}

	public void destroy() throws Exception {
		System.out.println("This is the Destroyable method");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("This is the Initializing method");
		
	}

}
