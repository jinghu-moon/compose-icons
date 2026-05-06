package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) return _cloudDownload!!
        _cloudDownload = lucideOutlineIcon(
            name = "CloudDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v8L8 17")
            addPathData("M12 21l4-4")
            addPathData("M4.393 15.269C2.153 13.31 1.397 10.148 2.508 7.387 3.619 4.627 6.354 2.87 9.326 3.008c2.973 .138 5.533 2.14 6.384 4.992h1.79c1.997-0 3.755 1.315 4.318 3.23 .563 1.915-.203 3.973-1.882 5.054")
        }
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
