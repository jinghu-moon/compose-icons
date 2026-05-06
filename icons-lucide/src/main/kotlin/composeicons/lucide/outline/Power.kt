package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = lucideOutlineIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v10")
            addPathData("M18.4 6.6c3.509 3.51 3.514 9.198 .012 12.714-3.502 3.516-9.19 3.534-12.714 .04C2.174 15.859 2.143 10.172 5.63 6.64")
        }
        return _power!!
    }

private var _power: ImageVector? = null
