function addTask(){

    let input = document.getElementById("taskInput");

    let taskText = input.value;

    if(taskText===""){
        alert("Enter task");
        return;
    }

    let div = document.createElement("div");

    div.className="task";

    div.innerHTML =
    "AI Agent Assigned Task: " + taskText;

    document.getElementById("taskList")
    .appendChild(div);

    input.value="";
}