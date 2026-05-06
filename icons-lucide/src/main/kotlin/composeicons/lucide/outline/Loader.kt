package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Loader: ImageVector
    get() {
        if (_loader != null) return _loader!!
        _loader = lucideOutlineIcon(
            name = "Loader",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v4")
            addPathData("M16.2 7.8 19.1 4.9")
            addPathData("M18 12h4")
            addPathData("M16.2 16.2l2.9 2.9")
            addPathData("M12 18v4")
            addPathData("M4.9 19.1 7.8 16.2")
            addPathData("M2 12h4")
            addPathData("M4.9 4.9 7.8 7.8")
        }
        return _loader!!
    }

private var _loader: ImageVector? = null
