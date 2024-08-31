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
 * @TableName dispatch
 */
@TableName(value ="dispatch")
@Data
public class Dispatch implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long dispatchId;

    /**
     * 
     */
    private String carCategory;

    /**
     * 
     */
    private Integer num;

    /**
     * 
     */
    private String productCategory;

    /**
     * 
     */
    private String originCity;

    /**
     * 
     */
    private String destinationCity;

    /**
     * 
     */
    private Date departureDate;

    /**
     * 
     */
    private Date arrivalDate;

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
        Dispatch other = (Dispatch) that;
        return (this.getDispatchId() == null ? other.getDispatchId() == null : this.getDispatchId().equals(other.getDispatchId()))
            && (this.getCarCategory() == null ? other.getCarCategory() == null : this.getCarCategory().equals(other.getCarCategory()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getProductCategory() == null ? other.getProductCategory() == null : this.getProductCategory().equals(other.getProductCategory()))
            && (this.getOriginCity() == null ? other.getOriginCity() == null : this.getOriginCity().equals(other.getOriginCity()))
            && (this.getDestinationCity() == null ? other.getDestinationCity() == null : this.getDestinationCity().equals(other.getDestinationCity()))
            && (this.getDepartureDate() == null ? other.getDepartureDate() == null : this.getDepartureDate().equals(other.getDepartureDate()))
            && (this.getArrivalDate() == null ? other.getArrivalDate() == null : this.getArrivalDate().equals(other.getArrivalDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDispatchId() == null) ? 0 : getDispatchId().hashCode());
        result = prime * result + ((getCarCategory() == null) ? 0 : getCarCategory().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getProductCategory() == null) ? 0 : getProductCategory().hashCode());
        result = prime * result + ((getOriginCity() == null) ? 0 : getOriginCity().hashCode());
        result = prime * result + ((getDestinationCity() == null) ? 0 : getDestinationCity().hashCode());
        result = prime * result + ((getDepartureDate() == null) ? 0 : getDepartureDate().hashCode());
        result = prime * result + ((getArrivalDate() == null) ? 0 : getArrivalDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dispatchId=").append(dispatchId);
        sb.append(", carCategory=").append(carCategory);
        sb.append(", num=").append(num);
        sb.append(", productCategory=").append(productCategory);
        sb.append(", originCity=").append(originCity);
        sb.append(", destinationCity=").append(destinationCity);
        sb.append(", departureDate=").append(departureDate);
        sb.append(", arrivalDate=").append(arrivalDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}