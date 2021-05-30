
public class Task {
	
	private int id_task;
	private int  computation_time;
	private int deadline_task;
	private int period_task ;
	
	public Task(int id_task, int computation_time, int deadline_task, int period_task) {
	
		this.id_task = id_task;
		this.computation_time = computation_time;
		this.deadline_task = deadline_task;
		this.period_task = period_task;
	}
	
	public int getId_task() {
		return id_task;
	}
	public void setId_task(int id_task) {
		this.id_task = id_task;
	}
	public int getComputation_time() {
		return computation_time;
	}
	public void setComputation_time(int computation_time) {
		this.computation_time = computation_time;
	}
	public int getDeadline_task() {
		return deadline_task;
	}
	public void setDeadline_task(int deadline_task) {
		this.deadline_task = deadline_task;
	}
	public int getPeriod_task() {
		return period_task;
	}
	public void setPeriod_task(int period_task) {
		this.period_task = period_task;
	}
	

}
