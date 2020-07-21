package org.biacode.jcronofy.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User: Arthur Asatryan
 * Date: 10/4/16
 * Time: 8:01 PM
 */
public enum NotificationTypeModel {
    @JsonProperty("verification")
    VERIFICATION("verification"),
    @JsonProperty("change")
    CHANGE("change"),
    @JsonProperty("profile_disconnected")
    PROFILE_DISCONNECTED("profile_disconnected"),
    @JsonProperty("profile_initial_sync_completed")
    PROFILE_INITIAL_SYNC_COMPLETED("profile_initial_sync_completed"),
    @JsonProperty("gdpr_requested")
    GDPR_REQUESTED("gdpr_requested");

    String type;

    NotificationTypeModel(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
