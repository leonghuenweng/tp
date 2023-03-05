package seedu.duke.logs;
import seedu.duke.entries.income.Income;

import java.util.ArrayList;


public class IncomeLog {
    public static ArrayList<Income> incomeList = new ArrayList<>();

    public IncomeLog() {
        this.incomeList = new ArrayList<>();
    }


    public void add(Income incomeObj) {
        incomeList.add(incomeObj);
    }

//    public Task delete(int taskId) throws InvalidInputIDException {
//        boolean isInvalidID = taskId < 1 || taskId > tasks.size();
//        if (isInvalidID) {
//            throw new InvalidInputIDException();
//        }
//        Task deletedTask = tasks.get(taskId - 1);
//        tasks.remove(taskId - 1);
//        return deletedTask;
//    }
}
