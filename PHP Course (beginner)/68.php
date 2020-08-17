<?php

namespace HexletBasics\Loops\ReturnInLoop;

// BEGIN
function doesContain($str, $symbol)
{
    $i = 0;

    while ($i < strlen($str)) {
        if ($str[$i] == $symbol) {
            return true;
        }

        $i +=1;
    }

    return false;
}
// END
