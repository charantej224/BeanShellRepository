import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class CallbackInfo {
    String dateTime = ""
    String phoneLine  = ""
}

class PiVersion {
    String platform = "3"
    String month = ""
    String version = ""
    String year = ""
}

class Owner {
    String ownerInd = "1"
    String name = ""
    String idType = ""
    String nric = ""
    String gender = ""
    String birthday = ""
    String relationship = ""
    String nationality = ""
}

class TaxResidencyInfo {
    String taxOption = "1"
    String taxResidency1 = "702"
    String tin1 = ""
    String noTinReasonCode1 = ""
    String noTinReason1 = ""
    String taxResidency2 = ""
    String tin2 = ""
    String noTinReasonCode2 = ""
    String noTinReason2 = ""
    String taxResidency3 = ""
    String tin3 = ""
    String noTinReasonCode3 = ""
    String noTinReason3 = ""
    String taxResidency4 = ""
    String tin4 = ""
    String noTinReasonCode4 = ""
    String noTinReason4 = ""
    String taxResidency5 = ""
    String tin5 = ""
    String noTinReasonCode5 = ""
    String noTinReason5 = ""
    String countryMatch = ""
    String countryNoMatchReason = ""
    String noMatchOption5details = ""
    String mailingMatch = ""
    String mailingNoMatchReason = ""
    String mailingNoMatchOption5details = ""
}

class BasicInfo {
    String policySource = "1"
    String submissionDate = ""
    String inceptionDate = ""
    String kycStatus = "5"
    String firstPremiumPayMethod = ""
    String renewalPremiumPayMethod = "1"
    String agentCode = "00000601676"
    String newGiroInd = ""
    String bankCode = ""
    String bankAccount = ""
    String creditCardNumber = ""
    String campaignCode = ""
    String introducerNRIC = ""
    String policyDeliveryMode = "5"
    String vestingAge = ""
    String expiryDate = ""
    String accountName = ""
    String giroIDType = ""
    String giroIDNumber = ""
    String reinvestment = "N"
    String cpfaccountNo = ""
    String advancePremiumAccount = ""
    TaxResidencyInfo taxResidencyInfo
    Owner owner
    String pepIndicator = "N"
    String mmoCall = ""
    String mmoSMS = ""
    String mmoEmail = "Y"
    String mmoPost = "Y"
    String backdate = ""
    String myInfo = ""
    String agentReferred = ""
    PiVersion piVersion
    CallbackInfo callbackInfo
    String source = "Online Life"
}

def jsonSlurper = new JsonSlurper();
def request = jsonSlurper.parseText(requestDetails);

def callbackInfoObj = new CallbackInfo();

def piVersionObj = new PiVersion(
    month : "",
    version : "",
    year : ""
);

def ownerObj = new Owner();
def taxResidencyInfoObj = new TaxResidencyInfo(
    tin1 : policyDetails.getNric()
 );

def bankCodeValue;
def firstPremiumPayMethod;

if(request.creditCardNumber){
    bankCodeValue = request.creditCardNumber.substring(0,1);
}
if(request.enet){
    firstPremiumPayMethod = "1";
} else {
    firstPremiumPayMethod = "30";
}

def basicInfoObj = new BasicInfo(
    submissionDate : "",
    inceptionDate : "",
    firstPremiumPayMethod : firstPremiumPayMethod,
    bankCode : bankCodeValue,
    bankAccount : request.creditCardNumber,
    creditCardNumber : request.creditCardNumber,
    expiryDate : request.expiryDate,
    accountName : request.accountName,
    taxResidencyInfo : taxResidencyInfoObj,
    owner : ownerObj,
    mmoCall : request.call,
    mmoSMS : request.text,
    backdate : "",
    myInfo : "",
    piVersion : piVersionObj,
    callbackInfo : callbackInfoObj
);

print System.getProperty("os.name")
print "charan"
JsonOutput.toJson(basicInfoObj)

