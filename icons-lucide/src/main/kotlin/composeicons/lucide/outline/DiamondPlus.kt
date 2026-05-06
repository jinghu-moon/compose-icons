package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DiamondPlus: ImageVector
    get() {
        if (_diamondPlus != null) return _diamondPlus!!
        _diamondPlus = lucideOutlineIcon(
            name = "DiamondPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8v8")
            addPathData("M2.7 10.3c-.452 .452-.707 1.065-.707 1.705 0 .64 .254 1.253 .707 1.705l7.59 7.59c.452 .452 1.065 .707 1.705 .707 .64 0 1.253-.254 1.705-.707l7.59-7.59c.452-.452 .707-1.065 .707-1.705 0-.64-.254-1.253-.707-1.705L13.7 2.71c-.452-.452-1.065-.707-1.705-.707-.64 0-1.253 .254-1.705 .707Z")
            addPathData("M8 12h8")
        }
        return _diamondPlus!!
    }

private var _diamondPlus: ImageVector? = null
