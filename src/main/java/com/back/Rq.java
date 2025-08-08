package com.back;

public class Rq {
    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }


    public String getActionName() {

        // ? 기준 왼쪽을 잘라서 반환하면 된다.
        // 문자를 자른는 방법? -> gpt한테 물어보자
        return cmd.split("\\?")[0];
    }
}
