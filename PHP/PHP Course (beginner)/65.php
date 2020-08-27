<?php

namespace HexletBasics\Loops\LoopAndConditions;

// BEGIN
function shouter($str)
{
    $length = strlen($str);
    $result = '';
    $counter = 0;

    if ($length > 5) {
        while ($counter !== 100) {
            $result = $result . $str;
            $counter += 1;
        }
    } elseif ($length > 0 && $length < 5) {
        return $str;
    } elseif ($length == 5) {
        while ($counter !== 10) {
            $result = $result . $str;
            $counter += 1;
        }
    }

    return $result;
}
// END