var ipValor1 = document.querySelector("#ipValor1");
var ipValor2 = document.querySelector("#ipValor2");
var ipValor3 = document.querySelector("#ipValor3");
var btCalcular = document.querySelector("#btCalcular")
var h3Resultado = document.querySelector("#h3Resultado");

function calcularMedias(){
var valor1 = Number(ipValor1.value);
var valor2 = Number(ipValor2.value);
var valor3 = Number(ipValor3.value);

var mediaAritmetica = (valor1 + valor2 + valor3) / 3;

var somaPesos = 3 + 2 +5;
var somaValorPesos = (valor1 * 3) + (valor2 * 2) + (valor3 * 5);
var mediaPonderada = somaValorPesos / somaPesos;

var somaMedias = mediaAritmetica + mediaPonderada
var mediaDasMedias = somaMedias / 2;

h3Resultado.innerHTML = "Media Aritmetica: "+mediaAritmetica+"<br>"+
                        "Media Ponderada: "+mediaPonderada+"<br>"+
                        "Soma das Medias: "+somaMedias+"<br>"+
                        "Media das Medias: "+mediaDasMedias;
}

btCalcular.onclick = function(){
    calcularMedias();
}