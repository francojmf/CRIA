var x = 0;
function formato(){
    paragrafo_01 = document.getElementById("tipo_01");
    if (x===0){
        paragrafo_01.style.color ="white";
        x=1;
    }
    else{
        paragrafo_01.style.color="yellow";
        x=0;
    }
        
}

