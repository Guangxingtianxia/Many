package com.yizijob.www.rxiava2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        test4();

    }

    private static void test4()
    {
        Observable.create(new ObservableOnSubscribe<Integer>()
        {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception
            {
                e.onNext(23);
                e.onNext(2555523);
                e.onNext(212123);
                e.onNext(2345512);

            }
        }).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).doOnNext
                (new Consumer<Integer>()
                {
                    @Override
                    public void accept(Integer integer) throws Exception
                    {

                    }
                }).observeOn(Schedulers.io()).doOnNext(new Consumer<Integer>()
        {
            @Override
            public void accept(Integer integer) throws Exception
            {

            }
        }).subscribe(new Consumer<Integer>()
        {
            @Override
            public void accept(Integer integer) throws Exception
            {
                System.out.println("last:"+integer);
            }
        });



    }

}
