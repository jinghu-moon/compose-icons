package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalSpaceAround: ImageVector
    get() {
        if (_alignHorizontalSpaceAround != null) return _alignHorizontalSpaceAround!!
        _alignHorizontalSpaceAround = lucideOutlineIcon(
            name = "AlignHorizontalSpaceAround",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2C9.895 17 9 16.105 9 15v-6C9 7.895 9.895 7 11 7Z")
            addPathData("M4 22v-20")
            addPathData("M20 22v-20")
        }
        return _alignHorizontalSpaceAround!!
    }

private var _alignHorizontalSpaceAround: ImageVector? = null
