package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cherry: ImageVector
    get() {
        if (_cherry != null) return _cherry!!
        _cherry = lucideOutlineIcon(
            name = "Cherry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C12 14.24 9.5 12 7 14 4.5 12 2 14.24 2 17Z")
            addPathData("M12 17c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5 0-2.76-2.5-5-5-3-2.5-2-5 .24-5 3Z")
            addPathData("M7 14C10.22 11.09 11.29 5.25 12 2c1.66 2.38 4.94 9 5 12")
            addPathData("M22 9C17.71 9 14.86 6.67 12 2c5.71 0 10 4.67 10 7Z")
        }
        return _cherry!!
    }

private var _cherry: ImageVector? = null
