package com.dandan.mybatis.generator.pojo;

import com.dandan.common.utils.Bool;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String id;

    private String orderNumber;

    private String partnerOrderNumber;

    private Date userExpectDate;

    private Integer userExpectTimeSoltId;

    private Date finalAgreeDate;

    private Integer finalAgreeTimeSoltId;

    private String artisanName;

    private String artisanMobile;

    private String artisanAddress;

    private String merchantName;

    private String merchantContactName;

    private String merchantContactPhoneNumber;

    private String isAuthenticationMerchantOrder;

    private String merchantAuthenticationName;

    private Date createTime;

    private Date updateTime;

    private Date publishTime;

    private Date grabingTime;

    private Date confirmAddressTime;

    private Date deliverTime;

    private Date receiveTime;

    private Date assigningTime;

    private Date signTime;

    private Date servingCompletedTime;

    private Date customerAcceptanceTime;

    private Date completedTime;

    private BigDecimal signLongitude;

    private BigDecimal signLatitude;

    private String isGrabbed;

    private BigDecimal customerPrepayAmount;

    private Long grabOrderTimestamp;

    private BigDecimal artisanIncomeAmount;

    private BigDecimal artisanRewardPunishmentTotalAmount;

    private BigDecimal artisanTakingProductRewardAmount;

    private BigDecimal artisanAgentChargeRewardAmount;

    private BigDecimal artisanServiceAmount;

    private BigDecimal artisanDistancePaymentAmount;

    private BigDecimal artisanAmendmentAmount;

    private BigDecimal artisanAdditionAmount;

    private String artisanAdditionAmountNote;

    private BigDecimal artisanExtraChargeAdditionAmount;

    private Integer artisanServiceTotalScore;

    private BigDecimal merchantTotalPaymentAmount;

    private BigDecimal merchantAgentChargePaymentAmount;

    private BigDecimal merchantServiceDiscountAmount;

    private BigDecimal merchantServicePaymentAmount;

    private BigDecimal merchantDistancePaymentAmount;

    private BigDecimal merchantAdditionPaymentAmount;

    private String merchantAdditionPaymentAmountNote;

    private String merchantAdditionPaymentUrl1;

    private String merchantAdditionPaymentUrl2;

    private String merchantAdditionPaymentUrl3;

    private String merchantAgreementUrl;

    private BigDecimal orderEstimateMaxAmount;

    private BigDecimal orderIncomeAmount;

    private Integer qualityAssuranceDays;

    private String isTakingProduct;

    private String isTakingGoods;

    private String isCustomerPayment;

    private String customerPaymentSuccess;

    private BigDecimal customerAdditionPaymentAmount;

    private String customerAdditionPaymentAmountNote;

    private BigDecimal customerTotalPaymentAmount;

    private Bool agentCharge;

    private BigDecimal agentChargeAmount;

    private String deliveryOrderNumber;

    private String deliveryReceiptUrl;

    private Integer deliveryCompanyId;

    private String merchantId;

    private String dealerFullName;

    private String artisanLeaderId;

    private String artisanId;

    private Integer statusId;

    private Date statusBeginTime;

    private String isWarning;

    private Date pendingProcessTime;

    private String waitingGrabProcesserId;

    private String waitingGrabProcesserName;

    private String processerId;

    private String processerName;

    private Integer markupNumber;

    private Integer markupIntervalMinutes;

    private BigDecimal markupAmount;

    private String createdById;

    private Integer createdAccountTypeId;

    private Integer visibilityId;

    private String processStepCode;

    private Integer perProcessStepProcessCount;

    private String isCustomerReminder;

    private Date customerReminderTime;

    private String isConformVisitCondition;

    private Date conformVisitConditionTime;

    private String channel;

    private String channelOrderNumber;

    private String customerChannelAccount;

    private Date finalAgreeTimeStart;

    private Date finalAgreeTimeEnd;

    private String isCheckoutOffline;

    private String reimbursementArtisanId;

    private String serveArtisanPhoneNumber;

    private String isCityPartnerCreated;

    private String merchantType;

    private String serviceProviderId;

    private String serviceProviderName;

    private String isDefaultServiceProvider;

    private String isRedPacketUsed;

    private String isRemote;

    private String orderTagStr;

    private String innerTagStr;

    private String isTeamOrder;

    private String isTimeoutOrder;

    private String isProblemOrder;

    private String isComplaintsOrder;

    private String isArtisanExtraCharge;

    private String isPraiseAwardOrder;

    private BigDecimal customerPraiseAwardAmount;

    private BigDecimal artisanPraiseAwardAmount;

    private BigDecimal customerPraiseAwardAmountConfig;

    private BigDecimal artisanPraiseAwardAmountConfig;

    private String isExtendWarrantyOrder;

    private BigDecimal artisanRecommendAwardAmount;

    private BigDecimal artisanRecommendAwardAmountConfig;

    private String extendWarrantyIsPaid;

    private String twoDaysExtendWarrantyPush;

    private Date twoDaysExtendWarrantyPushTime;

    private String sparePartsClearingTypeCode;

    private String unconfirmedServingTime;

    private String isProductReceiving;

    private String isSystemSingProductReceiving;

    private String isNeedServing;

    private String sendOrderSmsSign;

    private String isCheckSignPhoto;

    private String notePicture;

    private String isProprietaryMerchantCreated;

    private String note;

    private String employeeNote;

    private String innerLabelNote;

    private String artisanEnvCheckNote;

    private String artisanAcceptanceNote;

    private String artisanAcceptanceJson;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getPartnerOrderNumber() {
        return partnerOrderNumber;
    }

    public void setPartnerOrderNumber(String partnerOrderNumber) {
        this.partnerOrderNumber = partnerOrderNumber == null ? null : partnerOrderNumber.trim();
    }

    public Date getUserExpectDate() {
        return userExpectDate;
    }

    public void setUserExpectDate(Date userExpectDate) {
        this.userExpectDate = userExpectDate;
    }

    public Integer getUserExpectTimeSoltId() {
        return userExpectTimeSoltId;
    }

    public void setUserExpectTimeSoltId(Integer userExpectTimeSoltId) {
        this.userExpectTimeSoltId = userExpectTimeSoltId;
    }

    public Date getFinalAgreeDate() {
        return finalAgreeDate;
    }

    public void setFinalAgreeDate(Date finalAgreeDate) {
        this.finalAgreeDate = finalAgreeDate;
    }

    public Integer getFinalAgreeTimeSoltId() {
        return finalAgreeTimeSoltId;
    }

    public void setFinalAgreeTimeSoltId(Integer finalAgreeTimeSoltId) {
        this.finalAgreeTimeSoltId = finalAgreeTimeSoltId;
    }

    public String getArtisanName() {
        return artisanName;
    }

    public void setArtisanName(String artisanName) {
        this.artisanName = artisanName == null ? null : artisanName.trim();
    }

    public String getArtisanMobile() {
        return artisanMobile;
    }

    public void setArtisanMobile(String artisanMobile) {
        this.artisanMobile = artisanMobile == null ? null : artisanMobile.trim();
    }

    public String getArtisanAddress() {
        return artisanAddress;
    }

    public void setArtisanAddress(String artisanAddress) {
        this.artisanAddress = artisanAddress == null ? null : artisanAddress.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantContactName() {
        return merchantContactName;
    }

    public void setMerchantContactName(String merchantContactName) {
        this.merchantContactName = merchantContactName == null ? null : merchantContactName.trim();
    }

    public String getMerchantContactPhoneNumber() {
        return merchantContactPhoneNumber;
    }

    public void setMerchantContactPhoneNumber(String merchantContactPhoneNumber) {
        this.merchantContactPhoneNumber = merchantContactPhoneNumber == null ? null : merchantContactPhoneNumber.trim();
    }

    public String getIsAuthenticationMerchantOrder() {
        return isAuthenticationMerchantOrder;
    }

    public void setIsAuthenticationMerchantOrder(String isAuthenticationMerchantOrder) {
        this.isAuthenticationMerchantOrder = isAuthenticationMerchantOrder == null ? null : isAuthenticationMerchantOrder.trim();
    }

    public String getMerchantAuthenticationName() {
        return merchantAuthenticationName;
    }

    public void setMerchantAuthenticationName(String merchantAuthenticationName) {
        this.merchantAuthenticationName = merchantAuthenticationName == null ? null : merchantAuthenticationName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getGrabingTime() {
        return grabingTime;
    }

    public void setGrabingTime(Date grabingTime) {
        this.grabingTime = grabingTime;
    }

    public Date getConfirmAddressTime() {
        return confirmAddressTime;
    }

    public void setConfirmAddressTime(Date confirmAddressTime) {
        this.confirmAddressTime = confirmAddressTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getAssigningTime() {
        return assigningTime;
    }

    public void setAssigningTime(Date assigningTime) {
        this.assigningTime = assigningTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Date getServingCompletedTime() {
        return servingCompletedTime;
    }

    public void setServingCompletedTime(Date servingCompletedTime) {
        this.servingCompletedTime = servingCompletedTime;
    }

    public Date getCustomerAcceptanceTime() {
        return customerAcceptanceTime;
    }

    public void setCustomerAcceptanceTime(Date customerAcceptanceTime) {
        this.customerAcceptanceTime = customerAcceptanceTime;
    }

    public Date getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    public BigDecimal getSignLongitude() {
        return signLongitude;
    }

    public void setSignLongitude(BigDecimal signLongitude) {
        this.signLongitude = signLongitude;
    }

    public BigDecimal getSignLatitude() {
        return signLatitude;
    }

    public void setSignLatitude(BigDecimal signLatitude) {
        this.signLatitude = signLatitude;
    }

    public String getIsGrabbed() {
        return isGrabbed;
    }

    public void setIsGrabbed(String isGrabbed) {
        this.isGrabbed = isGrabbed == null ? null : isGrabbed.trim();
    }

    public BigDecimal getCustomerPrepayAmount() {
        return customerPrepayAmount;
    }

    public void setCustomerPrepayAmount(BigDecimal customerPrepayAmount) {
        this.customerPrepayAmount = customerPrepayAmount;
    }

    public Long getGrabOrderTimestamp() {
        return grabOrderTimestamp;
    }

    public void setGrabOrderTimestamp(Long grabOrderTimestamp) {
        this.grabOrderTimestamp = grabOrderTimestamp;
    }

    public BigDecimal getArtisanIncomeAmount() {
        return artisanIncomeAmount;
    }

    public void setArtisanIncomeAmount(BigDecimal artisanIncomeAmount) {
        this.artisanIncomeAmount = artisanIncomeAmount;
    }

    public BigDecimal getArtisanRewardPunishmentTotalAmount() {
        return artisanRewardPunishmentTotalAmount;
    }

    public void setArtisanRewardPunishmentTotalAmount(BigDecimal artisanRewardPunishmentTotalAmount) {
        this.artisanRewardPunishmentTotalAmount = artisanRewardPunishmentTotalAmount;
    }

    public BigDecimal getArtisanTakingProductRewardAmount() {
        return artisanTakingProductRewardAmount;
    }

    public void setArtisanTakingProductRewardAmount(BigDecimal artisanTakingProductRewardAmount) {
        this.artisanTakingProductRewardAmount = artisanTakingProductRewardAmount;
    }

    public BigDecimal getArtisanAgentChargeRewardAmount() {
        return artisanAgentChargeRewardAmount;
    }

    public void setArtisanAgentChargeRewardAmount(BigDecimal artisanAgentChargeRewardAmount) {
        this.artisanAgentChargeRewardAmount = artisanAgentChargeRewardAmount;
    }

    public BigDecimal getArtisanServiceAmount() {
        return artisanServiceAmount;
    }

    public void setArtisanServiceAmount(BigDecimal artisanServiceAmount) {
        this.artisanServiceAmount = artisanServiceAmount;
    }

    public BigDecimal getArtisanDistancePaymentAmount() {
        return artisanDistancePaymentAmount;
    }

    public void setArtisanDistancePaymentAmount(BigDecimal artisanDistancePaymentAmount) {
        this.artisanDistancePaymentAmount = artisanDistancePaymentAmount;
    }

    public BigDecimal getArtisanAmendmentAmount() {
        return artisanAmendmentAmount;
    }

    public void setArtisanAmendmentAmount(BigDecimal artisanAmendmentAmount) {
        this.artisanAmendmentAmount = artisanAmendmentAmount;
    }

    public BigDecimal getArtisanAdditionAmount() {
        return artisanAdditionAmount;
    }

    public void setArtisanAdditionAmount(BigDecimal artisanAdditionAmount) {
        this.artisanAdditionAmount = artisanAdditionAmount;
    }

    public String getArtisanAdditionAmountNote() {
        return artisanAdditionAmountNote;
    }

    public void setArtisanAdditionAmountNote(String artisanAdditionAmountNote) {
        this.artisanAdditionAmountNote = artisanAdditionAmountNote == null ? null : artisanAdditionAmountNote.trim();
    }

    public BigDecimal getArtisanExtraChargeAdditionAmount() {
        return artisanExtraChargeAdditionAmount;
    }

    public void setArtisanExtraChargeAdditionAmount(BigDecimal artisanExtraChargeAdditionAmount) {
        this.artisanExtraChargeAdditionAmount = artisanExtraChargeAdditionAmount;
    }

    public Integer getArtisanServiceTotalScore() {
        return artisanServiceTotalScore;
    }

    public void setArtisanServiceTotalScore(Integer artisanServiceTotalScore) {
        this.artisanServiceTotalScore = artisanServiceTotalScore;
    }

    public BigDecimal getMerchantTotalPaymentAmount() {
        return merchantTotalPaymentAmount;
    }

    public void setMerchantTotalPaymentAmount(BigDecimal merchantTotalPaymentAmount) {
        this.merchantTotalPaymentAmount = merchantTotalPaymentAmount;
    }

    public BigDecimal getMerchantAgentChargePaymentAmount() {
        return merchantAgentChargePaymentAmount;
    }

    public void setMerchantAgentChargePaymentAmount(BigDecimal merchantAgentChargePaymentAmount) {
        this.merchantAgentChargePaymentAmount = merchantAgentChargePaymentAmount;
    }

    public BigDecimal getMerchantServiceDiscountAmount() {
        return merchantServiceDiscountAmount;
    }

    public void setMerchantServiceDiscountAmount(BigDecimal merchantServiceDiscountAmount) {
        this.merchantServiceDiscountAmount = merchantServiceDiscountAmount;
    }

    public BigDecimal getMerchantServicePaymentAmount() {
        return merchantServicePaymentAmount;
    }

    public void setMerchantServicePaymentAmount(BigDecimal merchantServicePaymentAmount) {
        this.merchantServicePaymentAmount = merchantServicePaymentAmount;
    }

    public BigDecimal getMerchantDistancePaymentAmount() {
        return merchantDistancePaymentAmount;
    }

    public void setMerchantDistancePaymentAmount(BigDecimal merchantDistancePaymentAmount) {
        this.merchantDistancePaymentAmount = merchantDistancePaymentAmount;
    }

    public BigDecimal getMerchantAdditionPaymentAmount() {
        return merchantAdditionPaymentAmount;
    }

    public void setMerchantAdditionPaymentAmount(BigDecimal merchantAdditionPaymentAmount) {
        this.merchantAdditionPaymentAmount = merchantAdditionPaymentAmount;
    }

    public String getMerchantAdditionPaymentAmountNote() {
        return merchantAdditionPaymentAmountNote;
    }

    public void setMerchantAdditionPaymentAmountNote(String merchantAdditionPaymentAmountNote) {
        this.merchantAdditionPaymentAmountNote = merchantAdditionPaymentAmountNote == null ? null : merchantAdditionPaymentAmountNote.trim();
    }

    public String getMerchantAdditionPaymentUrl1() {
        return merchantAdditionPaymentUrl1;
    }

    public void setMerchantAdditionPaymentUrl1(String merchantAdditionPaymentUrl1) {
        this.merchantAdditionPaymentUrl1 = merchantAdditionPaymentUrl1 == null ? null : merchantAdditionPaymentUrl1.trim();
    }

    public String getMerchantAdditionPaymentUrl2() {
        return merchantAdditionPaymentUrl2;
    }

    public void setMerchantAdditionPaymentUrl2(String merchantAdditionPaymentUrl2) {
        this.merchantAdditionPaymentUrl2 = merchantAdditionPaymentUrl2 == null ? null : merchantAdditionPaymentUrl2.trim();
    }

    public String getMerchantAdditionPaymentUrl3() {
        return merchantAdditionPaymentUrl3;
    }

    public void setMerchantAdditionPaymentUrl3(String merchantAdditionPaymentUrl3) {
        this.merchantAdditionPaymentUrl3 = merchantAdditionPaymentUrl3 == null ? null : merchantAdditionPaymentUrl3.trim();
    }

    public String getMerchantAgreementUrl() {
        return merchantAgreementUrl;
    }

    public void setMerchantAgreementUrl(String merchantAgreementUrl) {
        this.merchantAgreementUrl = merchantAgreementUrl == null ? null : merchantAgreementUrl.trim();
    }

    public BigDecimal getOrderEstimateMaxAmount() {
        return orderEstimateMaxAmount;
    }

    public void setOrderEstimateMaxAmount(BigDecimal orderEstimateMaxAmount) {
        this.orderEstimateMaxAmount = orderEstimateMaxAmount;
    }

    public BigDecimal getOrderIncomeAmount() {
        return orderIncomeAmount;
    }

    public void setOrderIncomeAmount(BigDecimal orderIncomeAmount) {
        this.orderIncomeAmount = orderIncomeAmount;
    }

    public Integer getQualityAssuranceDays() {
        return qualityAssuranceDays;
    }

    public void setQualityAssuranceDays(Integer qualityAssuranceDays) {
        this.qualityAssuranceDays = qualityAssuranceDays;
    }

    public String getIsTakingProduct() {
        return isTakingProduct;
    }

    public void setIsTakingProduct(String isTakingProduct) {
        this.isTakingProduct = isTakingProduct == null ? null : isTakingProduct.trim();
    }

    public String getIsTakingGoods() {
        return isTakingGoods;
    }

    public void setIsTakingGoods(String isTakingGoods) {
        this.isTakingGoods = isTakingGoods == null ? null : isTakingGoods.trim();
    }

    public String getIsCustomerPayment() {
        return isCustomerPayment;
    }

    public void setIsCustomerPayment(String isCustomerPayment) {
        this.isCustomerPayment = isCustomerPayment == null ? null : isCustomerPayment.trim();
    }

    public String getCustomerPaymentSuccess() {
        return customerPaymentSuccess;
    }

    public void setCustomerPaymentSuccess(String customerPaymentSuccess) {
        this.customerPaymentSuccess = customerPaymentSuccess == null ? null : customerPaymentSuccess.trim();
    }

    public BigDecimal getCustomerAdditionPaymentAmount() {
        return customerAdditionPaymentAmount;
    }

    public void setCustomerAdditionPaymentAmount(BigDecimal customerAdditionPaymentAmount) {
        this.customerAdditionPaymentAmount = customerAdditionPaymentAmount;
    }

    public String getCustomerAdditionPaymentAmountNote() {
        return customerAdditionPaymentAmountNote;
    }

    public void setCustomerAdditionPaymentAmountNote(String customerAdditionPaymentAmountNote) {
        this.customerAdditionPaymentAmountNote = customerAdditionPaymentAmountNote == null ? null : customerAdditionPaymentAmountNote.trim();
    }

    public BigDecimal getCustomerTotalPaymentAmount() {
        return customerTotalPaymentAmount;
    }

    public void setCustomerTotalPaymentAmount(BigDecimal customerTotalPaymentAmount) {
        this.customerTotalPaymentAmount = customerTotalPaymentAmount;
    }

    public Bool getAgentCharge() {
        return agentCharge;
    }

    public void setAgentCharge(Bool agentCharge) {
        this.agentCharge = agentCharge;
    }

    public BigDecimal getAgentChargeAmount() {
        return agentChargeAmount;
    }

    public void setAgentChargeAmount(BigDecimal agentChargeAmount) {
        this.agentChargeAmount = agentChargeAmount;
    }

    public String getDeliveryOrderNumber() {
        return deliveryOrderNumber;
    }

    public void setDeliveryOrderNumber(String deliveryOrderNumber) {
        this.deliveryOrderNumber = deliveryOrderNumber == null ? null : deliveryOrderNumber.trim();
    }

    public String getDeliveryReceiptUrl() {
        return deliveryReceiptUrl;
    }

    public void setDeliveryReceiptUrl(String deliveryReceiptUrl) {
        this.deliveryReceiptUrl = deliveryReceiptUrl == null ? null : deliveryReceiptUrl.trim();
    }

    public Integer getDeliveryCompanyId() {
        return deliveryCompanyId;
    }

    public void setDeliveryCompanyId(Integer deliveryCompanyId) {
        this.deliveryCompanyId = deliveryCompanyId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getDealerFullName() {
        return dealerFullName;
    }

    public void setDealerFullName(String dealerFullName) {
        this.dealerFullName = dealerFullName == null ? null : dealerFullName.trim();
    }

    public String getArtisanLeaderId() {
        return artisanLeaderId;
    }

    public void setArtisanLeaderId(String artisanLeaderId) {
        this.artisanLeaderId = artisanLeaderId == null ? null : artisanLeaderId.trim();
    }

    public String getArtisanId() {
        return artisanId;
    }

    public void setArtisanId(String artisanId) {
        this.artisanId = artisanId == null ? null : artisanId.trim();
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Date getStatusBeginTime() {
        return statusBeginTime;
    }

    public void setStatusBeginTime(Date statusBeginTime) {
        this.statusBeginTime = statusBeginTime;
    }

    public String getIsWarning() {
        return isWarning;
    }

    public void setIsWarning(String isWarning) {
        this.isWarning = isWarning == null ? null : isWarning.trim();
    }

    public Date getPendingProcessTime() {
        return pendingProcessTime;
    }

    public void setPendingProcessTime(Date pendingProcessTime) {
        this.pendingProcessTime = pendingProcessTime;
    }

    public String getWaitingGrabProcesserId() {
        return waitingGrabProcesserId;
    }

    public void setWaitingGrabProcesserId(String waitingGrabProcesserId) {
        this.waitingGrabProcesserId = waitingGrabProcesserId == null ? null : waitingGrabProcesserId.trim();
    }

    public String getWaitingGrabProcesserName() {
        return waitingGrabProcesserName;
    }

    public void setWaitingGrabProcesserName(String waitingGrabProcesserName) {
        this.waitingGrabProcesserName = waitingGrabProcesserName == null ? null : waitingGrabProcesserName.trim();
    }

    public String getProcesserId() {
        return processerId;
    }

    public void setProcesserId(String processerId) {
        this.processerId = processerId == null ? null : processerId.trim();
    }

    public String getProcesserName() {
        return processerName;
    }

    public void setProcesserName(String processerName) {
        this.processerName = processerName == null ? null : processerName.trim();
    }

    public Integer getMarkupNumber() {
        return markupNumber;
    }

    public void setMarkupNumber(Integer markupNumber) {
        this.markupNumber = markupNumber;
    }

    public Integer getMarkupIntervalMinutes() {
        return markupIntervalMinutes;
    }

    public void setMarkupIntervalMinutes(Integer markupIntervalMinutes) {
        this.markupIntervalMinutes = markupIntervalMinutes;
    }

    public BigDecimal getMarkupAmount() {
        return markupAmount;
    }

    public void setMarkupAmount(BigDecimal markupAmount) {
        this.markupAmount = markupAmount;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById == null ? null : createdById.trim();
    }

    public Integer getCreatedAccountTypeId() {
        return createdAccountTypeId;
    }

    public void setCreatedAccountTypeId(Integer createdAccountTypeId) {
        this.createdAccountTypeId = createdAccountTypeId;
    }

    public Integer getVisibilityId() {
        return visibilityId;
    }

    public void setVisibilityId(Integer visibilityId) {
        this.visibilityId = visibilityId;
    }

    public String getProcessStepCode() {
        return processStepCode;
    }

    public void setProcessStepCode(String processStepCode) {
        this.processStepCode = processStepCode == null ? null : processStepCode.trim();
    }

    public Integer getPerProcessStepProcessCount() {
        return perProcessStepProcessCount;
    }

    public void setPerProcessStepProcessCount(Integer perProcessStepProcessCount) {
        this.perProcessStepProcessCount = perProcessStepProcessCount;
    }

    public String getIsCustomerReminder() {
        return isCustomerReminder;
    }

    public void setIsCustomerReminder(String isCustomerReminder) {
        this.isCustomerReminder = isCustomerReminder == null ? null : isCustomerReminder.trim();
    }

    public Date getCustomerReminderTime() {
        return customerReminderTime;
    }

    public void setCustomerReminderTime(Date customerReminderTime) {
        this.customerReminderTime = customerReminderTime;
    }

    public String getIsConformVisitCondition() {
        return isConformVisitCondition;
    }

    public void setIsConformVisitCondition(String isConformVisitCondition) {
        this.isConformVisitCondition = isConformVisitCondition == null ? null : isConformVisitCondition.trim();
    }

    public Date getConformVisitConditionTime() {
        return conformVisitConditionTime;
    }

    public void setConformVisitConditionTime(Date conformVisitConditionTime) {
        this.conformVisitConditionTime = conformVisitConditionTime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getChannelOrderNumber() {
        return channelOrderNumber;
    }

    public void setChannelOrderNumber(String channelOrderNumber) {
        this.channelOrderNumber = channelOrderNumber == null ? null : channelOrderNumber.trim();
    }

    public String getCustomerChannelAccount() {
        return customerChannelAccount;
    }

    public void setCustomerChannelAccount(String customerChannelAccount) {
        this.customerChannelAccount = customerChannelAccount == null ? null : customerChannelAccount.trim();
    }

    public Date getFinalAgreeTimeStart() {
        return finalAgreeTimeStart;
    }

    public void setFinalAgreeTimeStart(Date finalAgreeTimeStart) {
        this.finalAgreeTimeStart = finalAgreeTimeStart;
    }

    public Date getFinalAgreeTimeEnd() {
        return finalAgreeTimeEnd;
    }

    public void setFinalAgreeTimeEnd(Date finalAgreeTimeEnd) {
        this.finalAgreeTimeEnd = finalAgreeTimeEnd;
    }

    public String getIsCheckoutOffline() {
        return isCheckoutOffline;
    }

    public void setIsCheckoutOffline(String isCheckoutOffline) {
        this.isCheckoutOffline = isCheckoutOffline == null ? null : isCheckoutOffline.trim();
    }

    public String getReimbursementArtisanId() {
        return reimbursementArtisanId;
    }

    public void setReimbursementArtisanId(String reimbursementArtisanId) {
        this.reimbursementArtisanId = reimbursementArtisanId == null ? null : reimbursementArtisanId.trim();
    }

    public String getServeArtisanPhoneNumber() {
        return serveArtisanPhoneNumber;
    }

    public void setServeArtisanPhoneNumber(String serveArtisanPhoneNumber) {
        this.serveArtisanPhoneNumber = serveArtisanPhoneNumber == null ? null : serveArtisanPhoneNumber.trim();
    }

    public String getIsCityPartnerCreated() {
        return isCityPartnerCreated;
    }

    public void setIsCityPartnerCreated(String isCityPartnerCreated) {
        this.isCityPartnerCreated = isCityPartnerCreated == null ? null : isCityPartnerCreated.trim();
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType == null ? null : merchantType.trim();
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId == null ? null : serviceProviderId.trim();
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName == null ? null : serviceProviderName.trim();
    }

    public String getIsDefaultServiceProvider() {
        return isDefaultServiceProvider;
    }

    public void setIsDefaultServiceProvider(String isDefaultServiceProvider) {
        this.isDefaultServiceProvider = isDefaultServiceProvider == null ? null : isDefaultServiceProvider.trim();
    }

    public String getIsRedPacketUsed() {
        return isRedPacketUsed;
    }

    public void setIsRedPacketUsed(String isRedPacketUsed) {
        this.isRedPacketUsed = isRedPacketUsed == null ? null : isRedPacketUsed.trim();
    }

    public String getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(String isRemote) {
        this.isRemote = isRemote == null ? null : isRemote.trim();
    }

    public String getOrderTagStr() {
        return orderTagStr;
    }

    public void setOrderTagStr(String orderTagStr) {
        this.orderTagStr = orderTagStr == null ? null : orderTagStr.trim();
    }

    public String getInnerTagStr() {
        return innerTagStr;
    }

    public void setInnerTagStr(String innerTagStr) {
        this.innerTagStr = innerTagStr == null ? null : innerTagStr.trim();
    }

    public String getIsTeamOrder() {
        return isTeamOrder;
    }

    public void setIsTeamOrder(String isTeamOrder) {
        this.isTeamOrder = isTeamOrder == null ? null : isTeamOrder.trim();
    }

    public String getIsTimeoutOrder() {
        return isTimeoutOrder;
    }

    public void setIsTimeoutOrder(String isTimeoutOrder) {
        this.isTimeoutOrder = isTimeoutOrder == null ? null : isTimeoutOrder.trim();
    }

    public String getIsProblemOrder() {
        return isProblemOrder;
    }

    public void setIsProblemOrder(String isProblemOrder) {
        this.isProblemOrder = isProblemOrder == null ? null : isProblemOrder.trim();
    }

    public String getIsComplaintsOrder() {
        return isComplaintsOrder;
    }

    public void setIsComplaintsOrder(String isComplaintsOrder) {
        this.isComplaintsOrder = isComplaintsOrder == null ? null : isComplaintsOrder.trim();
    }

    public String getIsArtisanExtraCharge() {
        return isArtisanExtraCharge;
    }

    public void setIsArtisanExtraCharge(String isArtisanExtraCharge) {
        this.isArtisanExtraCharge = isArtisanExtraCharge == null ? null : isArtisanExtraCharge.trim();
    }

    public String getIsPraiseAwardOrder() {
        return isPraiseAwardOrder;
    }

    public void setIsPraiseAwardOrder(String isPraiseAwardOrder) {
        this.isPraiseAwardOrder = isPraiseAwardOrder == null ? null : isPraiseAwardOrder.trim();
    }

    public BigDecimal getCustomerPraiseAwardAmount() {
        return customerPraiseAwardAmount;
    }

    public void setCustomerPraiseAwardAmount(BigDecimal customerPraiseAwardAmount) {
        this.customerPraiseAwardAmount = customerPraiseAwardAmount;
    }

    public BigDecimal getArtisanPraiseAwardAmount() {
        return artisanPraiseAwardAmount;
    }

    public void setArtisanPraiseAwardAmount(BigDecimal artisanPraiseAwardAmount) {
        this.artisanPraiseAwardAmount = artisanPraiseAwardAmount;
    }

    public BigDecimal getCustomerPraiseAwardAmountConfig() {
        return customerPraiseAwardAmountConfig;
    }

    public void setCustomerPraiseAwardAmountConfig(BigDecimal customerPraiseAwardAmountConfig) {
        this.customerPraiseAwardAmountConfig = customerPraiseAwardAmountConfig;
    }

    public BigDecimal getArtisanPraiseAwardAmountConfig() {
        return artisanPraiseAwardAmountConfig;
    }

    public void setArtisanPraiseAwardAmountConfig(BigDecimal artisanPraiseAwardAmountConfig) {
        this.artisanPraiseAwardAmountConfig = artisanPraiseAwardAmountConfig;
    }

    public String getIsExtendWarrantyOrder() {
        return isExtendWarrantyOrder;
    }

    public void setIsExtendWarrantyOrder(String isExtendWarrantyOrder) {
        this.isExtendWarrantyOrder = isExtendWarrantyOrder == null ? null : isExtendWarrantyOrder.trim();
    }

    public BigDecimal getArtisanRecommendAwardAmount() {
        return artisanRecommendAwardAmount;
    }

    public void setArtisanRecommendAwardAmount(BigDecimal artisanRecommendAwardAmount) {
        this.artisanRecommendAwardAmount = artisanRecommendAwardAmount;
    }

    public BigDecimal getArtisanRecommendAwardAmountConfig() {
        return artisanRecommendAwardAmountConfig;
    }

    public void setArtisanRecommendAwardAmountConfig(BigDecimal artisanRecommendAwardAmountConfig) {
        this.artisanRecommendAwardAmountConfig = artisanRecommendAwardAmountConfig;
    }

    public String getExtendWarrantyIsPaid() {
        return extendWarrantyIsPaid;
    }

    public void setExtendWarrantyIsPaid(String extendWarrantyIsPaid) {
        this.extendWarrantyIsPaid = extendWarrantyIsPaid == null ? null : extendWarrantyIsPaid.trim();
    }

    public String getTwoDaysExtendWarrantyPush() {
        return twoDaysExtendWarrantyPush;
    }

    public void setTwoDaysExtendWarrantyPush(String twoDaysExtendWarrantyPush) {
        this.twoDaysExtendWarrantyPush = twoDaysExtendWarrantyPush == null ? null : twoDaysExtendWarrantyPush.trim();
    }

    public Date getTwoDaysExtendWarrantyPushTime() {
        return twoDaysExtendWarrantyPushTime;
    }

    public void setTwoDaysExtendWarrantyPushTime(Date twoDaysExtendWarrantyPushTime) {
        this.twoDaysExtendWarrantyPushTime = twoDaysExtendWarrantyPushTime;
    }

    public String getSparePartsClearingTypeCode() {
        return sparePartsClearingTypeCode;
    }

    public void setSparePartsClearingTypeCode(String sparePartsClearingTypeCode) {
        this.sparePartsClearingTypeCode = sparePartsClearingTypeCode == null ? null : sparePartsClearingTypeCode.trim();
    }

    public String getUnconfirmedServingTime() {
        return unconfirmedServingTime;
    }

    public void setUnconfirmedServingTime(String unconfirmedServingTime) {
        this.unconfirmedServingTime = unconfirmedServingTime == null ? null : unconfirmedServingTime.trim();
    }

    public String getIsProductReceiving() {
        return isProductReceiving;
    }

    public void setIsProductReceiving(String isProductReceiving) {
        this.isProductReceiving = isProductReceiving == null ? null : isProductReceiving.trim();
    }

    public String getIsSystemSingProductReceiving() {
        return isSystemSingProductReceiving;
    }

    public void setIsSystemSingProductReceiving(String isSystemSingProductReceiving) {
        this.isSystemSingProductReceiving = isSystemSingProductReceiving == null ? null : isSystemSingProductReceiving.trim();
    }

    public String getIsNeedServing() {
        return isNeedServing;
    }

    public void setIsNeedServing(String isNeedServing) {
        this.isNeedServing = isNeedServing == null ? null : isNeedServing.trim();
    }

    public String getSendOrderSmsSign() {
        return sendOrderSmsSign;
    }

    public void setSendOrderSmsSign(String sendOrderSmsSign) {
        this.sendOrderSmsSign = sendOrderSmsSign == null ? null : sendOrderSmsSign.trim();
    }

    public String getIsCheckSignPhoto() {
        return isCheckSignPhoto;
    }

    public void setIsCheckSignPhoto(String isCheckSignPhoto) {
        this.isCheckSignPhoto = isCheckSignPhoto == null ? null : isCheckSignPhoto.trim();
    }

    public String getNotePicture() {
        return notePicture;
    }

    public void setNotePicture(String notePicture) {
        this.notePicture = notePicture == null ? null : notePicture.trim();
    }

    public String getIsProprietaryMerchantCreated() {
        return isProprietaryMerchantCreated;
    }

    public void setIsProprietaryMerchantCreated(String isProprietaryMerchantCreated) {
        this.isProprietaryMerchantCreated = isProprietaryMerchantCreated == null ? null : isProprietaryMerchantCreated.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getEmployeeNote() {
        return employeeNote;
    }

    public void setEmployeeNote(String employeeNote) {
        this.employeeNote = employeeNote == null ? null : employeeNote.trim();
    }

    public String getInnerLabelNote() {
        return innerLabelNote;
    }

    public void setInnerLabelNote(String innerLabelNote) {
        this.innerLabelNote = innerLabelNote == null ? null : innerLabelNote.trim();
    }

    public String getArtisanEnvCheckNote() {
        return artisanEnvCheckNote;
    }

    public void setArtisanEnvCheckNote(String artisanEnvCheckNote) {
        this.artisanEnvCheckNote = artisanEnvCheckNote == null ? null : artisanEnvCheckNote.trim();
    }

    public String getArtisanAcceptanceNote() {
        return artisanAcceptanceNote;
    }

    public void setArtisanAcceptanceNote(String artisanAcceptanceNote) {
        this.artisanAcceptanceNote = artisanAcceptanceNote == null ? null : artisanAcceptanceNote.trim();
    }

    public String getArtisanAcceptanceJson() {
        return artisanAcceptanceJson;
    }

    public void setArtisanAcceptanceJson(String artisanAcceptanceJson) {
        this.artisanAcceptanceJson = artisanAcceptanceJson == null ? null : artisanAcceptanceJson.trim();
    }
}