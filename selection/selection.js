var select = function () {

    function selection(arr) {
        let size = arr.length;
        var minIndex, temp;
        for (var i = 0; i < size - 1; i++) {
            minIndex = i;
            for (var j = i + 1; j < size ; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    function dom() {
        $('#change-select').off('click').on('click', function () {
            var list = $('#select').val();
            $('#select').val(selection(list.split(',')))
        })
    }

    return {
        init: function () {
            dom();
        }
    }
}();