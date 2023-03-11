package seedu.duke.commands;

import seedu.duke.entries.Category;
import seedu.duke.entries.Entry;
import seedu.duke.entrylog.EntryLog;
import seedu.duke.ui.UI;

import java.util.List;


public class ViewCommand extends Command {
    UI ui = new UI();
    int numberOfEntriesToView;
    Category categoryToView;
    public ViewCommand(int numberOfEntriesToView, Category categoryToView){
        this.categoryToView = categoryToView;
        this.numberOfEntriesToView = numberOfEntriesToView;
    }

    @Override
    public void execute(EntryLog entries) {
        List<Entry> EntriesInRelevantCategory = entries.filterCategory(this.categoryToView);
        List<Entry> specifiedNumberOfEntries = null;

        for (int index = 0; index < this.numberOfEntriesToView && index < EntriesInRelevantCategory.size(); index++) {
            specifiedNumberOfEntries.add(EntriesInRelevantCategory.get(index));
        }

        ui.printEntriesToBeViewed(specifiedNumberOfEntries, this.categoryToView.toString());
    }
}
