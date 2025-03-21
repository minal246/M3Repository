package DataDrivenFrameWork;

public class ValidLogIn implements IAutoConstant1 {

	public static void main(String[] args) {
		Flip flip = new Flip();
		String url = flip.readPropertyData(PROP_PATH);
		flip.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
		

	}

}
 