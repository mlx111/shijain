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
 * @TableName city_get
 */
@TableName(value ="city_get")
@Data
public class CityGet implements Serializable {
    /**
     * 
     */
    @TableId
    private Date date;

    /**
     * 
     */
    @TableId
    private String cityName;

    /**
     * 
     */
    @TableId
    private String productCategory;

    /**
     * 
     */
    private Integer productionVolume;

    /**
     * 
     */
    private Integer consumptionVolume;

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
        CityGet other = (CityGet) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getProductCategory() == null ? other.getProductCategory() == null : this.getProductCategory().equals(other.getProductCategory()))
            && (this.getProductionVolume() == null ? other.getProductionVolume() == null : this.getProductionVolume().equals(other.getProductionVolume()))
            && (this.getConsumptionVolume() == null ? other.getConsumptionVolume() == null : this.getConsumptionVolume().equals(other.getConsumptionVolume()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getProductCategory() == null) ? 0 : getProductCategory().hashCode());
        result = prime * result + ((getProductionVolume() == null) ? 0 : getProductionVolume().hashCode());
        result = prime * result + ((getConsumptionVolume() == null) ? 0 : getConsumptionVolume().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", date=").append(date);
        sb.append(", cityName=").append(cityName);
        sb.append(", productCategory=").append(productCategory);
        sb.append(", productionVolume=").append(productionVolume);
        sb.append(", consumptionVolume=").append(consumptionVolume);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}