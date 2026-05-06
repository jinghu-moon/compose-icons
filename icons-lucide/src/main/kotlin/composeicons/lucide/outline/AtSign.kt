package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AtSign: ImageVector
    get() {
        if (_atSign != null) return _atSign!!
        _atSign = lucideOutlineIcon(
            name = "AtSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
            addPathData("M16 8v5c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-1C22 7.362 18.811 3.333 14.298 2.268 9.784 1.202 5.13 3.38 3.056 7.528 .982 11.676 2.032 16.706 5.593 19.678 9.153 22.649 14.29 22.783 18 20")
        }
        return _atSign!!
    }

private var _atSign: ImageVector? = null
