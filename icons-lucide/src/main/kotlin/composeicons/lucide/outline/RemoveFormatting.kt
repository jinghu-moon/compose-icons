package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RemoveFormatting: ImageVector
    get() {
        if (_removeFormatting != null) return _removeFormatting!!
        _removeFormatting = lucideOutlineIcon(
            name = "RemoveFormatting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7v-3h16v3")
            addPathData("M5 20h6")
            addPathData("M13 4 8 20")
            addPathData("M15 15l5 5")
            addPathData("M20 15l-5 5")
        }
        return _removeFormatting!!
    }

private var _removeFormatting: ImageVector? = null
