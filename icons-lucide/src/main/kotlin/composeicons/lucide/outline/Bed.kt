package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = lucideOutlineIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 4v16")
            addPathData("M2 8h18c1.105 0 2 .895 2 2v10")
            addPathData("M2 17h20")
            addPathData("M6 8v9")
        }
        return _bed!!
    }

private var _bed: ImageVector? = null
