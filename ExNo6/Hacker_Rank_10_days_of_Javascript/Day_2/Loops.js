/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    let length = s.length;
    let i;
    for (i = 0; i < length; i++) {
        if ((s[i] == 'a') || (s[i] == 'e') || (s[i] == 'i') || (s[i] == 'o') || (s[i] == 'u')) {
            console.log(s[i]);
        }
    }
    for (i = 0; i < length; i++) {
        if (!((s[i] == 'a') || (s[i] == 'e') || (s[i] == 'i') || (s[i] == 'o') || (s[i] == 'u'))) {
            console.log(s[i]);
        }
    }
}