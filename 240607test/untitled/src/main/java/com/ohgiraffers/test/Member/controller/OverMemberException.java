package com.ohgiraffers.test.Member.controller;


public class OverMemberException extends Throwable {

    public OverMemberException() {
        System.out.println(" Member List is full ");
    }
}

