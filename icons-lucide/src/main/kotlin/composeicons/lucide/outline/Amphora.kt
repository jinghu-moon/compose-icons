package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Amphora: ImageVector
    get() {
        if (_amphora != null) return _amphora!!
        _amphora = lucideOutlineIcon(
            name = "Amphora",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v5.632c0 .424-.272 .795-.653 .982C7.296 9.625 5.998 11.714 6 14c.006 4 3 7 5 8")
            addPathData("M10 5h-2C6.895 5 6 5.895 6 7c0 1.105 .895 2 2 2h.68")
            addPathData("M14 2v5.632c0 .424 .272 .795 .652 .982C16.703 9.625 18.001 11.713 18 14c0 4-3 7-5 8")
            addPathData("M14 5h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-.68")
            addPathData("M18 22h-12")
            addPathData("M9 2h6")
        }
        return _amphora!!
    }

private var _amphora: ImageVector? = null
