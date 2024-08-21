package com.techprudent.springbootrestcrud.headers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class HeadersAPI {

    private String appToken;
    private String appID;
    private String rqUID;
    private String userInvoke;

    public HeadersAPI(String appToken, String appID, String rqUID, String userInvoke) {
        this.appToken = appToken;
        this.appID = appID;
        this.rqUID = rqUID;
        this.userInvoke = userInvoke;
    }

    public HeadersAPI() {
    }


}
