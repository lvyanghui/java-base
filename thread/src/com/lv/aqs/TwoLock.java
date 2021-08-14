package com.lv.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class TwoLock implements Lock{

    class Syn extends AbstractQueuedSynchronizer{

        Syn(int count) {
            setState(count);
        }

        @Override
        protected int tryAcquireShared(int arg) {

            for(;;){
                int current = getState();
                int newCount = current - arg;
                if(newCount < 0 || compareAndSetState(current,newCount)){
                    return newCount;
                }
            }
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            for(;;){
                int current = getState();
                int newCount = current + arg;
                if(compareAndSetState(current,newCount)){
                    return true;
                }
            }
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        Condition newCondition(){
            return new ConditionObject();
        }
    }

    private Syn syn = new Syn(3);

    public void lock(){
        syn.acquireShared(1);
    }

    public boolean tryLock(){
        return syn.tryAcquireShared(1) >= 0;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return syn.tryAcquireSharedNanos(1,unit.toNanos(time));
    }

    @Override
    public void unlock() {
        syn.releaseShared(1);
    }

    public void lockInterruptibly() throws InterruptedException {
        syn.acquireSharedInterruptibly(1);
    }

    public Condition newCondition() {
        return syn.newCondition();
    }

}
