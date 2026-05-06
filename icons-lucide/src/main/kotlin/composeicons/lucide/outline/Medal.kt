package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = lucideOutlineIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.21 15 2.66 7.14C2.259 6.447 2.31 5.581 2.79 4.94L4.4 2.8C4.778 2.296 5.37 2 6 2h12c.63 0 1.222 .296 1.6 .8l1.6 2.14c.483 .639 .538 1.505 .14 2.2L16.79 15")
            addPathData("M11 12 5.12 2.2")
            addPathData("M13 12 18.88 2.2")
            addPathData("M8 7h8")
            addPathData("M17 17c0 2.761-2.239 5-5 5C9.239 22 7 19.761 7 17c0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5Z")
            addPathData("M12 18v-2h-.5")
        }
        return _medal!!
    }

private var _medal: ImageVector? = null
