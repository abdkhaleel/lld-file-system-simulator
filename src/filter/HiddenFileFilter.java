package filter;

import filesystem.FileSystemEntry;

public class HiddenFileFilter implements FileFilter {

	@Override
	public boolean matches(FileSystemEntry entry) {
		// TODO Auto-generated method stub
		return entry.getName().startsWith(".");
	}

}
