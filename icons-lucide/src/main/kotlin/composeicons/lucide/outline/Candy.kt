package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Candy: ImageVector
    get() {
        if (_candy != null) return _candy!!
        _candy = lucideOutlineIcon(
            name = "Candy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 7v10.9")
            addPathData("M14 6.1v10.9")
            addPathData("M16 7v-4c0-.404 .244-.769 .617-.924 .374-.155 .804-.069 1.09 .217 .561 .569 1.361 .836 2.152 .717 .311-.044 .626 .06 .848 .283 .222 .222 .327 .537 .283 .848-.119 .791 .148 1.591 .717 2.152 .286 .286 .371 .716 .217 1.09C21.769 7.756 21.404 8 21 8h-4")
            addPathData("M16.536 7.465C15.598 6.527 14.326 6 13 6c-1.326 0-2.598 .527-3.536 1.465l-2 2c-1.952 1.952-1.952 5.118 0 7.07 .938 .938 2.21 1.465 3.536 1.465 1.326 0 2.598-.527 3.536-1.465l2-2c1.952-1.952 1.952-5.118 0-7.07")
            addPathData("M8 17v4c-0 .404-.244 .769-.617 .924-.374 .155-.804 .069-1.09-.217-.561-.569-1.361-.836-2.152-.717-.311 .044-.626-.06-.848-.283-.222-.222-.327-.537-.283-.848 .119-.791-.148-1.591-.717-2.152-.286-.286-.371-.716-.217-1.09C2.231 16.244 2.596 16 3 16h4")
        }
        return _candy!!
    }

private var _candy: ImageVector? = null
