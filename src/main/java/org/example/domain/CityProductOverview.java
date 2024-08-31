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
 * @TableName city_product_overview
 */
@TableName(value ="city_product_overview")
@Data
public class CityProductOverview implements Serializable {
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
    private String productCategory;

    /**
     * 
     */
    private Integer production;

    /**
     * 
     */
    private Integer consumption;

    /**
     * 
     */
    private Integer storage;

    /**
     * 
     */
    private Double arrivalQuantity;

    /**
     * 
     */
    private Double departureQuantity;

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
        CityProductOverview other = (CityProductOverview) that;
        return (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getProductCategory() == null ? other.getProductCategory() == null : this.getProductCategory().equals(other.getProductCategory()))
            && (this.getProduction() == null ? other.getProduction() == null : this.getProduction().equals(other.getProduction()))
            && (this.getConsumption() == null ? other.getConsumption() == null : this.getConsumption().equals(other.getConsumption()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getArrivalQuantity() == null ? other.getArrivalQuantity() == null : this.getArrivalQuantity().equals(other.getArrivalQuantity()))
            && (this.getDepartureQuantity() == null ? other.getDepartureQuantity() == null : this.getDepartureQuantity().equals(other.getDepartureQuantity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getProductCategory() == null) ? 0 : getProductCategory().hashCode());
        result = prime * result + ((getProduction() == null) ? 0 : getProduction().hashCode());
        result = prime * result + ((getConsumption() == null) ? 0 : getConsumption().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getArrivalQuantity() == null) ? 0 : getArrivalQuantity().hashCode());
        result = prime * result + ((getDepartureQuantity() == null) ? 0 : getDepartureQuantity().hashCode());
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
        sb.append(", productCategory=").append(productCategory);
        sb.append(", production=").append(production);
        sb.append(", consumption=").append(consumption);
        sb.append(", storage=").append(storage);
        sb.append(", arrivalQuantity=").append(arrivalQuantity);
        sb.append(", departureQuantity=").append(departureQuantity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}