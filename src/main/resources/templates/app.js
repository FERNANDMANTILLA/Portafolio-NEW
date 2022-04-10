let intro =document.querySelector('.into');
let logo =document.querySelector('.logo-header');
let logospan = document.querySelectorAll('.logo');

window.addEventListener('DOMcontentLoaded', ()=>{

    setTimeout(()=>{
        logospan.forEach((span, idx)=>{
            setTimeout(()=>{
                span.classList.add('active');
                

            },(idx+1)*400)
        })
    })
})