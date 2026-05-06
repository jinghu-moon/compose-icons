package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CopyX: ImageVector
    get() {
        if (_copyX != null) return _copyX!!
        _copyX = lucideOutlineIcon(
            name = "CopyX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12l6 6")
            addPathData("M12 18l6-6")
            addPathData("M10 8h10c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-10C8.895 22 8 21.105 8 20v-10C8 8.895 8.895 8 10 8Z")
            addPathData("M4 16C2.9 16 2 15.1 2 14v-10C2 2.9 2.9 2 4 2h10c1.1 0 2 .9 2 2")
        }
        return _copyX!!
    }

private var _copyX: ImageVector? = null
