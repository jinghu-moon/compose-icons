package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VenusAndMars: ImageVector
    get() {
        if (_venusAndMars != null) return _venusAndMars!!
        _venusAndMars = lucideOutlineIcon(
            name = "VenusAndMars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20h4")
            addPathData("M12 16v6")
            addPathData("M17 2h4v4")
            addPathData("M21 2 15.54 7.46")
            addPathData("M17 11c0 2.761-2.239 5-5 5C9.239 16 7 13.761 7 11 7 8.239 9.239 6 12 6c2.761 0 5 2.239 5 5Z")
        }
        return _venusAndMars!!
    }

private var _venusAndMars: ImageVector? = null
