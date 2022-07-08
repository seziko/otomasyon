package com.seziko.otomasyon.results;

public class ErrorResult extends Result{

    public ErrorResult(){
        super(false);
    }

    public ErrorResult(String message){
        super(false,message);
    }

}
