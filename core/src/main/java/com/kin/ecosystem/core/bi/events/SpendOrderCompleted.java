
package com.kin.ecosystem.core.bi.events;

// Augmented by script
import com.kin.ecosystem.core.bi.Event;
import com.kin.ecosystem.core.bi.EventsStore;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Client receives the spending offer he purchased (e.g. coupon code) 
 * 
 */
public class SpendOrderCompleted implements Event {
    public static final String EVENT_NAME = "spend_order_completed";
    public static final String EVENT_TYPE = "business";

    // Augmented by script
    public static SpendOrderCompleted create(String offerId, String orderId, Boolean isNative, Origin origin, Double kinAmount) {
        return new SpendOrderCompleted(
            (Common) EventsStore.common(),
            (User) EventsStore.user(),
            (Client) EventsStore.client(),
            offerId,
            orderId,
            isNative,
            origin,
            kinAmount);
    }

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("event_name")
    @Expose
    private String eventName = EVENT_NAME;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("event_type")
    @Expose
    private String eventType = EVENT_TYPE;
    /**
     * common properties for all events
     * (Required)
     * 
     */
    @SerializedName("common")
    @Expose
    private Common common;
    /**
     * common user properties
     * (Required)
     * 
     */
    @SerializedName("user")
    @Expose
    private User user;
    /**
     * common properties for all client events
     * (Required)
     * 
     */
    @SerializedName("client")
    @Expose
    private Client client;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("offer_id")
    @Expose
    private String offerId;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("order_id")
    @Expose
    private String orderId;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("is_native")
    @Expose
    private Boolean isNative;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("origin")
    @Expose
    private Origin origin;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("kin_amount")
    @Expose
    private Double kinAmount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SpendOrderCompleted() {
    }

    /**
     * 
     * @param common
     * @param orderId
     * @param origin

     * @param client
     * @param offerId
     * @param kinAmount

     * @param user
     * @param isNative
     */
    public SpendOrderCompleted(Common common, User user, Client client, String offerId, String orderId, Boolean isNative, Origin origin, Double kinAmount) {
        super();
        this.common = common;
        this.user = user;
        this.client = client;
        this.offerId = offerId;
        this.orderId = orderId;
        this.isNative = isNative;
        this.origin = origin;
        this.kinAmount = kinAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * common properties for all events
     * (Required)
     * 
     */
    public Common getCommon() {
        return common;
    }

    /**
     * common properties for all events
     * (Required)
     * 
     */
    public void setCommon(Common common) {
        this.common = common;
    }

    /**
     * common user properties
     * (Required)
     * 
     */
    public User getUser() {
        return user;
    }

    /**
     * common user properties
     * (Required)
     * 
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * common properties for all client events
     * (Required)
     * 
     */
    public Client getClient() {
        return client;
    }

    /**
     * common properties for all client events
     * (Required)
     * 
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getIsNative() {
        return isNative;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setIsNative(Boolean isNative) {
        this.isNative = isNative;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Origin getOrigin() {
        return origin;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Double getKinAmount() {
        return kinAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setKinAmount(Double kinAmount) {
        this.kinAmount = kinAmount;
    }

    public enum Origin {

        @SerializedName("marketplace")
        MARKETPLACE("marketplace"),
        @SerializedName("external")
        EXTERNAL("external");
        private final String value;
        private final static Map<String, Origin> CONSTANTS = new HashMap<String, Origin>();

        static {
            for (Origin c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Origin(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Origin fromValue(String value) {
            Origin constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
