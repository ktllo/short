package org.leolo.net.utl.shorten;

public class CacheManager {

	private static CacheManager instance;
	
	/**
	 * The maximum cache size
	 */
	public static final int CACHE_SOFT_MAX_SIZE = 1024;
	
	
	public static CacheManager getCacheManager(){
		if(instance==null)
			instance = new CacheManager();
		return instance;
	}
	
	private CacheManager(){
		
	}
	
	class Cleaner extends Thread{
		
		public void run(){
			
		}
		
	}
}
