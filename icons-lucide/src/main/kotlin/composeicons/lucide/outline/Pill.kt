package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = lucideOutlineIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 20.5l10-10C21.772 9.254 22.276 7.421 21.821 5.7 21.366 3.978 20.022 2.634 18.3 2.179c-1.721-.455-3.554 .049-4.8 1.321l-10 10C2.228 14.746 1.724 16.579 2.179 18.3c.455 1.721 1.799 3.066 3.521 3.521 1.721 .455 3.554-.049 4.8-1.321Z")
            addPathData("M8.5 8.5l7 7")
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
