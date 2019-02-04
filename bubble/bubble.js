
var bub = function () {

    function bubble(vars) {
        let size = vars.length;
        for (var i = 0; i < size - 1; i++) {
            for (var j = 0; j < size - 1 - i; j++) {
                if (vars[j] > vars[j + 1]) {
                    var temp = vars[j];
                    vars[j] = vars[j + 1];
                    vars[j + 1] = temp;
                }

            }
        }
        return vars;
    }

    function dom() {
        $('#change-bubble').off('click').on('click',function(){
           var  list=$('#bubble').val();           
           $('#bubble').val(bubble(list.split(',')))
        })
    }

    return {
        init: function () {
            dom();
        }
    }
}()