package org.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName city_car_overview
 */
@TableName(value ="city_car_overview")
@Data
public class CityCarOverview implements Serializable {
    /**
     * 
     */
    private String cityName;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String carCategory;

    /**
     * 
     */
    private Integer startingCarQuantity;

    /**
     * 
     */
    private Long arrivalCarQuantity;

    /**
     * 
     */
    private Long departureCarQuantity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CityCarOverview other = (CityCarOverview) that;
        return (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCarCategory() == null ? other.getCarCategory() == null : this.getCarCategory().equals(other.getCarCategory()))
            && (this.getStartingCarQuantity() == null ? other.getStartingCarQuantity() == null : this.getStartingCarQuantity().equals(other.getStartingCarQuantity()))
            && (this.getArrivalCarQuantity() == null ? other.getArrivalCarQuantity() == null : this.getArrivalCarQuantity().equals(other.getArrivalCarQuantity()))
            && (this.getDepartureCarQuantity() == null ? other.getDepartureCarQuantity() == null : this.getDepartureCarQuantity().equals(other.getDepartureCarQuantity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCarCategory() == null) ? 0 : getCarCategory().hashCode());
        result = prime * result + ((getStartingCarQuantity() == null) ? 0 : getStartingCarQuantity().hashCode());
        result = prime * result + ((getArrivalCarQuantity() == null) ? 0 : getArrivalCarQuantity().hashCode());
        result = prime * result + ((getDepartureCarQuantity() == null) ? 0 : getDepartureCarQuantity().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityName=").append(cityName);
        sb.append(", date=").append(date);
        sb.append(", carCategory=").append(carCategory);
        sb.append(", startingCarQuantity=").append(startingCarQuantity);
        sb.append(", arrivalCarQuantity=").append(arrivalCarQuantity);
        sb.append(", departureCarQuantity=").append(departureCarQuantity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}