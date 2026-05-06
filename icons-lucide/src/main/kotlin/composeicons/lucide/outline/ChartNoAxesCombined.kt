package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartNoAxesCombined: ImageVector
    get() {
        if (_chartNoAxesCombined != null) return _chartNoAxesCombined!!
        _chartNoAxesCombined = lucideOutlineIcon(
            name = "ChartNoAxesCombined",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16v5")
            addPathData("M16 14v7")
            addPathData("M20 10v11")
            addPathData("M22 3l-8.646 8.646c-.094 .094-.221 .147-.354 .147-.133 0-.26-.053-.354-.147L9.354 8.354c-.195-.195-.512-.195-.707 0L2 15")
            addPathData("M4 18v3")
            addPathData("M8 14v7")
        }
        return _chartNoAxesCombined!!
    }

private var _chartNoAxesCombined: ImageVector? = null
