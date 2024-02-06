package elementos;

import org.openqa.selenium.By;

public class Elementos {

	//Pagina Alerts
	
	public By btnToSeeAlert = By.xpath("//button[@id='alertButton']");
	public By btnClickAlert  = By.xpath("//button[@id='timerAlertButton']");
	public By btnClickConfirmBox  = By.xpath("//button[@id='confirmButton']");
	public By btnClickPrompt = By.xpath("//button[@id='promtButton']");
	
	
	//Pagina Modal
	
	public By btnSmallModal = By.xpath("//button[@id='showSmallModal']");
	public By btnLargeModal = By.xpath("//button[@id='showLargeModal']");
	public By btncloseSmallModal = By.xpath("//button[@id='closeSmallModal']");
	public By btncloseLargeModal = By.xpath("//button[@id='closeLargeModal']");
	public By btnBodySmallModal = By.xpath("//div[@class='modal-body']");
	public By btncBodyLargeModal = By.xpath("//p[@class]");
	
	
	
	//Pagina Practice form
	
	public By btnFirstName = By.xpath("//input[@id='firstName']");
	public By btnLastName = By.xpath("//input[@id='lastName']");
	public By btnEmail = By.xpath("//input[@placeholder='name@example.com']");
	public By btnMale = By.xpath("//label[@for='gender-radio-1']");
	public By btnFemale = By.xpath("//label[@for='gender-radio-2']");
	public By btnOther = By.xpath("//label[@for='gender-radio-3']");
	public By btnMobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
	public By btnDateOfBirth = By.xpath("//input[@id='dateOfBirthInput']");
	public By btnMonthSelect = By.xpath("//select[@class='react-datepicker__month-select']");
	public By btnMonthResults = By.xpath("//select[@class='react-datepicker__month-select']//option [@value='0']");
	public By btnYearSelect = By.xpath("//select[@class='react-datepicker__year-select']");
	public By btnYearResults = By.xpath("//select[@class='react-datepicker__year-select']//option [@value='1995']");
	public By btnNumberResults = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015 react-datepicker__day--weekend']");
	public By btnSubjects = By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']");
	public By btnHobbies = By.xpath("//label[@for=\'hobbies-checkbox-1']");
	public By btnHobbies2 = By.xpath("//label[@for=\'hobbies-checkbox-2']");
	public By btnPicture = By.xpath("//input[@id='uploadPicture']");
	public By btncurrentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By btnSubmit = By.xpath("//button[@id='submit']");
}
