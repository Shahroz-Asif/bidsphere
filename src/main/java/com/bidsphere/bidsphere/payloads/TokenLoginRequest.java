package com.bidsphere.bidsphere.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenLoginRequest {
    private String token;

    public TokenLoginRequest() {}
}
