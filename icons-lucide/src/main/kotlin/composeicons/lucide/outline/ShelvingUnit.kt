package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShelvingUnit: ImageVector
    get() {
        if (_shelvingUnit != null) return _shelvingUnit!!
        _shelvingUnit = lucideOutlineIcon(
            name = "ShelvingUnit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-3C12 8.448 11.552 8 11 8h-2C8.448 8 8 8.448 8 9v3")
            addPathData("M16 20v-3c0-.552-.448-1-1-1h-2c-.552 0-1 .448-1 1v3")
            addPathData("M20 22v-20")
            addPathData("M4 12h16")
            addPathData("M4 20h16")
            addPathData("M4 2v20")
            addPathData("M4 4h16")
        }
        return _shelvingUnit!!
    }

private var _shelvingUnit: ImageVector? = null
