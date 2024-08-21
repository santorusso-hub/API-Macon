package com.techprudent.springbootrestcrud.enums;

public enum HeaderRequest {

    APPTOKEN("AppToken","eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIwMzc0MzMyNi1mMzhmLTQ5NmMtOTg4Mi1mNDYxMWY5NmMxMjMiLCJuYW1lIjoiVE1YIiwiYWRtaW4iOmZhbHNlfQ.tPVSuN_iZEGBSDV27pdaYahrD3h_VvvNqldssvcJQvVhYDglmA3_symP38WlU1oeZTZkXJJQ6r450Gn5V7vEPw"),
    APPID("AppID","tmx"),
    USERINVOKE("UserInvoke","bpm"),
    RQUID("RqUID","4c432b95-8961-414a-8ef3-73c62f6bd9ab");

    private  String id;
    private  String descricao;

    HeaderRequest(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
