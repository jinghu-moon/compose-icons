package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalSpaceBetween: ImageVector
    get() {
        if (_alignVerticalSpaceBetween != null) return _alignVerticalSpaceBetween!!
        _alignVerticalSpaceBetween = lucideOutlineIcon(
            name = "AlignVerticalSpaceBetween",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-2c0-1.105 .895-2 2-2Z")
            addPathData("M9 3h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C7.895 9 7 8.105 7 7v-2C7 3.895 7.895 3 9 3Z")
            addPathData("M2 21h20")
            addPathData("M2 3h20")
        }
        return _alignVerticalSpaceBetween!!
    }

private var _alignVerticalSpaceBetween: ImageVector? = null
