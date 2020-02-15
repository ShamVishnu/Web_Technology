/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    var rectangle = {
        length: a,
        width: b,
        area: a * b,
        perimeter: 2 * (a + b)
    };
    return rectangle;
}