package filter;

import java.util.*;
import iterator.*;

import filesystem.FileSystemEntry;

public class FileFilterChain {
//	private final FileSystemEntry entry;
	private final List<FileFilter> filters;
//	private final SizeFilter sizeFilter;
//	private final ExtensionFilter extensionFilter;
//	private final HiddenFileFilter hiddenFilter;
	public FileFilterChain(int size, String extension, boolean hidden) {
//		
//		this.entry = entry;
		filters = new ArrayList<>();
		filters.add(new SizeFilter(size));
		filters.add(new ExtensionFilter(extension));
		if(hidden) filters.add(new HiddenFileFilter());
		
	}
	
	public List<FileSystemEntry> applyFilters(List<FileSystemEntry> entries){
		List<FileSystemEntry> result = new ArrayList<>();
		
		for(FileSystemEntry entry: entries) {
//			System.out.println(entry);
			boolean passed = true;
			for(FileFilter filter: filters) {
				System.out.println(entry.getName());
				System.out.println(filter.getClass());
				System.out.println(filter.matches(entry));
				if(!filter.matches(entry)) {
					passed = false;
					break;
				}
			}
			if(passed) {
				result.add(entry);
			}
		}
		return result;
		
	}
//	
//	public List<FileSystemEntry> applyFilters(){
//		List<FileSystemEntry> entries = new ArrayList<>();
//		IterableCollection<FileSystemEntry> node = new FileSystemCollection();
//		node.add(entry);
//		iterator.Iterator<FileSystemEntry> it = node.careateIterator();
//		while(it.hasNext()) {
//			entries.add(it.next());
//		}
//		System.out.println(entries);
//		return applyFilters(entries);
//	}
}
