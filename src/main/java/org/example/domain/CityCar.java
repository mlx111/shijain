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
 * @TableName city_car
 */
@TableName(value ="city_car")
@Data
public class CityCar implements Serializable {
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
    private String carCategory;

    /**
     * 
     */
    private Integer num;

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
        CityCar other = (CityCar) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getCarCategory() == null ? other.getCarCategory() == null : this.getCarCategory().equals(other.getCarCategory()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getCarCategory() == null) ? 0 : getCarCategory().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
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
        sb.append(", carCategory=").append(carCategory);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}