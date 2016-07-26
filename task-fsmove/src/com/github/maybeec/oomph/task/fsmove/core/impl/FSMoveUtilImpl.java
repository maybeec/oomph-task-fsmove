package com.github.maybeec.oomph.task.fsmove.core.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.github.maybeec.oomph.task.fsmove.core.FSMoveUtil;
import com.github.maybeec.oomph.task.fsmove.core.exception.FSMoveException;
import com.github.maybeec.oomph.task.fsmove.core.SetupTaskLogger;

public class FSMoveUtilImpl implements FSMoveUtil {

	private SetupTaskLogger LOG = null;

	public void move(String source, String destination) throws FSMoveException {
		LOG = SetupTaskLogger.getLogger();
		LOG.logInfo("Moving " + source + " to " + destination);
		File sourceFile = new File(source);
		try {
			recursiveDirectoryMove(sourceFile, destination);
		} catch (IOException ex) {
			throw new FSMoveException(ex.getClass().getName() + ":" + ex.getMessage());
		}

	}

	private void recursiveDirectoryMove(File source, String destination) throws IOException {
		if (source.isDirectory()) {
			for (File f : source.listFiles()) {
				String fileDestination = destination + File.pathSeparator + f.getName();
				if (f.isDirectory() && f.listFiles().length > 0) {
					recursiveDirectoryMove(f, destination);
				} else {
					createPath(fileDestination);
					Files.move(f.toPath(), Paths.get(fileDestination), StandardCopyOption.REPLACE_EXISTING);
					LOG.log("Moved " + f.getPath() + " to " + fileDestination);
				}
			}
		} else {
			createPath(destination);
			Files.move(source.toPath(), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
			LOG.log("Moved " + source.getPath() + " to " + destination);
		}
	}

	private void createPath(String pathString) {
		File pathFile = new File(pathString);
		LOG.log("Making path for " + pathString);
		try {
			if (pathFile.isDirectory()) {
				pathFile.mkdirs();
			} else {
				pathFile.getParentFile().mkdirs();
			}
		} catch (Exception e) {
			LOG.logError(e.getMessage());
		}
	}

}
