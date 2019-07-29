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

WebUI.selectOptionByValue(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/CounterParty D'), 
    'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/In currency D'), 
    'US Dollar', true)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks D'), '32121', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks(Unrelated) D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks(Unrelated) D'), 
    '341241242', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks(central) D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Banks(central) D'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-financial D'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-financial D'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-Bank D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Non-Bank D'), '212121', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/General Gov D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/General Gov D'), 
    '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/HouseHold incl D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/HouseHold incl D'), 
    '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Unallocated D'))

WebUI.setText(findTestObject('Page_C - Claims Loans (Cash Deposit Balances and CDs Loans and Advances)/Unallocated D'), 
    '11111111111', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('E'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

