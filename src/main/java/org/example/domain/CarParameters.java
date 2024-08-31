package org.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName car_parameters
 */
@TableName(value ="car_parameters")
@Data
public class CarParameters implements Serializable {
    /**
     * 
     */
    @TableId
    private String carCategory;

    /**
     * 
     */
    private Double cost;

    /**
     * 
     */
    private Double weightLimit;

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
        CarParameters other = (CarParameters) that;
        return (this.getCarCategory() == null ? other.getCarCategory() == null : this.getCarCategory().equals(other.getCarCategory()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getWeightLimit() == null ? other.getWeightLimit() == null : this.getWeightLimit().equals(other.getWeightLimit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarCategory() == null) ? 0 : getCarCategory().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getWeightLimit() == null) ? 0 : getWeightLimit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carCategory=").append(carCategory);
        sb.append(", cost=").append(cost);
        sb.append(", weightLimit=").append(weightLimit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}