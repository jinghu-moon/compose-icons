package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldMinus: ImageVector
    get() {
        if (_shieldMinus != null) return _shieldMinus!!
        _shieldMinus = lucideOutlineIcon(
            name = "ShieldMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13c0 5-3.5 7.5-7.66 8.95-.218 .074-.454 .07-.67-.01C7.5 20.5 4 18 4 13v-7C4 5.448 4.448 5 5 5 7 5 9.5 3.8 11.24 2.28c.438-.374 1.082-.374 1.52 0C14.51 3.81 17 5 19 5c.552 0 1 .448 1 1Z")
            addPathData("M9 12h6")
        }
        return _shieldMinus!!
    }

private var _shieldMinus: ImageVector? = null
