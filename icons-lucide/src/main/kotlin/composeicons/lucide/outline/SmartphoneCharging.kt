package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SmartphoneCharging: ImageVector
    get() {
        if (_smartphoneCharging != null) return _smartphoneCharging!!
        _smartphoneCharging = lucideOutlineIcon(
            name = "SmartphoneCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 2h10c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-16C5 2.895 5.895 2 7 2Z")
            addPathData("M12.667 8 10 12h4l-2.667 4")
        }
        return _smartphoneCharging!!
    }

private var _smartphoneCharging: ImageVector? = null
