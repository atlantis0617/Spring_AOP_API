package org.spring.aop.api;

import org.spring.aop.api.impl.LockMixin;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockMixinAdvisor extends DefaultIntroductionAdvisor{
	
	/**   
	 */   
	private static final long serialVersionUID = -6461604806540077023L;

	public LockMixinAdvisor() {
        super(new LockMixin(), Lockable.class);
    }

}
