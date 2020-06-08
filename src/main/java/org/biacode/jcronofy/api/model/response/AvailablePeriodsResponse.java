package org.biacode.jcronofy.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.biacode.jcronofy.api.model.AvailablePeriodModel;
import org.biacode.jcronofy.api.model.EventsPagesModel;
import org.biacode.jcronofy.api.model.common.AbstractCronofyResponse;

import java.util.List;

/**
 * User: Don Holly
 * Date: 6/8/20
 * Time: 1:00 PM
 */
public class AvailablePeriodsResponse extends AbstractCronofyResponse {
    private static final long serialVersionUID = 2670439355123857913L;

    //region Properties
    @JsonProperty("pages")
    private EventsPagesModel pages;

    @JsonProperty("available_periods")
    private List<AvailablePeriodModel> availablePeriods;
    //endregion

    //region Constructors
    public AvailablePeriodsResponse() {
    }

    public AvailablePeriodsResponse(final EventsPagesModel pages, final List<AvailablePeriodModel> availablePeriods) {
        this.pages = pages;
        this.availablePeriods = availablePeriods;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailablePeriodsResponse)) {
            return false;
        }
        final AvailablePeriodsResponse that = (AvailablePeriodsResponse) o;
        return new EqualsBuilder()
                .append(pages, that.pages)
                .append(availablePeriods, that.availablePeriods)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(pages)
                .append(availablePeriods)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pages", pages)
                .append("availablePeriods", availablePeriods)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public EventsPagesModel getPages() {
        return pages;
    }

    public void setPages(final EventsPagesModel pages) {
        this.pages = pages;
    }

    public List<AvailablePeriodModel> getAvailablePeriods() {
        return availablePeriods;
    }

    public void setAvailablePeriods(final List<AvailablePeriodModel> availablePeriods) {
        this.availablePeriods = availablePeriods;
    }
    //endregion
}
