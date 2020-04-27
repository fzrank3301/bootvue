package com.wang.vueuser.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.function.DoubleBinaryOperator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class UserEntity {
    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private String phonecode;
}
