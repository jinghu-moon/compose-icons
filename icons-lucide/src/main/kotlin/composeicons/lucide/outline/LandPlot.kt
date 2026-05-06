package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LandPlot: ImageVector
    get() {
        if (_landPlot != null) return _landPlot!!
        _landPlot = lucideOutlineIcon(
            name = "LandPlot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8 18 5 12 2v10")
            addPathData("M8 11.99 2.5 15.13c-.313 .178-.507 .51-.507 .87 0 .36 .194 .692 .507 .87L11 21.73c.619 .357 1.381 .357 2 0l8.5-4.86c.313-.178 .507-.51 .507-.87 0-.36-.194-.692-.507-.87L16 12")
            addPathData("M6.49 12.85l11.02 6.3")
            addPathData("M17.51 12.85 6.5 19.15")
        }
        return _landPlot!!
    }

private var _landPlot: ImageVector? = null
