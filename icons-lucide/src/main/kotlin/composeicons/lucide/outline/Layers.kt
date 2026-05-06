package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Layers: ImageVector
    get() {
        if (_layers != null) return _layers!!
        _layers = lucideOutlineIcon(
            name = "Layers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.83 2.18c-.527-.24-1.133-.24-1.66 0L2.6 6.08c-.363 .16-.597 .519-.597 .915 0 .396 .234 .755 .597 .915l8.58 3.91c.527 .24 1.133 .24 1.66 0L21.42 7.92c.363-.16 .597-.519 .597-.915 0-.396-.234-.755-.597-.915Z")
            addPathData("M2 12c-.001 .391 .226 .746 .58 .91l8.6 3.91c.524 .237 1.126 .237 1.65 0l8.58-3.9c.362-.163 .593-.523 .59-.92")
            addPathData("M2 17c-.001 .391 .226 .746 .58 .91l8.6 3.91c.524 .237 1.126 .237 1.65 0l8.58-3.9c.362-.163 .593-.523 .59-.92")
        }
        return _layers!!
    }

private var _layers: ImageVector? = null
