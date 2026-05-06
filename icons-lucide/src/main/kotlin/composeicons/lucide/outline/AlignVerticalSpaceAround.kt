package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalSpaceAround: ImageVector
    get() {
        if (_alignVerticalSpaceAround != null) return _alignVerticalSpaceAround!!
        _alignVerticalSpaceAround = lucideOutlineIcon(
            name = "AlignVerticalSpaceAround",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C7.895 15 7 14.105 7 13v-2C7 9.895 7.895 9 9 9Z")
            addPathData("M22 20h-20")
            addPathData("M22 4h-20")
        }
        return _alignVerticalSpaceAround!!
    }

private var _alignVerticalSpaceAround: ImageVector? = null
