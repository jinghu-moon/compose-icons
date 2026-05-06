package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = lucideOutlineIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.5 7.5l2.3 2.3c.389 .381 1.011 .381 1.4 0L21.3 7.7c.381-.389 .381-1.011 0-1.4L19 4")
            addPathData("M21 2l-9.6 9.6")
            addPathData("M13 15.5C13 18.538 10.538 21 7.5 21 4.462 21 2 18.538 2 15.5 2 12.462 4.462 10 7.5 10 10.538 10 13 12.462 13 15.5Z")
        }
        return _key!!
    }

private var _key: ImageVector? = null
