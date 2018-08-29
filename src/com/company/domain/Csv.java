package com.company.domain;

public class Csv {

    private String teamName;
    private String appId;
    private String appName;
    private String vulnerabilityId;
    private String vulnerabilityName;
    private String vulnerabilityReference;
    private String severity;
    private String status;
    private String openDate;
    private String scanner;
    private String cweId;
    private String cweName;
    private String owaspTopTen;
    private String path;
    private String parameter;
    private String payload;
    private String attackSurfacePath;
    private String attackString;
    private String attackRequest;
    private String attackResponse;
    private String scannerDetails;
    private String scannerRecommendation;
    private String remediationTargetDate;
    private String applicationTags;
    private String vulnerabilityTags;


    public Csv(String teamName,
                   String appId,
                   String appName,
                   String vulnerabilityId,
                   String vulnerabilityName,
                   String vulnerabilityReference,
                   String severity,
                   String status,
                   String openDate,
                   String scanner,
                   String cweId,
                   String cweName,
                   String owaspTopTen,
                   String path,
                   String parameter,
                   String payload,
                   String attackSurfacePath,
                   String attackString,
                   String attackRequest,
                   String attackResponse,
                   String scannerDetails,
                   String scannerRecommendation,
                   String remediationTargetDate,
                   String applicationTags,
                   String vulnerabilityTags) {
        this.teamName = teamName;
        this.appId = appId;
        this.appName = appName;
        this.vulnerabilityId = vulnerabilityId;
        this.vulnerabilityName = vulnerabilityName;
        this.vulnerabilityReference = vulnerabilityReference;
        this.severity = severity;
        this.status = status;
        this.openDate = openDate;
        this.scanner = scanner;
        this.cweId = cweId;
        this.cweName = cweName;
        this.owaspTopTen = owaspTopTen;
        this.path = path;
        this.parameter = parameter;
        this.payload = payload;
        this.attackSurfacePath = attackSurfacePath;
        this.attackString = attackString;
        this.attackRequest = attackRequest;
        this.attackResponse = attackResponse;
        this.scannerDetails = scannerDetails;
        this.scannerRecommendation = scannerRecommendation;
        this.remediationTargetDate = remediationTargetDate;
        this.applicationTags = applicationTags;
        this.vulnerabilityTags = vulnerabilityTags;
    }




    public String getOwaspTopTen() {
        return owaspTopTen;
    }

    public void setOwaspTopTen(String owaspTopTen) {
        this.owaspTopTen = owaspTopTen;
    }

    public String getCweName() {
        return cweName;
    }

    public void setCweName(String cweName) {
        this.cweName = cweName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVulnerabilityId() {
        return vulnerabilityId;
    }

    public void setVulnerabilityId(String vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
    }

    public String getVulnerabilityReference() {
        return vulnerabilityReference;
    }

    public void setVulnerabilityReference(String vulnerabilityReference) {
        this.vulnerabilityReference = vulnerabilityReference;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    public String getCweId() {
        return cweId;
    }

    public void setCweId(String cweId) {
        this.cweId = cweId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getAttackSurfacePath() {
        return attackSurfacePath;
    }

    public void setAttackSurfacePath(String attackSurfacePath) {
        this.attackSurfacePath = attackSurfacePath;
    }

    public String getAttackString() {
        return attackString;
    }

    public void setAttackString(String attackString) {
        this.attackString = attackString;
    }

    public String getAttackRequest() {
        return attackRequest;
    }

    public void setAttackRequest(String attackRequest) {
        this.attackRequest = attackRequest;
    }

    public String getAttackResponse() {
        return attackResponse;
    }

    public void setAttackResponse(String attackResponse) {
        this.attackResponse = attackResponse;
    }

    public String getScannerDetails() {
        return scannerDetails;
    }

    public void setScannerDetails(String scannerDetails) {
        this.scannerDetails = scannerDetails;
    }

    public String getScannerRecommendation() {
        return scannerRecommendation;
    }

    public void setScannerRecommendation(String scannerRecommendation) {
        this.scannerRecommendation = scannerRecommendation;
    }

    public String getRemediationTargetDate() {
        return remediationTargetDate;
    }

    public void setRemediationTargetDate(String remediationTargetDate) {
        this.remediationTargetDate = remediationTargetDate;
    }

    public String getVulnerabilityTags() {
        return vulnerabilityTags;
    }


    public String getVulnerabilityName() {
        return vulnerabilityName;
    }

    public void setVulnerabilityName(String vulnerabilityName) {
        this.vulnerabilityName = vulnerabilityName;
    }

    public void setVulnerabilityTags(String vulnerabilityTags) {
        this.vulnerabilityTags = vulnerabilityTags;
    }

    public String getApplicationTags() {
        return applicationTags;
    }

    public void setApplicationTags(String applicationTags) {
        this.applicationTags = applicationTags;
    }


//    @Override
//    public String toString() {
//        return "DgCsvData [ Team Name= " + teamName
//        + ",app Unique ID= " + appId
//                + "  Application Name= " + appName
//                + " ,Vulnerability ID= " + vulnerabilityId
//                + " ,Vulnerability Name= " + vulnerabilityName
//                + " ,Vulnerability Reference= " + vulnerabilityReference
//                + " ,Severity= " + severity
//                + " ,Status= " + status
//                + " ,Open Date= " + openDate
//                + " ,Scanner= " + scanner
//                + " ,CWE ID= " + cweId
//                + " ,CWE Name= " + cweName
//                + " ,OWASP Top 10= " + owaspTopTen
//                + " , Path= " + path
//                + " ,Parameter= " + parameter
//                + " ,Payload= " + payload
//                + " ,Attack Surface Path= " + attackSurfacePath
//                + " ,Attack String= " + attackString
//                + " ,Attack Request= " + attackResponse
//                + " ,Attack Response= " + attackResponse
//                + " ,Scanner Details= " + scannerDetails
//                + " ,Scanner Recommendation= " + scannerRecommendation
//                + " ,Remediation Target Date= " + remediationTargetDate
//                + " ,Application Tags= " + applicationTags
//                + " ,Vulnerability Tags=" + vulnerabilityTags;
//    }
}
