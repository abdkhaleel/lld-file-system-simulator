package filter;

import filesystem.FileSystemEntry;

public class SizeFilter implements FileFilter {
	
	private int size;
	
	public SizeFilter(int size) {
		this.size = size;
	}

	@Override
	public boolean matches(FileSystemEntry entry) {
		// TODO Auto-generated method stub
		return entry.getSize() <= size;
	}

}
