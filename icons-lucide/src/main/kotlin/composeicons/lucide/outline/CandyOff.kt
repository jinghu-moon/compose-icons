package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CandyOff: ImageVector
    get() {
        if (_candyOff != null) return _candyOff!!
        _candyOff = lucideOutlineIcon(
            name = "CandyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10v7.9")
            addPathData("M11.802 6.145c1.7-.42 3.496 .08 4.734 1.319 1.238 1.238 1.739 3.034 1.319 4.734")
            addPathData("M14 6.1v2.243")
            addPathData("M15.5 15.571l-.964 .964c-1.953 1.953-5.118 1.953-7.071 0C5.513 14.583 5.513 11.417 7.465 9.465l.964-.965")
            addPathData("M16 7v-4c0-.404 .244-.769 .617-.924 .374-.155 .804-.069 1.09 .217 .561 .569 1.361 .836 2.152 .717 .311-.044 .626 .06 .848 .283 .222 .222 .327 .537 .283 .848-.119 .791 .148 1.591 .717 2.152 .286 .286 .371 .716 .217 1.09C21.769 7.756 21.404 8 21 8h-4")
            addPathData("M2 2 22 22")
            addPathData("M8 17v4c-0 .404-.244 .769-.617 .924-.374 .155-.804 .069-1.09-.217-.561-.569-1.361-.836-2.152-.717-.311 .044-.626-.06-.848-.283-.222-.222-.327-.537-.283-.848 .119-.791-.148-1.591-.717-2.152-.286-.286-.371-.716-.217-1.09C2.231 16.244 2.596 16 3 16h4")
        }
        return _candyOff!!
    }

private var _candyOff: ImageVector? = null
