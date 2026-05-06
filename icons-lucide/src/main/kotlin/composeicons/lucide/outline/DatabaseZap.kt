package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DatabaseZap: ImageVector
    get() {
        if (_databaseZap != null) return _databaseZap!!
        _databaseZap = lucideOutlineIcon(
            name = "DatabaseZap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5c0 1.657-4.029 3-9 3C7.029 8 3 6.657 3 5 3 3.343 7.029 2 12 2c4.971 0 9 1.343 9 3Z")
            addPathData("M3 5v14c-.011 .976 1.402 1.893 3.79 2.458 2.387 .565 5.45 .708 8.21 .382")
            addPathData("M21 5v3")
            addPathData("M21 12l-3 5h4l-3 5")
            addPathData("M3 12c.003 .948 1.35 1.84 3.633 2.405 2.283 .565 5.233 .738 7.957 .465")
        }
        return _databaseZap!!
    }

private var _databaseZap: ImageVector? = null
