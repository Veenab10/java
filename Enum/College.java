public class College{

	Departments departments ;
	Grades grades;
	Days  days;
	Months  months;
	BranchNames branchNames;
	Seasons seasons;
	Levels levels;
	RainbowColours rainbowColours;
	Planets planets;
	ThreadStates threadStates;

	College(Departments departments,Grades grades,Days  days, Months  months, BranchNames branchNames, Seasons seasons, Levels levels, RainbowColours rainbowColours, Planets planets, ThreadStates threadStates)
{

	this.departments=departments;
	this.grades=grades;
	this.days=days;
	this.months=months;
	this.branchNames=branchNames;
	this.seasons=seasons;
	this.levels=levels;
	this.rainbowColours=rainbowColours;
	this.planets=planets;
	this.threadStates=threadStates;
}

public void displayEnum()
{
	System.out.println(departments);
	System.out.println(grades);
	System.out.println(days);
	System.out.println(months);
	System.out.println(branchNames);
	System.out.println(seasons);
	System.out.println(levels);
	System.out.println(rainbowColours);
	System.out.println(planets);
	System.out.println(threadStates);
}












}
	
	
	
	


