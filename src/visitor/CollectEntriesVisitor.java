package visitor;
import filesystem.*;
import java.util.*;
public class CollectEntriesVisitor implements FileSystemVisitor {
	private final List<FileSystemEntry> entries;
	public CollectEntriesVisitor() {
		entries = new ArrayList<>();
	}
	@Override
	public void visitFile(File file) {
		// TODO Auto-generated method stub
		entries.add(file);
		
	}
	@Override
	public void visitDirectory(Directory directory) {
		// TODO Auto-generated method stub
		entries.add(directory);
	}
	
	public List<FileSystemEntry> getEntries(){
		return entries;
	}
}
