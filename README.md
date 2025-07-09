# 📝 Word Count Tool

A lightweight **Java Swing desktop application** that counts the number of **words, characters** in a given text input.

## 🔧 Features

- Real-time word, character, and space counting
- Counts **all words including duplicates**, based on **space-separated tokens**
- Simple and clean user interface built with Java Swing
- **Clear** button to reset input and output fields
- **Exit** button to close the application

## 🧠 How It Works

- Words are detected by splitting the input text using spaces.
- Every word is counted — even if it appears multiple times.
- Characters are also calculated, which includes special characters as well(eg: " ! ?).

> Example: `"hello world hello"` counts as **3 words**, including the duplicate `"hello"`.

## 🖼️ Word Count Tool GUI

<br>
<img src="https://github.com/hema-priya-vadivel/Word-Count-Tool/blob/master/assets/image-1.png" alt="Word Count GUI - 1" width="400">
<br>

### 🧪 01 : Sample Input / Output 

> **Input Text:**  
> `The only way to do great work is tolove what you do`

**Explanation:**
- The tool splits the input based on **spaces**.
- `"tolove"` is counted as one word (no space between "to" and "love").
- `"do"` appears **twice** and is counted both times.
  
**🔢 Output:**
- **Words:** 12  
<img src="https://github.com/hema-priya-vadivel/Word-Count-Tool/blob/master/assets/image-2.png" alt="Word Count GUI - 2" width="400">
<br>

### 🧪 02 : Sample Input / Output

> **Input Text:**  
> `" The only way to do great work is tolove what you do !! "`

**Explanation:**
- The tool splits the input strictly based on **spaces**.
- Words like `"`, `is`, `tolove`, `do`, and `!!` are treated as **individual words**.
- `"do"` and `"` appears twice and is counted twice.
- Punctuation is not removed or filtered—**it's included as part of the word** if not space-separated.

**🔢 Output:**
- **Words:** 15  
<img src="https://github.com/hema-priya-vadivel/Word-Count-Tool/blob/master/assets/image-3.png" alt="Word Count GUI - 3" width="400">

## 🚀 How to Use

###  ✅ Option 1: Clone and Run the Source Code

1. Clone the repository:
   ```bash
   git clone https://github.com/hema-priya-vadivel/Word-Count-Tool.git

2. Open the project in your preferred Java IDE (IntelliJ, Eclipse, etc.).

3. Compile and run WordCountTool.java.

4. Enter a sentence/paragraph in the "Enter the words" textarea and click on "Count Words" button to view the total count of words

5. Use the Clear button to reset fields or Exit to close the app.

###  ✅ Option 2: Download & Run Application Directly

- [Download for Mac (.dmg)](https://github.com/hema-priya-vadivel/Word-Count-Tool/blob/master/releases/download/WordCountTool-macOs-1.0.dmg)

