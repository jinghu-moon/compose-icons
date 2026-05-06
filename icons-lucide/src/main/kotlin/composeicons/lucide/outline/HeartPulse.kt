package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) return _heartPulse!!
        _heartPulse = lucideOutlineIcon(
            name = "HeartPulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9.5C2 7.222 3.404 5.18 5.532 4.364c2.127-.815 4.537-.235 6.059 1.46 .106 .113 .254 .177 .409 .177 .155 0 .303-.064 .409-.177C13.927 4.118 16.343 3.53 18.475 4.347c2.132 .817 3.536 2.869 3.525 5.153 0 2.29-1.5 4-3 5.5l-5.492 5.313c-.377 .433-.922 .683-1.496 .687-.574 .004-1.122-.24-1.504-.668L5 15C3.5 13.5 2 11.8 2 9.5")
            addPathData("M3.22 13h6.28L10 12l2 4.5 2-7L15.5 13h5.27")
        }
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
