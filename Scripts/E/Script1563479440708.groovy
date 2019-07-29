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

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/a_D - Claims Other Instruments (Accrued Interest Receivable and Other Assets)'))

WebUI.selectOptionByValue(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/CounterParty E'), 
    'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/In Currency E'), 
    'US Dollar', true)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Banks(related) E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Banks(related) E'), 
    '32121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Banks(Unrelated) E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Banks(Unrelated) E'), 
    '12212', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Banks (central banks) E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Banks (central banks) E'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Non-financial E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Non-financial E'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Non-bank E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Non-bank E'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/General Gov E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/General Gov E'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Households incl E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Households incl E'), 
    '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Unallocated by E'))

WebUI.setText(findTestObject('Page_E - Liabilities Debt Securities  Short-Term (Other Notes Bonds and Commercial Paper)/Unallocated by E'), 
    '11111111111', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('F'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

