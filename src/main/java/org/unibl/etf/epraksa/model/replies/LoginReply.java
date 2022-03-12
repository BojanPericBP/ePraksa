package org.unibl.etf.epraksa.model.replies;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LoginReply {
    private String token;

    public LoginReply(String token){
        this.token = token;
    }

}
