package com.practice.java._23lambdaexpressionsandstreams;

import java.util.List;
import java.util.Objects;

public class _5SuperOrderStream {
    private int id;
    private int userId;
    private int itemSequenceId;
    private ProductData productData;
    private UserData supplierData;
    private float quantity;
    private String paymentMode;
    private String paymentProviderId;
    private String paymentDate;
    private String paymentAmount;
    private String paymentCurrency;
    private String paymentMethodId;
    private String paymentTransactionId;

    public _5SuperOrderStream(int id, int userId, int itemSequenceId, ProductData productData, UserData supplierData, float quantity, String paymentMode, String paymentProviderId, String paymentDate, String paymentAmount, String paymentCurrency, String paymentMethodId, String paymentTransactionId) {
        this.id = id;
        this.userId = userId;
        this.itemSequenceId = itemSequenceId;
        this.productData = productData;
        this.supplierData = supplierData;
        this.quantity = quantity;
        this.paymentMode = paymentMode;
        this.paymentProviderId = paymentProviderId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.paymentCurrency = paymentCurrency;
        this.paymentMethodId = paymentMethodId;
        this.paymentTransactionId = paymentTransactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        _5SuperOrderStream that = (_5SuperOrderStream) o;
        return id == that.id && userId == that.userId && itemSequenceId == that.itemSequenceId && Float.compare(quantity, that.quantity) == 0 && Objects.equals(productData, that.productData) && Objects.equals(supplierData, that.supplierData) && Objects.equals(paymentMode, that.paymentMode) && Objects.equals(paymentProviderId, that.paymentProviderId) && Objects.equals(paymentDate, that.paymentDate) && Objects.equals(paymentAmount, that.paymentAmount) && Objects.equals(paymentCurrency, that.paymentCurrency) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(paymentTransactionId, that.paymentTransactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, itemSequenceId, productData, supplierData, quantity, paymentMode, paymentProviderId, paymentDate, paymentAmount, paymentCurrency, paymentMethodId, paymentTransactionId);
    }

    @Override
    public String toString() {
        return "_5SuperOrderStream{" +
                "id=" + id +
                ", userId=" + userId +
                ", itemSequenceId=" + itemSequenceId +
                ", productData=" + productData +
                ", supplierData=" + supplierData +
                ", quantity=" + quantity +
                ", paymentMode='" + paymentMode + '\'' +
                ", paymentProviderId='" + paymentProviderId + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", paymentCurrency='" + paymentCurrency + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", paymentTransactionId='" + paymentTransactionId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getItemSequenceId() {
        return itemSequenceId;
    }

    public void setItemSequenceId(int itemSequenceId) {
        this.itemSequenceId = itemSequenceId;
    }

    public ProductData getProductData() {
        return productData;
    }

    public void setProductData(ProductData productData) {
        this.productData = productData;
    }

    public UserData getSupplierData() {
        return supplierData;
    }

    public void setSupplierData(UserData supplierData) {
        this.supplierData = supplierData;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentProviderId() {
        return paymentProviderId;
    }

    public void setPaymentProviderId(String paymentProviderId) {
        this.paymentProviderId = paymentProviderId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }
}

class ProductData {
    private int productId;
    private String productName;
    private String productType;
    private String productSubType;
    private UserData manufacturerData;
    private float unitQuantityPrice;

    public ProductData(int productId, String productName, String productType, String productSubType, UserData manufacturerData, float unitQuantityPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productSubType = productSubType;
        this.manufacturerData = manufacturerData;
        this.unitQuantityPrice = unitQuantityPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    public UserData getManufacturerData() {
        return manufacturerData;
    }

    public void setManufacturerData(UserData manufacturerData) {
        this.manufacturerData = manufacturerData;
    }

    public float getUnitQuantityPrice() {
        return unitQuantityPrice;
    }

    public void setUnitQuantityPrice(float unitQuantityPrice) {
        this.unitQuantityPrice = unitQuantityPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductData that = (ProductData) o;
        return getProductId() == that.getProductId() && Float.compare(getUnitQuantityPrice(), that.getUnitQuantityPrice()) == 0 && Objects.equals(getProductName(), that.getProductName()) && Objects.equals(getProductType(), that.getProductType()) && Objects.equals(getProductSubType(), that.getProductSubType()) && Objects.equals(getManufacturerData(), that.getManufacturerData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getProductName(), getProductType(), getProductSubType(), getManufacturerData(), getUnitQuantityPrice());
    }
}

class UserData {
    private int userId;
    private String userName;
    private String userType;
    private String userSubType;
    private String userAddress;
    private String userPhone;
    private String userFax;
    private String userEmail;
    private String userWebsite;
    private String userTaxCode;
    private float userTotalTaxDeductedFromPortal;
    private float userTotalTaxPaidFromAllSources;
    private float userTotalRevenueFromAllSources;
    private float userTotalRevenueFromPortal;
    private float userTotalOverallOperationsCost;
    private int paymentMethodId;
    private List<Integer> orderIdList;

    public UserData(int userId, String userName, String userType, String userSubType, String userAddress, String userPhone, String userFax, String userEmail, String userWebsite, String userTaxCode, float userTotalTaxDeductedFromPortal, float userTotalTaxPaidFromAllSources, float userTotalRevenueFromAllSources, float userTotalRevenueFromPortal, float userTotalOverallOperationsCost, int paymentMethodId, List<Integer> orderIdList) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
        this.userSubType = userSubType;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userFax = userFax;
        this.userEmail = userEmail;
        this.userWebsite = userWebsite;
        this.userTaxCode = userTaxCode;
        this.userTotalTaxDeductedFromPortal = userTotalTaxDeductedFromPortal;
        this.userTotalTaxPaidFromAllSources = userTotalTaxPaidFromAllSources;
        this.userTotalRevenueFromAllSources = userTotalRevenueFromAllSources;
        this.userTotalRevenueFromPortal = userTotalRevenueFromPortal;
        this.userTotalOverallOperationsCost = userTotalOverallOperationsCost;
        this.paymentMethodId = paymentMethodId;
        this.orderIdList = orderIdList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserSubType() {
        return userSubType;
    }

    public void setUserSubType(String userSubType) {
        this.userSubType = userSubType;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserFax() {
        return userFax;
    }

    public void setUserFax(String userFax) {
        this.userFax = userFax;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserWebsite() {
        return userWebsite;
    }

    public void setUserWebsite(String userWebsite) {
        this.userWebsite = userWebsite;
    }

    public String getUserTaxCode() {
        return userTaxCode;
    }

    public void setUserTaxCode(String userTaxCode) {
        this.userTaxCode = userTaxCode;
    }

    public float getUserTotalTaxDeductedFromPortal() {
        return userTotalTaxDeductedFromPortal;
    }

    public void setUserTotalTaxDeductedFromPortal(float userTotalTaxDeductedFromPortal) {
        this.userTotalTaxDeductedFromPortal = userTotalTaxDeductedFromPortal;
    }

    public float getUserTotalTaxPaidFromAllSources() {
        return userTotalTaxPaidFromAllSources;
    }

    public void setUserTotalTaxPaidFromAllSources(float userTotalTaxPaidFromAllSources) {
        this.userTotalTaxPaidFromAllSources = userTotalTaxPaidFromAllSources;
    }

    public float getUserTotalRevenueFromAllSources() {
        return userTotalRevenueFromAllSources;
    }

    public void setUserTotalRevenueFromAllSources(float userTotalRevenueFromAllSources) {
        this.userTotalRevenueFromAllSources = userTotalRevenueFromAllSources;
    }

    public float getUserTotalRevenueFromPortal() {
        return userTotalRevenueFromPortal;
    }

    public void setUserTotalRevenueFromPortal(float userTotalRevenueFromPortal) {
        this.userTotalRevenueFromPortal = userTotalRevenueFromPortal;
    }

    public float getUserTotalOverallOperationsCost() {
        return userTotalOverallOperationsCost;
    }

    public void setUserTotalOverallOperationsCost(float userTotalOverallOperationsCost) {
        this.userTotalOverallOperationsCost = userTotalOverallOperationsCost;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public List<Integer> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<Integer> orderIdList) {
        this.orderIdList = orderIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return getUserId() == userData.getUserId() && Float.compare(getUserTotalTaxDeductedFromPortal(), userData.getUserTotalTaxDeductedFromPortal()) == 0 && Float.compare(getUserTotalTaxPaidFromAllSources(), userData.getUserTotalTaxPaidFromAllSources()) == 0 && Float.compare(getUserTotalRevenueFromAllSources(), userData.getUserTotalRevenueFromAllSources()) == 0 && Float.compare(getUserTotalRevenueFromPortal(), userData.getUserTotalRevenueFromPortal()) == 0 && Float.compare(getUserTotalOverallOperationsCost(), userData.getUserTotalOverallOperationsCost()) == 0 && getPaymentMethodId() == userData.getPaymentMethodId() && Objects.equals(getUserName(), userData.getUserName()) && Objects.equals(getUserType(), userData.getUserType()) && Objects.equals(getUserSubType(), userData.getUserSubType()) && Objects.equals(getUserAddress(), userData.getUserAddress()) && Objects.equals(getUserPhone(), userData.getUserPhone()) && Objects.equals(getUserFax(), userData.getUserFax()) && Objects.equals(getUserEmail(), userData.getUserEmail()) && Objects.equals(getUserWebsite(), userData.getUserWebsite()) && Objects.equals(getUserTaxCode(), userData.getUserTaxCode()) && Objects.equals(getOrderIdList(), userData.getOrderIdList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserName(), getUserType(), getUserSubType(), getUserAddress(), getUserPhone(), getUserFax(), getUserEmail(), getUserWebsite(), getUserTaxCode(), getUserTotalTaxDeductedFromPortal(), getUserTotalTaxPaidFromAllSources(), getUserTotalRevenueFromAllSources(), getUserTotalRevenueFromPortal(), getUserTotalOverallOperationsCost(), getPaymentMethodId(), getOrderIdList());
    }
}

class PaymentData {
    private int paymentMethodId;
    private String paymentMethodName;
    private String paymentMethodType;
}

