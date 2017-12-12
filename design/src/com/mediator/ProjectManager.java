package com.mediator;

public class ProjectManager implements ProjectManagerInterface {
	private FangDeveloper fang;
	private YanDeveloper yan;
	private Tester tester;
	@Override
	public void toNextColleague(Colleague c) {
		if(c instanceof Designer){
			fang.coding();
		}else if(c instanceof FangDeveloper){
			yan.coding();
		}else if(c instanceof YanDeveloper){
			tester.test();
		}else if(c instanceof Tester){
			System.err.println("可以交给boss了");
		}
	}
	public void doAction(){
		Designer designer = new Designer(this);
		fang = new FangDeveloper(this);
		yan = new YanDeveloper(this);
		tester = new Tester(this);
		designer.disignerImage();
	}
	
}
