package org.spring.aop.api;

public interface Lockable {
	void lock();

	void unlock();

	boolean locked();
}
