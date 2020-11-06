package com.leo.cloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * projectName: CloudCart
 *
 * @author: xr
 * time: 2020/11/6 14:58
 * description:
 */
@Data
@NoArgsConstructor
public class Cart {
    private Integer id;
    private Integer uid;
    private Integer skuid;
    private Integer scount;
    private Integer jprice;
    private Date ctime;
}
