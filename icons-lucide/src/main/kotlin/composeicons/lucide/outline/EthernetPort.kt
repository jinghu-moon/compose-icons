package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EthernetPort: ImageVector
    get() {
        if (_ethernetPort != null) return _ethernetPort!!
        _ethernetPort = lucideOutlineIcon(
            name = "EthernetPort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 20l3-3h2c1.105 0 2-.895 2-2v-9C22 4.895 21.105 4 20 4h-16C2.895 4 2 4.895 2 6v9c0 1.105 .895 2 2 2h2l3 3Z")
            addPathData("M6 8v1")
            addPathData("M10 8v1")
            addPathData("M14 8v1")
            addPathData("M18 8v1")
        }
        return _ethernetPort!!
    }

private var _ethernetPort: ImageVector? = null
