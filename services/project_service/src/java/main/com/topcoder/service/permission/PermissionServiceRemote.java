/*
 * Copyright (C) 2008 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.service.permission;

import javax.ejb.Remote;

/**
 * <p>
 * This is the local interface for EJB 3.0 bean. It is a marker interface which simply extends the
 * <code>{@link PermissionService}</code> contract. It allows the <code>{@link PermissionService}</code> to also be
 * accessed as a local bean.
 * </p>
 * <p>
 * Implementations will simply need to implement the base contract - <code>{@link PermissionService}</code>. The marker
 * interface itself requires no special implementation.
 * </p>
 * <p>
 * <b>Thread Safety</b>: Implementations must be thread safe.
 * </p>
 *
 * @version 1.0
 */
@Remote
public interface PermissionServiceRemote extends PermissionService {
}
