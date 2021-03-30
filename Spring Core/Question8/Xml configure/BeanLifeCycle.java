
public class BeanLifeCycle {
	private String text;

	/*
	 * public BeanLifeCycle(String text) { super(); this.text = text; }
	 */
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public void display() {
		System.out.println("Text Message is:"+getText());
	}
	public void init() {
		System.out.println("This is the Initializing method");
	}
	public void destroy() {
		System.out.println("This is the Destroyable method");
	}

}
