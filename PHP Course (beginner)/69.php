<?php

namespace HexletBasics\Loops\ForLoop;

// BEGIN
function sumOfSeries($start, $end)
{
    $sum = 0;

    for ($start; $start <= $end; $start++) {
        $sum += $start;
    }

    return $sum;
}
// END
