package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StepForward: ImageVector
    get() {
        if (_stepForward != null) return _stepForward!!
        _stepForward = lucideOutlineIcon(
            name = "StepForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.029 4.285C9.411 3.914 8.642 3.905 8.015 4.26 7.388 4.615 7 5.279 7 6v12c-0 .721 .388 1.385 1.015 1.74 .627 .355 1.397 .345 2.014-.025l9.997-5.998c.604-.361 .974-1.012 .974-1.715 .001-.703-.368-1.355-.971-1.717Z")
            addPathData("M3 4v16")
        }
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
