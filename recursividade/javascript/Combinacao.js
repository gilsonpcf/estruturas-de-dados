function Comb(n, k) {
    if (k == 1)
        return n;

    if (k == n)
        return 1;

    if (1 < k && k < n)
        return Comb(n-1, k-1) + Comb(n-1, k);

    return 0;
}
	
function Comb2(n, k) {
    return Fat(n) / (Fat(k) * Fat(n-k));
}
	
function Fat(n) {
    var f = 1;

    for (var i = n; i > 0; i--)
        f = f * i;

    return f;
}
	
document.write("Versão recursiva: " + Comb(5, 3) + "<br>");
document.write("Versão não recursiva: " + Comb2(5, 3));
