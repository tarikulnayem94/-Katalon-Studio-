import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://demo.opencart.com/index.php?route=account/login')

WebUI.setText(findTestObject('Store Objects to Repository/Your_Store_demo.opencart.com/E-Mail Address'), 'tarikul.ewu@gmail.com')

WebUI.setText(findTestObject('Store Objects to Repository/Your_Store_demo.opencart.com/Password'), 'Nayem2888')

WebUI.click(findTestObject('Store Objects to Repository/Your_Store_demo.opencart.com/Login_Button'))

WebUI.closeBrowser()

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Store Objects to Repository/Login_Page/Username_textBox'), 'Admin')

WebUI.setText(findTestObject('Store Objects to Repository/Login_Page/Password_textBox'), 'admin123')

WebUI.click(findTestObject('Store Objects to Repository/Same_Page/Login_Button'))

WebUI.closeBrowser()

