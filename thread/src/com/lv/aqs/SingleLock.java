package com.lv.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class SingleLock implements Lock{

    class Syn extends AbstractQueuedSynchronizer{

        @Override
        protected boolean tryAcquire(int arg) {
            if(compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        Condition newCondition(){
            return new ConditionObject();
        }
    }

    private Syn syn = new Syn();

    public void lock(){
        syn.acquire(1);
    }

    public boolean tryLock(){
        return syn.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return syn.tryAcquireNanos(1,unit.toNanos(time));
    }

    @Override
    public void unlock() {
        syn.release(1);
    }

    public void lockInterruptibly() throws InterruptedException {
        syn.acquireInterruptibly(1);
    }

    public Condition newCondition() {
        return syn.newCondition();
    }

}
