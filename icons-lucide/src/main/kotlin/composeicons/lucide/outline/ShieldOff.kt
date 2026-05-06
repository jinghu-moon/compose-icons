package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldOff: ImageVector
    get() {
        if (_shieldOff != null) return _shieldOff!!
        _shieldOff = lucideOutlineIcon(
            name = "ShieldOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 2 22 22")
            addPathData("M5 5C4.448 5 4 5.448 4 6v7c0 5 3.5 7.5 7.67 8.94 .216 .08 .452 .084 .67 .01 2.35-.82 4.48-1.97 5.9-3.71")
            addPathData("M9.309 3.652c.686-.394 1.333-.853 1.931-1.372 .438-.374 1.082-.374 1.52 0C14.51 3.81 17 5 19 5c.552 0 1 .448 1 1v7c.001 .423-.026 .845-.08 1.264")
        }
        return _shieldOff!!
    }

private var _shieldOff: ImageVector? = null
