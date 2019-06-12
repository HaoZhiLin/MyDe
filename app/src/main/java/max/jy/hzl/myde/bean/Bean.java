package max.jy.hzl.myde.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class Bean {
    @Id
    private Long id;
    private String name;
    private String sex;
    private boolean  type;
    @Generated(hash = 1896220751)
    public Bean(Long id, String name, String sex, boolean type) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.type = type;
    }
    @Generated(hash = 80546095)
    public Bean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public boolean getType() {
        return this.type;
    }
    public void setType(boolean type) {
        this.type = type;
    }
}
