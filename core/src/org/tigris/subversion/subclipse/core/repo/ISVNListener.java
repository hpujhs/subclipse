/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     C�dric Chabanois (cchabanois@ifrance.com) - modified for Subversion 
 *******************************************************************************/
package org.tigris.subversion.subclipse.core.repo;

import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;



public interface ISVNListener {
	
    /**
     * called when a new repository is added to the list of repositories 
     */
    public void repositoryAdded(ISVNRepositoryLocation root);
    
    
    /**
     * called when a repository is removed from the list of repositories 
     */
	public void repositoryRemoved(ISVNRepositoryLocation root);
}

