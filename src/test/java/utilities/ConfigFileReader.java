package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private static ConfigFileReader configReader;

	private final String propertyFilePath = "src//test//resources//config//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}

	}

	public static ConfigFileReader getInstance() {
		if (configReader == null) {
			configReader = new ConfigFileReader();
		}
		return configReader;
	}

	private static String browserType = null;

	public static void setBrowserType(String browser) {
		browserType = browser;
	}

	public static String getBrowserType() {

		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");

	}


	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

	public String getPageTitle(String pageName) {
		String title = properties.getProperty(pageName);
		if (title != null)
			return title;
		else
			throw new RuntimeException(pageName + " url not specified in the Configuration.properties file.");
	}

	public String getIndexUrl() {
		String indexUrl = properties.getProperty("indexUrl");
		if (indexUrl != null)
			return indexUrl;
		else
			throw new RuntimeException(" Index url not specified in the Configuration.properties file.");
	}

	public String getHomeUrl() {
		String homepageUrl = properties.getProperty("homepageUrl");
		if (homepageUrl != null)
			return homepageUrl;
		else
			throw new RuntimeException(" homepage url not specified in the Configuration.properties file.");
	}

	public String getLoginUrl() {
		String loginUrl = properties.getProperty("loginUrl");
		if (loginUrl != null)
			return loginUrl;
		else
			throw new RuntimeException(" login url not specified in the Configuration.properties file.");
	}

	public String getRegisterUrl() {
		String registerUrl = properties.getProperty("registerUrl");
		if (registerUrl != null)
			return registerUrl;
		else
			throw new RuntimeException(" register url not specified in the Configuration.properties file.");
	}

	public String geWaitTime(String wait) {
		String waitTime = properties.getProperty(wait);
		if (waitTime != null)
			return wait;
		else
			throw new RuntimeException(wait + " not specified in the Configuration.properties file.");
	}

	public String getUsername() {
		String username = properties.getProperty("username");
		if (username != null)
			return username;
		else
			throw new RuntimeException("username  not specified in the Configuration.properties file.");
	}

	public String getPassword() {
		String password = properties.getProperty("password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("password not specified in the Configuration.properties file.");

	}

	public String getAlert(String alertNames) {
		String alertName = properties.getProperty(alertNames);
		if (alertName != null)
			return alertName;
		else
			throw new RuntimeException(alertName + " alert does not match in the Configuration.properties file.");
	}

	public String getFunctionalityMessage(String functionalityName) {
		String funcName = properties.getProperty(functionalityName);
		if (funcName != null)
			return funcName;
		else
			throw new RuntimeException(funcName + " does not match in the Configuration.properties file.");
	}

}