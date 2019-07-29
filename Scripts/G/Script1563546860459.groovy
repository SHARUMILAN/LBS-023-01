import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_F - Liabilities Debt Securities  Long-Term (Other Notes Bonds and Commercial Paper)/a_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)'))

WebUI.selectOptionByValue(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/COunterparty G'), 
    'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/In currency G'), 
    'US Dollar', true)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Banks Related G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Banks Related G'), 
    '32121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Banks(Unrelated) G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Banks(Unrelated) G'), 
    '12212', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Banks Central G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Banks Central G'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Non-financial G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Non-financial G'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Non-Bank G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Non-Bank G'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/General Gov G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/General Gov G'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Households G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Households G'), 
    '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Unallocated G'))

WebUI.setText(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/Unallocated G'), 
    '11111111111', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('H'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

