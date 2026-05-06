package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Unplug: ImageVector
    get() {
        if (_unplug != null) return _unplug!!
        _unplug = lucideOutlineIcon(
            name = "Unplug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5 22 2")
            addPathData("M2 22 5 19")
            addPathData("M6.3 20.3c.45 .452 1.062 .706 1.7 .706 .638 0 1.25-.254 1.7-.706L12 18 6 12 3.7 14.3c-.452 .45-.706 1.062-.706 1.7 0 .638 .254 1.25 .706 1.7Z")
            addPathData("M7.5 13.5 10 11")
            addPathData("M10.5 16.5 13 14")
            addPathData("M12 6l6 6L20.3 9.7c.452-.45 .706-1.062 .706-1.7 0-.638-.254-1.25-.706-1.7L17.7 3.7C17.25 3.248 16.638 2.994 16 2.994c-.638 0-1.25 .254-1.7 .706Z")
        }
        return _unplug!!
    }

private var _unplug: ImageVector? = null
