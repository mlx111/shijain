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
 * @TableName city_resource
 */
@TableName(value ="city_resource")
@Data
public class CityResource implements Serializable {
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
    private Integer storage;

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
        CityResource other = (CityResource) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getProductCategory() == null ? other.getProductCategory() == null : this.getProductCategory().equals(other.getProductCategory()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getProductCategory() == null) ? 0 : getProductCategory().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
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
        sb.append(", storage=").append(storage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}