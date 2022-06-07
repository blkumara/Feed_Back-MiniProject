package com.ty.daoI;

import java.util.List;

import com.ty.dto.Admin;

public interface AdminDaoI {

	public Admin saveAdmin(Admin admin);

	public List<Admin> getAllAdmin();

	public Admin updateAdmin(Admin admin);

	public Admin deleteAdmin(int id);

}
