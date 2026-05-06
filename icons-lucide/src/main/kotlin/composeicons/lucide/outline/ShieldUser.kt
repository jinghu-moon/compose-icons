package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldUser: ImageVector
    get() {
        if (_shieldUser != null) return _shieldUser!!
        _shieldUser = lucideOutlineIcon(
            name = "ShieldUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13c0 5-3.5 7.5-7.66 8.95-.218 .074-.454 .07-.67-.01C7.5 20.5 4 18 4 13v-7C4 5.448 4.448 5 5 5 7 5 9.5 3.8 11.24 2.28c.438-.374 1.082-.374 1.52 0C14.51 3.81 17 5 19 5c.552 0 1 .448 1 1Z")
            addPathData("M6.376 18.91c.874-2.351 3.118-3.91 5.626-3.909 2.508 .001 4.751 1.561 5.623 3.912")
            addPathData("M16 11c0 2.209-1.791 4-4 4C9.791 15 8 13.209 8 11 8 8.791 9.791 7 12 7c2.209 0 4 1.791 4 4Z")
        }
        return _shieldUser!!
    }

private var _shieldUser: ImageVector? = null
