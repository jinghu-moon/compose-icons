package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Nfc: ImageVector
    get() {
        if (_nfc != null) return _nfc!!
        _nfc = lucideOutlineIcon(
            name = "Nfc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8.32c1.3 2.281 1.3 5.079 0 7.36")
            addPathData("M9.46 6.21c2.032 3.593 2.032 7.987 0 11.58")
            addPathData("M12.91 4.1c2.803 4.893 2.807 10.904 .01 15.8")
            addPathData("M16.37 2c3.54 6.197 3.54 13.803 0 20")
        }
        return _nfc!!
    }

private var _nfc: ImageVector? = null
