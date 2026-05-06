package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = lucideOutlineIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.83 2.38c.699-.504 1.641-.504 2.34 0l8 5.74c.708 .51 1.004 1.421 .73 2.25l-3.04 9.26c-.272 .819-1.038 1.371-1.9 1.37h-9.92c-.862 .001-1.628-.551-1.9-1.37L2.1 10.37C1.826 9.541 2.122 8.63 2.83 8.12Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
