package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalJustifyEnd: ImageVector
    get() {
        if (_alignHorizontalJustifyEnd != null) return _alignHorizontalJustifyEnd!!
        _alignHorizontalJustifyEnd = lucideOutlineIcon(
            name = "AlignHorizontalJustifyEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5h2c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-2C2.895 19 2 18.105 2 17v-10C2 5.895 2.895 5 4 5Z")
            addPathData("M14 7h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2Z")
            addPathData("M22 2v20")
        }
        return _alignHorizontalJustifyEnd!!
    }

private var _alignHorizontalJustifyEnd: ImageVector? = null
