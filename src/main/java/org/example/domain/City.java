package org.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName city
 */
@TableName(value ="city")
@Data
public class City implements Serializable {
    /**
     * 
     */
    @TableId
    private String cityName;

    /**
     * 
     */
    private Double siteLongitude;

    /**
     * 
     */
    private Double siteLatitude;

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
        City other = (City) that;
        return (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getSiteLongitude() == null ? other.getSiteLongitude() == null : this.getSiteLongitude().equals(other.getSiteLongitude()))
            && (this.getSiteLatitude() == null ? other.getSiteLatitude() == null : this.getSiteLatitude().equals(other.getSiteLatitude()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getSiteLongitude() == null) ? 0 : getSiteLongitude().hashCode());
        result = prime * result + ((getSiteLatitude() == null) ? 0 : getSiteLatitude().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityName=").append(cityName);
        sb.append(", siteLongitude=").append(siteLongitude);
        sb.append(", siteLatitude=").append(siteLatitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}