package com.mybatis.plus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author huran
 * @Title: ParamSome
 * @ProjectName mybatis-plus
 * @Description: TODO
 * @date 2018/10/1515:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ParamSome {
    private Integer yihao;
    private String erhao;
}
