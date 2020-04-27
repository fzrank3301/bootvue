package com.wang.vueuser.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class ResponseEntity {

    public final static String SUCCESS = "200";
    public final static String FAILED = "400";
    public final static String ERROR = "500";


    private String statecode;

    private String msg;

    private Object data;

}
