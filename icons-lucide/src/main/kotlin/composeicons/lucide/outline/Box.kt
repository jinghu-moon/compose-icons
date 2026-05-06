package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Box: ImageVector
    get() {
        if (_box != null) return _box!!
        _box = lucideOutlineIcon(
            name = "Box",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8C20.999 7.286 20.618 6.627 20 6.27l-7-4c-.619-.357-1.381-.357-2 0l-7 4C3.382 6.627 3.001 7.286 3 8v8c.001 .714 .382 1.373 1 1.73l7 4c.619 .357 1.381 .357 2 0l7-4c.618-.357 .999-1.016 1-1.73Z")
            addPathData("M3.3 7 12 12 20.7 7")
            addPathData("M12 22v-10")
        }
        return _box!!
    }

private var _box: ImageVector? = null
