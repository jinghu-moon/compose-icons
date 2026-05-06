package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = lucideOutlineIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5v14")
            addPathData("M8 5v14")
            addPathData("M12 5v14")
            addPathData("M17 5v14")
            addPathData("M21 5v14")
        }
        return _barcode!!
    }

private var _barcode: ImageVector? = null
