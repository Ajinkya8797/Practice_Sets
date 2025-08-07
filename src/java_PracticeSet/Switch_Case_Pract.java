package java_PracticeSet;

public class Switch_Case_Pract {

	public static void main(String[] args) {

//		1. Cross Browser Logic
		String browser = "brave";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;

		default:
			System.out.println("Please Pass the Right Browser..." + browser);
			break;
		}

//		2.	Test Environment Selector
		String env = "prod";
		switch (env.toLowerCase().trim()) {
		case "dev":
			System.out.println("Running Test On Dev Environment - https://dev.example.com");
			break;
		case "qa":
			System.out.println("Running Test On QA Environment - https://qa.example.com");
			break;
		case "stage":
			System.out.println("Running Test On Dev Environment - https://stage.example.com");
			break;
		case "prod":
			System.out.println("Running Test On prod Environment - https://www.example.com");
			break;

		default:
			System.out.println("Invalid environment");
			break;
		}

//		3.	Browser Version Selector
		String browserVersion = "v107";
		switch (browserVersion) {
		case "v100":
			System.out.println("Running Tests on v100");
			break;
		case "v101":
			System.out.println("Running Tests on v101");
			break;
		case "v102":
			System.out.println("Running Tests on v102");
			break;
		case "v103":
			System.out.println("Running Tests on v103");
			break;

		default:
			System.out.println("Unsupported browser Version : " + browserVersion);
			break;
		}

//		4. HTTP Status Codes
		int statusCode = 404;
		switch (statusCode) {
		case 200:
			System.out.println("Ok");
			break;
		case 201:
			System.out.println("Created");
			break;
		case 400:
			System.out.println("Bad Request");
			break;
		case 404:
			System.out.println("Not Found");
			break;
		case 500:
			System.out.println("Internal Server Error");
			break;

		default:
			System.out.println("Unknown Status Code");
			break;
		}

//		5.API Request Method Selector
		String method = "Put";
		switch (method.toLowerCase().trim()) {
		case "get":
			System.out.println("Sending GET request to fetch data");
			break;
		case "put":
			System.out.println("Sending POST request to create resource");
			break;
		case "post":
			System.out.println("Sending PUT request to update resource");
			break;
		case "delete":
			System.out.println("Sending DELETE request to remove resource");
			break;

		default:
			System.out.println("Unsupported HTTP method");
			break;
		}

//		6.Mobile OS Compatibility
		String os = "Linux";
		switch (os.toLowerCase().trim()) {
		case "android":
			System.out.println("Running Tests On Android");
			break;
		case "ios":
			System.out.println("Running Tests On Ios");
			break;
		case "windows":
			System.out.println("Running Tests On Windows");
			break;
		case "mac":
			System.out.println("Running Tests On Mac");
			break;
		case "linux":
			System.out.println("Running Tests On Linux");
			break;

		default:
			System.out.println("Unsupported Os");
			break;
		}

//		7.Language or Locale Selector
		String lang = "fr";
		switch (lang.toLowerCase().trim()) {
		case "en":
			System.out.println("Hello");
			break;
		case "fr":
			System.out.println("Bonjour");
			break;
		case "es":
			System.out.println("Hola");
			break;

		default:
			System.out.println("Language not supported");
			break;
		}

//		8.	Month to Number of Days
		int month = 41;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
		case 2:
			System.out.println("28 or 29 Days");
			break;

		default:
			System.out.println("Invalid Month");
			break;
		}

	}

}
