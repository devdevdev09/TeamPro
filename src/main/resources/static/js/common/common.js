const common = {
    log : function(msg){
        console.log("*******************");
        console.log(msg);
        console.log("*******************");
    },
    timeLog : function(msg){
        const time = new Date();
        common.log(time + " : " + msg);
    }
}