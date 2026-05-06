package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IdCard: ImageVector
    get() {
        if (_idCard != null) return _idCard!!
        _idCard = lucideOutlineIcon(
            name = "IdCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 10h2")
            addPathData("M16 14h2")
            addPathData("M6.17 15C6.592 13.799 7.727 12.996 9 12.996c1.273 0 2.408 .804 2.83 2.004")
            addPathData("M11 11c0 1.105-.895 2-2 2C7.895 13 7 12.105 7 11 7 9.895 7.895 9 9 9c1.105 0 2 .895 2 2Z")
            addPathData("M4 5h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-10C2 5.895 2.895 5 4 5Z")
        }
        return _idCard!!
    }

private var _idCard: ImageVector? = null
