package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IndianRupee: ImageVector
    get() {
        if (_indianRupee != null) return _indianRupee!!
        _indianRupee = lucideOutlineIcon(
            name = "IndianRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3h12")
            addPathData("M6 8h12")
            addPathData("M6 13l8.5 8")
            addPathData("M6 13h3")
            addPathData("M9 13C15.667 13 15.667 3 9 3")
        }
        return _indianRupee!!
    }

private var _indianRupee: ImageVector? = null
