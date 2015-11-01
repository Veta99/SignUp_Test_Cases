package core;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathException;
import javax.xml.xpath.XPathFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Document;

public class SignUp {
	public static void main(String[] args) throws ParserConfigurationException,
			IOException, XPathException, Exception {
		String test_case_id_01 = "TC-001.01";
		String test_case_id_0101 = "TC-001.01.01";
		String test_case_id_02 = "TC-001.02";
		String test_case_id_03 = "TC-001.03";
		String test_case_id_04 = "TC-001.04";
		String test_case_id_05 = "TC-001.05";
		String test_case_id_06 = "TC-001.06";
		String test_case_id_07 = "TC-001.07";
		String test_case_id_08 = "TC-001.08";
		String test_case_id_09 = "TC-001.09";
		String test_case_id_10 = "TC-001.10";
		String test_case_id_11_01 = "TC-001.11.01";
		String test_case_id_11_02 = "TC-001.11.02";
		String test_case_id_12 = "TC-001.12";
		String test_case_id_13_01 = "TC-001.13.01";
		// String test_case_id_13_02 = "TC-001.13.02";
		String test_case_id_14 = "TC-001.14";
		String test_case_id_15 = "TC-001.15";

		String title_exp = "Welcome to Sign Up v1";
		String title_app_exp = "Sign Up";
		String title_facebook_exp = "Facebook - Log In or Sign Up";
		String title_twitter_exp = "Twitter";
		String title_flickr_exp = "Flickr, a Yahoo company | Flickr - Photo Sharing!";
		String title_youtube_exp = "YouTube";
		String error_fname_empty_exp = "Please enter First Name";
		String error_lname_empty_exp = "Please enter Last Name";
		String error_email_empty_exp = "Please enter Email Address";
		String error_phone_exp = "Invalid Phone Number: should be 10 digits";
		String terms_conf_exp = "Agreed";
		String gender_conf_exp = "Male";
		String state_conf_exp = "California";
		String os_browser_exp = "Unknown OS & Firefox";

		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		// String url_v0 = "http://learn2test.net/qa/apps/sign_up/v0/";
		// String url_xml = "http://www.geoplugin.net/xml.gp?ip=98.234.255.26";
		String url_xml = "http://api.wunderground.com/api/8a75c2aa5ba78758/conditions/q/38.1348,-122.560997.xml";
		String fname = "Ivan";
		String lname = "Johnson";
		String email = "ij@g.ru";
		String phone = "7071234567";
		String phone_9 = "707123456";

		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// TC-001.01 Verify_title_page
		String title_act = driver.getTitle();
		if (title_exp.equals(title_act)) {
			System.out.println("");
			System.out.println(test_case_id_01 + " - Passed");
			System.out.println("Title Expected/Actual: " + title_exp + "/"
					+ title_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_01 + " - Failed");
			System.out.println("Title Expected/Actual: " + title_exp + "/"
					+ title_act);
		}

		// TC-001.01.01 Verify_title_App(if html element title app "Sign Up"
		// exists, check its title)
		WebElement e_title_app = driver.findElement(By.id("id_f_title"));
		if (e_title_app != null) {
			String title_app_act = driver.findElement(By.id("id_f_title"))
					.getText();

			if (title_app_act.equals(title_app_exp)) {
				System.out.println("");
				System.out.println(test_case_id_0101 + " - Passed ");
				System.out
						.println("Element1 exists: Actual title/Requir title: "
								+ title_app_act + "/" + title_app_exp);
			} else {
				System.out.println(test_case_id_0101 + " - Failed");
				System.out
						.println("Element1 exists: Actual title/Requir title: "
								+ title_app_act + "/" + title_app_exp);
			}
		} else {
			System.out.println("");
			System.out.print(test_case_id_0101 + " - Failed");
			System.out.println("Element1 does not exist");
		}

		// TC-001.02 Verify_link_Facebook page
		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_act = driver.getTitle();
		if (title_facebook_exp.equals(title_facebook_act)) {
			System.out.println("");
			System.out.println(test_case_id_02 + " - Passed");
			System.out.println("Title Expected/Actual: " + title_facebook_exp
					+ "/" + title_facebook_act);
		} else {
			System.out.println("");
			System.out
					.println("Test Case ID: " + test_case_id_02 + " - Failed");
			System.out.println("Title Expected/Actual: " + title_facebook_exp
					+ "/" + title_facebook_act);
		}
		driver.close();
		driver.switchTo().window(allTabs.get(0));
		// TC-001.03 Verify_link_twitter page
		driver.findElement(By.id("id_img_twitter")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs_tw = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs_tw.get(1));
		String title_twitter_act = driver.getTitle();
		if (title_twitter_exp.equals(title_twitter_act)) {
			System.out.println("");
			System.out.println(test_case_id_03 + " - Passed");
			System.out.println("Title Expected/Actual: " + title_twitter_exp
					+ "/" + title_twitter_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_03 + " - Failed");
			System.out.println("Title Expected/Actual: " + title_twitter_exp
					+ "/" + title_twitter_act);
		}
		driver.close();
		driver.switchTo().window(allTabs_tw.get(0));

		// TC-001.04 Verify_link_flick page
		driver.findElement(By.id("id_img_flickr")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs_fl = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs_fl.get(1));
		String title_flickr_act = driver.getTitle();
		if (title_flickr_exp.equals(title_flickr_act)) {
			System.out.println("");
			System.out.println(test_case_id_04 + " - Passed");
			System.out.println("Title Expected/Actual: " + title_flickr_exp
					+ "/" + title_flickr_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_04 + " - Failed");
			System.out.println("Title Expected/Actual: " + title_flickr_exp
					+ "/" + title_flickr_act);
		}
		driver.close();
		driver.switchTo().window(allTabs_fl.get(0));

		// TC-001.05 Verify_link_youtube page
		driver.findElement(By.id("id_img_youtube")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs_yt = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs_yt.get(1));
		String title_youtube_act = driver.getTitle();
		if (title_youtube_exp.equals(title_youtube_act)) {
			System.out.println("");
			System.out.println(test_case_id_05 + " - Passed");
			System.out.println("Title Expected/Actual: " + title_youtube_exp
					+ "/" + title_youtube_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_05 + " - Failed");
			System.out.println("Title Expected/Actual: " + title_youtube_exp
					+ "/" + title_youtube_act);
		}
		driver.close();
		driver.switchTo().window(allTabs_yt.get(0));

		// TC-001.06 Verify_error_handaling_first_name (empty First Name field)
		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_act = driver.findElement(By.id("ErrorLine"))
				.getText();
		if (error_fname_empty_exp.equals(error_fname_empty_act)) {
			System.out.println("");
			System.out.println(test_case_id_06 + " - Passed");
			System.out.println("ErrorExpected/Actual: " + error_fname_empty_exp
					+ "/" + error_fname_empty_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_06 + " - Failed");
			System.out.println("ErrorExpected/Actual:" + error_fname_empty_exp
					+ "/" + error_fname_empty_act);
		}
		// driver.findElement(By.id("id_reset_button")).click();

		// TC-001.07 Verify_error_handaling_last_name (empty Last Name field)
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_submit_button")).click();
		String error_lname_empty_act = driver.findElement(By.id("ErrorLine"))
				.getText();
		if (error_lname_empty_exp.equals(error_lname_empty_act)) {
			System.out.println("");
			System.out.println(test_case_id_07 + " - Passed");
			System.out.println("ErrorExpected/Actual: " + error_lname_empty_exp
					+ "/" + error_lname_empty_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_07 + " - Failed");
			System.out.println("ErrorExpected/Actual: " + error_lname_empty_exp
					+ "/" + error_lname_empty_act);
		}
		//driver.findElement(By.id("id_reset_button")).click();

		// TC-001.08 Verify_error_handaling_email
		//driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_submit_button")).click();
		String error_email_empty_act = driver.findElement(By.id("ErrorLine"))
				.getText();
		if (error_email_empty_exp.equals(error_email_empty_act)) {
			System.out.println("");
			System.out.println(test_case_id_08 + " - Passed");
			System.out.println("ErrorExpected/Actual: " + error_email_empty_exp
					+ "/" + error_email_empty_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_08 + " - Failed");
			System.out.println("ErrorExpected/Actual: " + error_lname_empty_exp
					+ "/" + error_lname_empty_act);
		}
		//driver.findElement(By.id("id_reset_button")).click();

		// TC-001.09 Verify_error_handaling_phone_number (phone number contains
		// 9 digits)

		//driver.findElement(By.id("id_fname")).sendKeys(fname);
		//driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone_9);
		driver.findElement(By.id("id_submit_button")).click();
		String error_phone_act = driver.findElement(By.id("ErrorLine"))
				.getText();
		if (error_phone_exp.equals(error_phone_act)) {
			System.out.println("");
			System.out.println(test_case_id_09 + " - Passed");
			System.out.println("ErrorExpected/Actual: " + error_phone_exp + "/"
					+ error_phone_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_09 + " - Failed");
			System.out.println("ErrorExpected/Actual: " + error_phone_exp + "/"
					+ error_phone_act);
		}
		driver.findElement(By.id("id_reset_button")).click();

		// TC-001.10 Verify_submit_form
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_g_radio_01")).click();
		new Select(driver.findElement(By.id("id_state")))
				.selectByVisibleText("California");
		driver.findElement(By.id("id_checkbox")).click();
		driver.findElement(By.id("id_submit_button")).click();
		String fname_conf_act = driver.findElement(By.id("id_fname_conf"))
				.getText();
		String lname_conf_act = driver.findElement(By.id("id_lname_conf"))
				.getText();
		String email_conf_act = driver.findElement(By.id("id_email_conf"))
				.getText();
		String phone_conf_act = driver.findElement(By.id("id_phone_conf"))
				.getText();
		String gender_conf_act = driver.findElement(By.id("id_gender_conf"))
				.getText();
		String terms_conf_act = driver.findElement(By.id("id_terms_conf"))
				.getText();
		String state_conf_act = driver.findElement(By.id("id_state_conf"))
				.getText();

		if (fname.equals(fname_conf_act) && lname.equals(lname_conf_act)
				&& email.equals(email_conf_act) && phone.equals(phone_conf_act)
				&& gender_conf_exp.equals(gender_conf_act)
				&& state_conf_exp.equals(state_conf_act)
				&& terms_conf_exp.equals(terms_conf_act)) {
			System.out.println("");
			System.out.println(test_case_id_10 + " - Passed");
			System.out.println("First Expected/Actual: " + fname + "/"
					+ fname_conf_act);
			System.out.println("Last Expected/Actual: " + lname + "/"
					+ lname_conf_act);
			System.out.println("Email Expected/Actual: " + email + "/"
					+ email_conf_act);
			System.out.println("Phone Expected/Actual: " + phone + "/"
					+ phone_conf_act);
			System.out.println("Gender Expected/Actual: " + gender_conf_exp
					+ "/" + gender_conf_act);
			System.out.println("State Expected/Actual: " + state_conf_exp + "/"
					+ state_conf_act);
			System.out.println("Terms Expected/Actual: " + terms_conf_exp + "/"
					+ terms_conf_act);

		} else {
			System.out.println("");
			System.out.println(test_case_id_10 + " - Failed");
			System.out.println("First Expected/Actual: " + fname + "/"
					+ fname_conf_act);
			System.out.println("Last Expected/Actual: " + lname + "/"
					+ lname_conf_act);
			System.out.println("Email Expected/Actual: " + email + "/"
					+ email_conf_act);
			System.out.println("Phone Expected/Actual: " + phone + "/"
					+ phone_conf_act);
			System.out.println("Gender Expected/Actual: " + gender_conf_exp
					+ "/" + gender_conf_act);
			System.out.println("State Expected/Actual: " + state_conf_exp + "/"
					+ state_conf_act);
			System.out.println("Terms Expected/Actual: " + terms_conf_exp + "/"
					+ terms_conf_act);
		}
		driver.get(url);// return to main page
		// driver.findElement(By.id("id_reset_button")).click();

		// TC-001.11.01 Verify_content_quotes (get quote)

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("");
			System.out.println(test_case_id_11_01 + " - Passed");
			System.out.println("Quote length: " + quote.length());
		} else {
			System.out.println("");
			System.out.println(test_case_id_11_01 + " - Failed");
			System.out.println("Quote length: " + quote.length());
		}

		// TC-001.11.02 Verify_content_quotes (new quote)
		driver.findElement(By.id("id_quotes")).getText();
		driver.navigate().refresh();
		String quote2 = driver.findElement(By.id("id_quotes")).getText();
		if (quote.equals(quote2)) {
			System.out.println("");
			System.out.println(test_case_id_11_02 + " - Failed");
			System.out.println("Quote/Quote2" + quote + "/" + quote2);
		} else {
			System.out.println("");
			System.out.println(test_case_id_11_02 + " - Passed");
			System.out.println("Quote/Quote2" + quote + "/" + quote2);
		}

		// TC-001.12 Verify _content_current_city
		DocumentBuilderFactory bf = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = bf.newDocumentBuilder();
		Document doc = b.parse(url_xml);
		// doc.getDocumentElement().normalize();
		XPath xpath = XPathFactory.newInstance().newXPath();
		String current_loc_act = xpath.compile(
				"response/current_observation/display_location/full").evaluate(
				doc);
		// String current_city_act =
		// xpath.compile("geoPlugin/geoplugin_city").evaluate(doc);
		// String current_state_act =
		// xpath.compile("geoPlugin/geoplugin_region").evaluate(doc);
		// String current_loc_act = current_city_act + ", " + current_state_act;
		driver.get(url);// testing of the method performance
		// driver.get(url_v0);//real testing
		driver.findElement(By.id("id_current_location")).isDisplayed();
		String current_loc_exp = driver.findElement(
				By.id("id_current_location")).getText();
		if (current_loc_exp.equals(current_loc_act)) {
			System.out.println("");
			System.out.println(test_case_id_12 + " - PASSED");
			System.out.println("Location Expected/Actual: " + current_loc_exp
					+ "/" + current_loc_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_12 + " - FAILED");
			System.out.println("Location Expected/Actual: " + current_loc_exp
					+ "/" + current_loc_act);
		}
		// TC-001.13.01 Verify _content_current_weather (temperature validation)
		String current_tem_act = xpath.compile(
				"response/current_observation/temp_f").evaluate(doc)
				+ " ℉";
		driver.findElement(By.id("id_current_location")).isDisplayed();
		String current_tem_exp = driver.findElement(By.id("id_temperature"))
				.getText();
		if (current_tem_exp.equals(current_tem_act)) {
			System.out.println("");
			System.out.println(test_case_id_13_01 + " - PASSED");
			System.out.println("Location Expected/Actual:" + current_tem_exp
					+ "/" + current_tem_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_13_01 + " - FAILED");
			System.out.println("Location Expected/Actual:" + current_tem_exp
					+ "/" + current_tem_act);
		}

		/*
		 * // TC-001.13.02 Verify _content_current_weather (weather icon
		 * validation) 
		 * String weather_icon_act = xpath.compile("response/current_observation/icon").evaluate(doc);
		 * WebElement weather_icon = driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[5]/table/tbody/tr[2]/td[1]/img"));
		 * String weather_icon_exp = weather_icon.getAttribute("src");
		 * if (weather_icon_exp.equals(weather_icon_act)) {
		 * System.out.println("");
		 * System.out.println(test_case_id_13_02+" - PASSED");
		 * System.out.println("Weather Expected/Actual: "+weather_icon_exp+"/"+weather_icon_act);
		 * } else{ 
		 * System.out.println("");
		 * System.out.println(test_case_id_13_02+" - FAILED");
		 * System.out.println
		 * ("Weather Expected/Actual: "+weather_icon_exp+"/"+weather_icon_act);
		 * }
		 * driver.close(); // close url_v0
		 */

		// TC-001.14 Verify _content_date (current day validation)
		DateFormat dtFormat = new SimpleDateFormat("MMMMM dd, YYYY ");
		Calendar cal = Calendar.getInstance();
		String current_day = dtFormat.format(cal.getTime());
		String current_date_app = driver.findElement(By.id("timestamp"))
				.getText();
		if (current_date_app.equalsIgnoreCase(current_day)) {
			System.out.println("");
			System.out.println(test_case_id_14 + " - PASSED");
			System.out.println("Current day/current date in app: "
					+ current_day + "/" + current_date_app);
		} else {
			System.out.println("");
			System.out.println(test_case_id_14 + " - FAILED");
			System.out.println("Current day/current date app: " + current_day
					+ "/" + current_date_app);
		}

		// TC-001.15 Verify _content_os_ana_browser (OS and Browser validation)
		String os_browser_act = driver.findElement(By.id("os_browser"))
				.getText();
		if (os_browser_exp.equals(os_browser_act)) {
			System.out.println("");
			System.out.println(test_case_id_15 + " - PASSED");
			System.out.println("OS & Browser Expected/Actual: "
					+ os_browser_exp + "/" + os_browser_act);
		} else {
			System.out.println("");
			System.out.println(test_case_id_15 + " - FAILED");
			System.out.println("OS & Browser Expected/Actual: "
					+ os_browser_exp + "/" + os_browser_act);
		}
		driver.close();
	}// main
}// class
