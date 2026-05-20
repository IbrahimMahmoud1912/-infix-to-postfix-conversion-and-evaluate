# ⚙️ Expression Solver

A JavaFX desktop application that evaluates mathematical expressions in real time.  
It converts **infix notation** → **postfix (RPN)** using the **Shunting-Yard algorithm**,  
then evaluates the result using a **stack-based calculator**.

---

## 🖥️ Preview

> Ocean-themed UI with live postfix conversion and step-by-step trace output.

---

## ✨ Features

- ✅ Converts infix expressions to postfix (Reverse Polish Notation)
- ✅ Evaluates the result instantly
- ✅ Supports `+` `-` `*` `/` `^` operators and parentheses `()`
- ✅ Handles negative numbers via unary minus preprocessing
- ✅ Displays a full step-by-step conversion trace
- ✅ Ocean-themed dark UI built with JavaFX
- ✅ Enter key shortcut for fast evaluation
- ✅ Clear error messages for invalid input

---

## 🧠 How It Works
---

## 📐 Supported Operators

| Operator | Symbol | Priority |
|----------|--------|----------|
| Addition | `+` | 1 |
| Subtraction | `-` | 1 |
| Multiplication | `*` | 2 |
| Division | `/` | 2 |
| Exponentiation | `^` | 3 |
| Unary Minus | `-5` | 4 |

---

## ⚡ Big O Complexity

| Step | Time | Space |
|------|------|-------|
| Tokenisation | O(n) | O(n) |
| Infix → Postfix | O(n) | O(n) |
| Postfix Evaluation | O(n) | O(n) |
| **Total** | **O(n)** | **O(n)** |

> n = number of tokens in the expression

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- JavaFX 17 or higher
- Maven or your preferred build tool

### Run the project

```bash
git clone https://github.com/YOUR_USERNAME/expression-solver-javafx.git
cd expression-solver-javafx
# Run with your IDE (IntelliJ / Eclipse) or Maven
mvn javafx:run
```

---

## 🧪 Example Inputs

| Input | Postfix | Result |
|-------|---------|--------|
| `(8+2)*3-1` | `8 2 + 3 * 1 -` | `29` |
| `2^10` | `2 10 ^` | `1024` |
| `10/4` | `10 4 /` | `2.5` |
| `-5+3` | `5 ~ 3 +` | `-2` |
| `-(3+2)` | `3 2 + ~` | `-5` |
| `3+4*2` | `3 4 2 * +` | `11` |

---

## 🎨 UI Color Theme

| Role | Color |
|------|-------|
| Background | `#0b1622` |
| Panel | `#132238` |
| Accent (Cyan) | `#00c8e8` |
| Accent (Gold) | `#f0a830` |
| Answer (Green) | `#50e898` |
| Error (Red) | `#f06060` |

---

## 📂 Project Structure
src/
└── main/
└── java/
└── com/example/demo4/
└── HelloApplication.java   ← main class (UI + algorithms)
---

## 🔧 Known Limitations

- Does not support mathematical functions like `sin()`, `cos()`, `sqrt()`
- No expression history panel
- Single-file architecture (educational focus)

---

## 🛣️ Future Improvements

- [ ] Support for `sin()`, `cos()`, `sqrt()` functions
- [ ] Expression history log
- [ ] Real-time parenthesis matching highlight
- [ ] Variable support (e.g., `x = 5`)
- [ ] Graph plotting mode

---

## 📚 Algorithms Used

- **Shunting-Yard Algorithm** — E. W. Dijkstra (1961)
- **Stack-based Postfix Evaluation** — classical computer science algorithm

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
