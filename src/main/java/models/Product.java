package models;

public class Product {
    private String description;
    private Integer familyId;
    private Integer groupId;
    private String groupCode;
    private String name;
    private String pageUrl;
    private String supportPageUrl;
    private Boolean hasBluetoothPairingGuide;
    private Integer productId;
    private String productName;
    private String segmentType;
    private String sku;
    private String summary;
    private String thumbnailUrl;
    private String uniqueSellingPoint;

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getSupportPageUrl() {
        return supportPageUrl;
    }

    public void setSupportPageUrl(String supportPageUrl) {
        this.supportPageUrl = supportPageUrl;
    }

    public Boolean getHasBluetoothPairingGuide() {
        return hasBluetoothPairingGuide;
    }

    public void setHasBluetoothPairingGuide(Boolean hasBluetoothPairingGuide) {
        this.hasBluetoothPairingGuide = hasBluetoothPairingGuide;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUniqueSellingPoint() {
        return uniqueSellingPoint;
    }

    public void setUniqueSellingPoint(String uniqueSellingPoint) {
        this.uniqueSellingPoint = uniqueSellingPoint;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", familyId=" + familyId +
                ", groupId=" + groupId +
                ", groupCode='" + groupCode + '\'' +
                ", name='" + name + '\'' +
                ", pageUrl='" + pageUrl + '\'' +
                ", supportPageUrl='" + supportPageUrl + '\'' +
                ", hasBluetoothPairingGuide=" + hasBluetoothPairingGuide +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", segmentType='" + segmentType + '\'' +
                ", sku='" + sku + '\'' +
                ", summary='" + summary + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", uniqueSellingPoint='" + uniqueSellingPoint + '\'' +
                '}';
    }

    public Product(String description, Integer familyId, Integer groupId, String groupCode, String name, String pageUrl, String supportPageUrl, Boolean hasBluetoothPairingGuide, Integer productId, String productName, String segmentType, String sku, String summary, String thumbnailUrl, String uniqueSellingPoint) {
        this.description = description;
        this.familyId = familyId;
        this.groupId = groupId;
        this.groupCode = groupCode;
        this.name = name;
        this.pageUrl = pageUrl;
        this.supportPageUrl = supportPageUrl;
        this.hasBluetoothPairingGuide = hasBluetoothPairingGuide;
        this.productId = productId;
        this.productName = productName;
        this.segmentType = segmentType;
        this.sku = sku;
        this.summary = summary;
        this.thumbnailUrl = thumbnailUrl;
        this.uniqueSellingPoint = uniqueSellingPoint;
    }
}


