package com.github.maybeec.oomph.task.fsmove.core;

import com.github.maybeec.oomph.task.fsmove.core.exception.FSMoveException;

public interface FSMoveUtil {
	
	void move(String source, String destination) throws FSMoveException;
	
}
