package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Accessibility: ImageVector
    get() {
        if (_accessibility != null) return _accessibility!!
        _accessibility = lucideOutlineIcon(
            name = "Accessibility",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4c0 .552-.448 1-1 1C15.448 5 15 4.552 15 4c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M18 19l1-7-6 1")
            addPathData("M5 8 8 5l5.5 3-2.36 3.5")
            addPathData("M4.24 14.5c-.576 1.886 .009 3.934 1.495 5.23 1.486 1.296 3.595 1.598 5.385 .77")
            addPathData("M13.76 17.5c.576-1.886-.009-3.934-1.495-5.23C10.779 10.974 8.67 10.672 6.88 11.5")
        }
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
