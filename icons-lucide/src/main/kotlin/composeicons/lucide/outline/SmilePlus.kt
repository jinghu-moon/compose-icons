package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SmilePlus: ImageVector
    get() {
        if (_smilePlus != null) return _smilePlus!!
        _smilePlus = lucideOutlineIcon(
            name = "SmilePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 11v1c-.021 4.131-2.58 7.825-6.441 9.295C11.699 22.765 7.331 21.71 4.567 18.64 1.803 15.569 1.213 11.114 3.08 7.429 4.948 3.744 8.889 1.587 13 2")
            addPathData("M8 14c0 0 1.5 2 4 2 2.5 0 4-2 4-2")
            addPathData("M9 9h.01")
            addPathData("M15 9h.01")
            addPathData("M16 5h6")
            addPathData("M19 2v6")
        }
        return _smilePlus!!
    }

private var _smilePlus: ImageVector? = null
