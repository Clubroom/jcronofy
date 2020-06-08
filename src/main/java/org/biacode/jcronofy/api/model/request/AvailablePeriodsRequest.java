package org.biacode.jcronofy.api.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.biacode.jcronofy.api.model.common.AbstractAccessTokenAwareCronofyRequest;

import java.util.Date;

import javax.ws.rs.QueryParam;

/**
 * User: Don Holly
 * Date: 6/8/20
 * Time: 1:00 PM
 */
public class AvailablePeriodsRequest extends AbstractAccessTokenAwareCronofyRequest {

    //region Properties
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "GMT")
    @QueryParam("from")
    private Date from;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "GMT")
    @QueryParam("to")
    private Date to;

    @QueryParam("tzid")
    private String tzId;
    //endregion

    //region Constructors
    public AvailablePeriodsRequest() {
    }

    public AvailablePeriodsRequest(final String accessToken, final Date from, final Date to, final String tzId) {
        super(accessToken);
        this.from = from;
        this.to = to;
        this.tzId = tzId;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailablePeriodsRequest)) {
            return false;
        }
        final AvailablePeriodsRequest that = (AvailablePeriodsRequest) o;
        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(from, that.from)
                .append(to, that.to)
                .append(tzId, that.tzId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(from)
                .append(to)
                .append(tzId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("from", from)
                .append("to", to)
                .append("tzId", tzId)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public Date getFrom() {
        return from;
    }

    public void setFrom(final Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(final Date to) {
        this.to = to;
    }

    public String getTzId() {
        return tzId;
    }

    public void setTzId(final String tzId) {
        this.tzId = tzId;
    }
    //endregion
}
