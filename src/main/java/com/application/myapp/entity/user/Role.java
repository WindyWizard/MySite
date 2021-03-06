package com.application.myapp.entity.user;

import java.util.Set;

public enum Role {
	ROLE_USER(Set.of(
		Permission.READ_ANY_PROFILE,
		Permission.EDIT_YOUR_PROFILE,

		Permission.CREATE_POSTS,
		Permission.DELETE_POSTS,
		Permission.EDIT_POSTS,
		Permission.READ_POSTS)),
	
	ROLE_ADMIN(Set.of(
		Permission.CREATE_PROFILE,
		Permission.READ_ANY_PROFILE,
		Permission.EDIT_YOUR_PROFILE,

		Permission.EDIT_ANY_PROFILE,
		Permission.DELETE_ANY_PROFILE,

		Permission.CREATE_POSTS,
		Permission.DELETE_POSTS,
		Permission.EDIT_POSTS,
		Permission.READ_POSTS)),

	ROLE_SUPERADMIN(Set.of(
		Permission.CREATE_PROFILE,
		Permission.READ_ANY_PROFILE,
		Permission.EDIT_YOUR_PROFILE,

		Permission.EDIT_ANY_PROFILE,
		Permission.DELETE_ANY_PROFILE,

		Permission.EDIT_USER_RIGHTS,

		Permission.CREATE_POSTS,
		Permission.DELETE_POSTS,
		Permission.EDIT_POSTS,
		Permission.READ_POSTS));

	private Set<Permission> permissions;

	Role(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}
}