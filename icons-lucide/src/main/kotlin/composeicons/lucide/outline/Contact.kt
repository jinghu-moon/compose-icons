package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Contact: ImageVector
    get() {
        if (_contact != null) return _contact!!
        _contact = lucideOutlineIcon(
            name = "Contact",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 2v2")
            addPathData("M7 22v-2c0-1.105 .895-2 2-2h6c1.105 0 2 .895 2 2v2")
            addPathData("M8 2v2")
            addPathData("M15 11c0 1.657-1.343 3-3 3C10.343 14 9 12.657 9 11 9 9.343 10.343 8 12 8c1.657 0 3 1.343 3 3Z")
            addPathData("M5 4h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-14C3 4.895 3.895 4 5 4Z")
        }
        return _contact!!
    }

private var _contact: ImageVector? = null
