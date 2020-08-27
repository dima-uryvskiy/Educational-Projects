<?php

namespace HexletBasics\Loops\SyntaxSugar;

// BEGIN
function countChars($str, $symbol)
{
    $i = 0;
    $count = 0;

    while ($i < strlen($str)) {
        if ($str[$i] == $symbol) {
            $count += 1;
        }

        $i += 1;
    }

    return $count;
}
// END
