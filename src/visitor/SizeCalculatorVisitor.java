package visitor;

import filesystem.Directory;
import filesystem.File;

public class SizeCalculatorVisitor implements FileSystemVisitor {
	
	private int totalSize = 0;
	
	public int getTotalSize() {
		return totalSize;
	}
	
	private void updateTotalBy(int val) {
		totalSize += val;
	}

	@Override
	public void visitFile(File file) {
		// TODO Auto-generated method stub
		updateTotalBy(file.getSize());
		
	}

	@Override
	public void visitDirectory(Directory directory) {
		// TODO Auto-generated method stub
//		updateTotalBy(directory.getSize());
		
	}

}
