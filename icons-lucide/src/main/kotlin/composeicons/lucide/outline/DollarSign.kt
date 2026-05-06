package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DollarSign: ImageVector
    get() {
        if (_dollarSign != null) return _dollarSign!!
        _dollarSign = lucideOutlineIcon(
            name = "DollarSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v20")
            addPathData("M17 5h-7.5C7.567 5 6 6.567 6 8.5 6 10.433 7.567 12 9.5 12h5C16.433 12 18 13.567 18 15.5 18 17.433 16.433 19 14.5 19h-8.5")
        }
        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
