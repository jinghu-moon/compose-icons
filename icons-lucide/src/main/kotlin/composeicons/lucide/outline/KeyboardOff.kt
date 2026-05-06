package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.KeyboardOff: ImageVector
    get() {
        if (_keyboardOff != null) return _keyboardOff!!
        _keyboardOff = lucideOutlineIcon(
            name = "KeyboardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4c1.105 0 2 .895 2 2")
            addPathData("M22 6v10.41")
            addPathData("M7 16h9")
            addPathData("M9.69 4h10.31")
            addPathData("M14 8h.01")
            addPathData("M18 8h.01")
            addPathData("M2 2 22 22")
            addPathData("M20 20h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4")
            addPathData("M6 8h.01")
            addPathData("M8 12h.01")
        }
        return _keyboardOff!!
    }

private var _keyboardOff: ImageVector? = null
