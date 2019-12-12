import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class LoginSteps {
	
	@Given("user is on the login page")
	def openLoginPage(){
		println '  I am inside function openLoginPage'
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/login')
	}
	
	@When("user enters (.*) and (.*)")
	def enterCredentials(String username, String password){
		println '  I am inside function enterCredentials'
		WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), password)
	}
	
	@And("clicks on login button")
	def clickLogin(){
		println '  I am inside function clickLogin'
		WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))
	}
	
	@Then("user is navigated to the homepage")
	def verifyHomePage(){
		println '  I am inside function verifyHomePage'
		WebUI.verifyTextPresent('Welcome Admin', false, FailureHandling.OPTIONAL)
		WebUI.closeBrowser()
	}
	
	
	
}
