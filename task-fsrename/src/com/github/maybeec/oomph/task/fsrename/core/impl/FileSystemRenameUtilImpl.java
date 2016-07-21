/**
 *
 */
package com.github.maybeec.oomph.task.fsrename.core.impl;

import com.github.maybeec.oomph.task.fsrename.core.FileSystemRenameUtil;
import com.github.maybeec.oomph.task.fsrename.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fsrename.core.exception.FSRenameException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author sholzer
 *
 */
public class FileSystemRenameUtilImpl implements FileSystemRenameUtil
{

  /*
   * (non-Javadoc)
   * @see com.github.maybeec.oomph.task.fsrename.core.FileSystemRenameUtil#rename(java.lang.String, java.lang.String)
   */
  public void rename(String source, String destination) throws FSRenameException
  {
    SetupTaskLogger LOG = SetupTaskLogger.getLogger();
    LOG.logInfo("Renaming " + source + " to " + destination);
    Path sourcePath = Paths.get(source);
    Path destinationPath = Paths.get(sourcePath.getParent().toString() + File.pathSeparator + destination);
    try
    {
      Files.move(sourcePath, destinationPath);
    }
    catch (IOException ex)
    {
      throw new FSRenameException(ex.getMessage());
    }

  }

}
