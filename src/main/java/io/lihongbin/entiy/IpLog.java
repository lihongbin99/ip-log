package io.lihongbin.entiy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class IpLog {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String ip;

    private String name;

    private LocalDateTime createTime;

    public IpLog(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }

}
