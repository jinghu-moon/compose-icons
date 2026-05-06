package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DiamondPercent: ImageVector
    get() {
        if (_diamondPercent != null) return _diamondPercent!!
        _diamondPercent = lucideOutlineIcon(
            name = "DiamondPercent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.7 10.3c-.452 .452-.707 1.065-.707 1.705 0 .64 .254 1.253 .707 1.705l7.59 7.59c.452 .452 1.065 .707 1.705 .707 .64 0 1.253-.254 1.705-.707l7.59-7.59c.452-.452 .707-1.065 .707-1.705 0-.64-.254-1.253-.707-1.705L13.7 2.71c-.452-.452-1.065-.707-1.705-.707-.64 0-1.253 .254-1.705 .707Z")
            addPathData("M9.2 9.2h.01")
            addPathData("M14.5 9.5l-5 5")
            addPathData("M14.7 14.8h.01")
        }
        return _diamondPercent!!
    }

private var _diamondPercent: ImageVector? = null
