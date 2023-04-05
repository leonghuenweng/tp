<!-- omit in toc -->
# User Guide

<!-- omit in toc -->
## Table of Contents

- [Getting Started](#getting-started)
- [Features](#features)
  - [Adding an expense: `/add`](#adding-an-expense-add)
  - [Deleting an expense: `/delete`](#deleting-an-expense-delete)
  - [Edit an expense: `/edit`](#edit-an-expense-edit)
  - [View an expense: `/view`](#view-an-expense-view)
  - [Show help menu: `/help`](#show-help-menu-help)
  - [Exit Program: `/bye`](#exit-program-bye)
  - [Supported Categories](#supported-categories)
- [Command Summary](#command-summary)
- [Frequently Asked Questions](#frequently-asked-questions)

## Getting Started

1. Ensure that you have Java `11` and above
  installed [(Installation Guide)](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)
2. Download our latest release of `PocketPal.jar` [here](https://github.com/AY2223S2-CS2113-W15-2/tp/releases)
3. Run the application
  with `java -jar PocketPal.jar` [(Running JAR Guide)](https://se-education.org/guides/tutorials/jar.html#running-jar-files)
4. You should see the following welcome screen
   ```
   Welcome to
   _____           _        _   _____      _
   |  __ \         | |      | | |  __ \    | |
   | |__) |__   ___| | _____| |_| |__) |_ _| |
   |  ___/ _ \ / __| |/ / _ \ __|  ___/ _` | |
   | |  | (_) | (__|   <  __/ |_| |  | (_| | |
   |_|   \___/ \___|_|\_\___|\__|_|   \__,_|_|

   How may I help you?
   ________________________________________________
   Enter a command or /help to see the list of commands available.
   > 
   ```
5. To enter an entry, you may use [`/add`](#adding-an-expense-add-add), 
   or enter [`/help`](#show-help-menu-help-help) to view the help menu.

<!-- @@author adenteo -->
> The table below provides a summary of all the currently supported features in PocketPal.
> More detailed explanations on the usage of the commands are provided as well.

## Features

If you face any problems, do visit the [FAQ](#frequently-asked-questions) segment!

| Command                                |                      Function                       |
| -------------------------------------- | :-------------------------------------------------: |
| [/add](#adding-an-expense-add)         |                   Adds an expense                   |
| [/delete](#deleting-an-expense-delete) |                 Deletes an expense                  |
| [/edit](#edit-an-expense-edit)         |                  Edits an expense                   |
| [/view](#view-an-expense-view)         | Displays details of an expense e.g. Price, Category |
| [/help](#show-help-menu-help)          |               Displays the help menu                |
| [/bye](#exit-program-bye)              |               Terminates the program                |

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### Adding an expense: `/add`

Adds an expense to your current expenditure.

Format: `/add <-d | -description DESCRIPTION> [EXTRA_DESCRIPTION...] <-c | -category CATEGORY> <-p | -price PRICE>`

- `DESCRIPTION`, `EXTRA_DESCRIPTION` can only contain alphabets, digits or spaces.
- `CATEGORY` must be currently support in PocketPal.
- `PRICE` can be in numeric or decimal format.
- Flags can be used in any order, but they are all **required**.

Here is a [list](#supported-categories) of categories currently supported in PocketPal.

Example of usage:

`/add -d Lunch at McDonalds -category Food -price 19.9`

`/add -d Apple Macbook Air -p 1300 -c Personal`

`/add -p 1300 -c Personal -d Apple Macbook Air`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### Deleting an expense: `/delete`

Deletes specified expense(s) from your current expenditure.

The expense IDs can be obtained from the [`/view`](#view-an-expense-view) command.

Format: `/delete <EXPENSE_ID> [ADDITIONAL_EXPENSE_ID...]`

- `EXPENSE_ID`, `ADDITIONAL_EXPENSE_ID` must be a whole number.

Example of usage:

`/delete 5`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### Edit an expense: `/edit`

Edits a specified expense in your current expenditure with the given flag(s).

Format: `/edit <EXPENSE_ID> [-c | -category NEW_CATEGORY] [-p | -price NEW_PRICE] [-d | -description NEW_DESC]`

- `EXPENSE_ID` must be a whole number.
- Flags can be specified in any order. If none are specified, the expense remains unmodified.
- `NEW_CATEGORY`, `NEW_PRICE`, `NEW_DESC` must follow the required format as per the corresponding flag.

__Available flags__

- `-d | -description DESCRIPTION`
    - Replaces the current description of the expense with `DESCRIPTION`

- `-c | -category CATEGORY`
    - Replaces the current category of the expense with `CATEGORY`

- `-p | -price PRICE`
    - Replaces the current price of the expense with `PRICE`

Example of usage:

`/edit 5 -p 10.50`

`/edit 5 -description Grab to school -c Transportation`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### View an expense: `/view`

Displays a list of your current expenditure.

Format: `/view [COUNT] [-c | -category CATEGORY] [-p | -price PRICE_MIN] [-p | -price PRICE_MAX]
[<-sd | -startdate START_DATE -ed | -enddate END_DATE>]`

- `COUNT` refers to the latest N entries made by the user.
  - For example, `/view 20` means "display the latest 20 entries."
  - This argument must be a whole number. 
  - If not specified, all the expenditures will be listed.
  - If **count > total number of entries recorded**, all entries will be displayed.
- `CATEGORY` must be a supported category. If not specified, expenditures from all categories will be listed.
- `PRICE_MIN`, `PRICE_MAX` must be more than 0. If `PRICE_MAX` is not specified, all expenses with a higher price than
  `PRICE_MIN` price will be displayed. The first price entered must be less than that on the
  right. i.e. **MIN_PRICE should be entered before MAX_PRICE.**
- `START_DATE`, `END_DATE` must be in `dd/MM/yy` format. 
  - **Both flags are required if user wishes to use this filter feature.**
  - if unspecified, the earliest entries to the latest entries will be displayed.

Example of usage:

`/view 10`

`/view -c food`

`/view -c food -sd 12/03/23 -ed 11/04/23`

`/view -c food -p 2 -sd 12/03/23 -ed 11/04/23`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### Show help menu: `/help`

Displays the help menu.

Format: `/help`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### Exit Program: `/bye`

Terminates PocketPal.

Format: `/bye`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

### Supported Categories

These are the categories currently supported by PocketPal:

`Clothing, Entertainment, Food, Medical, Personal, Transportation, Utilities, Income, Others`

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

## Command Summary

| Command | Format                                                                                                                                                                   |
| ------: | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
|    /add | /add <-d &#124; -description DESCRIPTION> [EXTRA_DESCRIPTION...] <-c &VerticalLine; -category CATEGORY> <-p &#124; -price PRICE>                                         |
|   /view | /view [COUNT] [-c &#124; -category CATEGORY] [-p &#124; -price PRICE_MIN] [-p &#124; -price PRICE_MAX] [<-sd &#124; -startdate START_DATE -ed &#124; -enddate END_DATE>] |
|   /edit | /edit <EXPENSE_ID> [-c &#124; -category NEW_CATEGORY] [-p &#124; -price NEW_PRICE] [-d &#124; -description NEW_DESC]                                                     |
| /delete | /delete <EXPENSE_ID>                                                                                                                                                     |
|   /help | /help                                                                                                                                                                    |

*warning 1* :
for commands that require inputs for different flags, when multiple inputs are supplied to the same flag, the
command will only interpret the **first** / **leftmost** input. Refer to the examples below:

`/edit 7 -p 5.5 -p 6.6` will be interpreted as `/edit 7 -p 5.5`

`/add -p 1300 -p 200 -c Personal -d Apple Macbook Air -d Apple watch` will be interpreted as `/add -p 1300 -c Personal
-d Apple Macbook Air`

*warning 2* : unless otherwise specified, all inputs consisting of **ONLY WHITESPACES** will trigger an error message.

<!-- @@author -->

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

## Frequently Asked Questions

> __Q:__ I am facing trouble starting the application. Do you know what might be the issue?
>
> __A:__ Please ensure that you have Java `11` and above installed on your machine.
>        You may find more instructions at the [Getting Started](#getting-started) section

> __Q:__ How do I know whether the data entered is saved?
>
> __A:__ Your data is saved automatically when you interact with the application.
>        There is no need to manually perform the save operation.

> __Q:__ How do I transfer my application data to another computer?
> 
> __A:__ Your application data stored in `data/storage.txt`. To use PocketPal on another device,
>        simply copy the `data` folder to the same directory as `PocketPal.jar` and start the
>        application as per normal. Your stored entries will be automatically loaded.

> __Q:__ My application crashed. How do I report the problem to the developers?
>
> __A:__ We are sorry for the unpleasant experience with PocketPal, and we would be more than happy
>        to solve the issue. You may file an issue on our GitHub stating how you arrived at the 
>        problem, so that our developers can assist you with the issue. Please also attach the application 
>        logs, which can be found at `logs/pocketpal.txt`

> __Q:__ I am a developer. How can I find the source code and contribute to PocketPal?
>
> __A:__ PocketPal is an open-source application, and we welcome developers to share their ideas.
>        You may find the source code on [GitHub](https://github.com/AY2223S2-CS2113-W15-2/tp/).
> 
> __Q:__ I accidentally touched the data in my `storage.txt` file - what do I do?
>
> __A:__ The data in the `storage.txt` file is saved in the format `DESCRIPTION,PRICE,CATEGORY,DATE`. Make sure the data in the file is in the correct format, or else it will be overwritten with a blank data file. The category must be capitalized, and the date must be in the format `D MMM YYYY; HH:MM`.

<div style="text-align: right;">
   <a href="#table-of-contents"> Back to Table of Contents </a>
</div>

