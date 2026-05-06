package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AirVent: ImageVector
    get() {
        if (_airVent != null) return _airVent!!
        _airVent = lucideOutlineIcon(
            name = "AirVent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 17.5c.937 .703 1.261 1.963 .777 3.031-.483 1.068-1.643 1.656-2.79 1.416C14.84 21.706 14.014 20.702 14 19.53v-7.53")
            addPathData("M6 12h-2C2.895 12 2 11.105 2 10v-5C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2v5c0 1.105-.895 2-2 2h-2")
            addPathData("M6 8h12")
            addPathData("M6.6 15.572c-.648 .635-.787 1.628-.339 2.417 .449 .789 1.372 1.177 2.25 .945C9.389 18.702 10 17.908 10 17v-5")
        }
        return _airVent!!
    }

private var _airVent: ImageVector? = null
