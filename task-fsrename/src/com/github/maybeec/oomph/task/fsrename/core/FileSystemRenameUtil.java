/**
 *
 */
package com.github.maybeec.oomph.task.fsrename.core;

import com.github.maybeec.oomph.task.fsrename.core.exception.FSRenameException;

/**
 * @author sholzer
 *
 */
public interface FileSystemRenameUtil
{

  /**
   * renames the resource at source to destination using the native system commands
   * @param source File or Directory path
   * @param destination Name or path
   * @throws FSRenameException
   */
  void rename(String source, String destination) throws FSRenameException;

}
