package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Package2: ImageVector
    get() {
        if (_package2 != null) return _package2!!
        _package2 = lucideOutlineIcon(
            name = "Package2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v6")
            addPathData("M16.76 3c.76-.005 1.458 .421 1.8 1.1l2.23 4.479c.138 .277 .21 .582 .21 .891v9.53c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-9.528c0-.31 .072-.616 .211-.894L5.45 4.1C5.791 3.424 6.483 2.999 7.24 3Z")
            addPathData("M3.054 9.013h17.893")
        }
        return _package2!!
    }

private var _package2: ImageVector? = null
