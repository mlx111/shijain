package org.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName city_distance
 */
@TableName(value ="city_distance")
@Data
public class CityDistance implements Serializable {
    /**
     * 
     */
    @TableId
    private String cityx;

    /**
     * 
     */
    @TableId
    private String cityy;

    /**
     * 
     */
    private Double distance;

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
        CityDistance other = (CityDistance) that;
        return (this.getCityx() == null ? other.getCityx() == null : this.getCityx().equals(other.getCityx()))
            && (this.getCityy() == null ? other.getCityy() == null : this.getCityy().equals(other.getCityy()))
            && (this.getDistance() == null ? other.getDistance() == null : this.getDistance().equals(other.getDistance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityx() == null) ? 0 : getCityx().hashCode());
        result = prime * result + ((getCityy() == null) ? 0 : getCityy().hashCode());
        result = prime * result + ((getDistance() == null) ? 0 : getDistance().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityx=").append(cityx);
        sb.append(", cityy=").append(cityy);
        sb.append(", distance=").append(distance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}