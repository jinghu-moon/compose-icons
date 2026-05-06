package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PowerOff: ImageVector
    get() {
        if (_powerOff != null) return _powerOff!!
        _powerOff = lucideOutlineIcon(
            name = "PowerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.36 6.64c2.186 2.187 3.096 5.344 2.41 8.36")
            addPathData("M6.16 6.16C3.555 8.348 2.406 11.818 3.191 15.129c.785 3.31 3.37 5.895 6.68 6.68 3.31 .785 6.781-.364 8.969-2.969")
            addPathData("M12 2v4")
            addPathData("M2 2 22 22")
        }
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
