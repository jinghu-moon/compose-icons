package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UtilityPole: ImageVector
    get() {
        if (_utilityPole != null) return _utilityPole!!
        _utilityPole = lucideOutlineIcon(
            name = "UtilityPole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v20")
            addPathData("M2 5h20")
            addPathData("M3 3v2")
            addPathData("M7 3v2")
            addPathData("M17 3v2")
            addPathData("M21 3v2")
            addPathData("M19 5l-7 7L5 5")
        }
        return _utilityPole!!
    }

private var _utilityPole: ImageVector? = null
