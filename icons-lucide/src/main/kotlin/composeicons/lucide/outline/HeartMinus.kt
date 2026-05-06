package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartMinus: ImageVector
    get() {
        if (_heartMinus != null) return _heartMinus!!
        _heartMinus = lucideOutlineIcon(
            name = "HeartMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.876 18.99l-1.368 1.323c-.377 .433-.922 .683-1.496 .687-.574 .004-1.122-.24-1.504-.668L5 15C3.5 13.5 2 11.8 2 9.5 2 7.222 3.404 5.18 5.532 4.364c2.127-.815 4.537-.235 6.059 1.46 .106 .113 .254 .177 .409 .177 .155 0 .303-.064 .409-.177C13.927 4.118 16.343 3.53 18.475 4.347c2.132 .817 3.536 2.869 3.525 5.153-0 .533-.083 1.064-.244 1.572")
            addPathData("M15 15h6")
        }
        return _heartMinus!!
    }

private var _heartMinus: ImageVector? = null
