package com.github.maybeec.oomph.task.fsmove.core.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.github.maybeec.oomph.task.fsmove.core.FSMoveUtil;
import com.github.maybeec.oomph.task.fsmove.core.exception.FSMoveException;
import com.github.maybeec.oomph.task.fsmove.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fsmove.core.exception.FSMoveException;

public class FSMoveUtilImpl implements FSMoveUtil {

	public void move(String source, String destination) throws FSMoveException {
		SetupTaskLogger LOG = SetupTaskLogger.getLogger();
	    LOG.logInfo("Moving " + source + " to " + destination);
	    Path sourcePath = Paths.get(source);
	    Path destinationPath = Paths.get(destination);
	    try
	    {
	      Files.move(sourcePath, destinationPath);
	    }
	    catch (IOException ex)
	    {
	      throw new FSMoveException(ex.getMessage());
	    }

	}

}
