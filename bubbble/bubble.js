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
        alert(bubble([7, 2, 3, 5, 6, 8, 9, 11, 0]))
    }

    return {
        init: function () {
            dom();
        }
    }
}()