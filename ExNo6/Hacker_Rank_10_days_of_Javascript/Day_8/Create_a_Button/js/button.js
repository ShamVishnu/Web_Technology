var button = document.createElement("button");
var body = document.getElementsByTagName("body")[0];
body.appendChild(button);
document.getElementsByTagName("button")[0].setAttribute("id", "btn");
count = 0;
button.innerHTML = count;
button.addEventListener("click", function() {
    count = count + 1;
    button.innerHTML = count;
});