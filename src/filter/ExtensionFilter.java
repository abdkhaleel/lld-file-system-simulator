package filter;

import filesystem.FileSystemEntry;

public class ExtensionFilter implements FileFilter {
	
	private String extension;
	
	public ExtensionFilter(String extension) {
		this.extension = "." + extension;
	}

	@Override
	public boolean matches(FileSystemEntry entry) {
		// TODO Auto-generated method stub
		return entry.getName().endsWith(extension);
	}

}
