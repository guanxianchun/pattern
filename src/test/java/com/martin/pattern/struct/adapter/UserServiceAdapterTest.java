package com.martin.pattern.struct.adapter;

import com.martin.pattern.struct.adapter.impl.UserServiceAdapter;

public class UserServiceAdapterTest {
	
	public static void main(String[] args) {
		UserServiceAdapter adapter = new UserServiceAdapter();
		adapter.loginForQQ("150090021");
		
		adapter.loginForToken("gxc|123|dafdsafdsfds");
	}
}
