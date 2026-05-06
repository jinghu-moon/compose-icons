package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignVerticalDistributeEnd: ImageVector
    get() {
        if (_alignVerticalDistributeEnd != null) return _alignVerticalDistributeEnd!!
        _alignVerticalDistributeEnd = lucideOutlineIcon(
            name = "AlignVerticalDistributeEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 14h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-10C5.895 20 5 19.105 5 18v-2c0-1.105 .895-2 2-2Z")
            addPathData("M9 4h6c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-6C7.895 10 7 9.105 7 8v-2C7 4.895 7.895 4 9 4Z")
            addPathData("M2 20h20")
            addPathData("M2 10h20")
        }
        return _alignVerticalDistributeEnd!!
    }

private var _alignVerticalDistributeEnd: ImageVector? = null
