<?php

namespace HexletBasics\DeepIntoStrings\StartWith;

function startsWith($text, $substr)
{
    // BEGIN
    if (mb_strpos($text, $substr) == false) {
        return true;
    }

    return false;
    // END
}
