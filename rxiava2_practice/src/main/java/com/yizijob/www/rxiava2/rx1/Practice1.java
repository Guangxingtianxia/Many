package com.yizijob.www.rxiava2.rx1;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/23  16:56
 * @Desc : rx2 第一个练习
 */

public class Practice1
{
    public static void main(String[] args)
    {
        test1();
        System.out.println
                ("=======================================================================");
        test2();
        System.out.println
                ("====================================3===================================");
        test3();

 System.out.println
                ("======================================4=================================");
//        test4();


    }



    private static void test3()
    {
        Observable.create(new ObservableOnSubscribe<Integer>()
        {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception
            {
                e.onNext(2);
                e.onNext(4);
                e.onNext(256);
                e.onNext(2576);
                e.onNext(2456463);

            }
        }).subscribe(new Consumer<Integer>()
        {
            @Override
            public void accept(Integer integer) throws Exception
            {
                System.out.println("accept:====>" + integer);

            }
        });


    }

    private static void test2()
    {
        Observable.create(new ObservableOnSubscribe<Integer>()
        {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception
            {
                System.out.println("TAG" + "Emitter" + 1);
                e.onNext(1);

                System.out.println("TAG" + "Emitter" + 2);
                e.onNext(2);

                System.out.println("TAG" + "Emitter" + 3);
                e.onNext(3);

                System.out.println("TAG" + "Emitter" + 4);
                e.onNext(4);

                System.out.println("TAG" + "onComplete()");
                e.onComplete();

                System.out.println("TAG" + "Emitter" + 5);
                e.onNext(5);

            }
        }).subscribe(new Observer<Integer>()
        {
            private Disposable mDisposable;
            private int i;

            @Override
            public void onSubscribe(Disposable d)
            {
                System.out.println("TAG" + "onSubscribe()");
                mDisposable = d;
            }

            @Override
            public void onNext(Integer value)
            {
                if (value == 2)
                {
                    // 停止 发射数据
                    mDisposable.dispose();
                    System.out.println("TAG" + " dispose()，value==2，停止 发射数据");
                }

            }

            @Override
            public void onError(Throwable e)
            {
                System.out.println("TAG" + "onError()");
            }

            @Override
            public void onComplete()
            {
                System.out.println("TAG" + "onComplete()");
            }
        });
    }

    private static void test1()
    {
        // 上游Observable
        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>()
        {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception
            {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onComplete();

            }
        });

        // 下游
        Observer observer = new Observer()
        {
            @Override
            public void onSubscribe(Disposable d)
            {
                System.out.println("TAG" + "----->onSubscribe()");

                if (d.isDisposed())
                {
                    System.out.println("  TAG" + "----->onSubscribe()" + true);
                }
                else
                {
                    System.out.println("  TAG" + "----->onSubscribe()" + false);
                }

            }

            @Override
            public void onNext(Object value)
            {
                System.out.println("TAG" + "----->onNext()" + value);
            }

            @Override
            public void onError(Throwable e)
            {
                System.out.println("TAG" + "----->onError()");
            }

            @Override
            public void onComplete()
            {
                System.out.println("TAG" + "----->onComplete()");
            }
        };

        observable.subscribe(observer);

    }


}
