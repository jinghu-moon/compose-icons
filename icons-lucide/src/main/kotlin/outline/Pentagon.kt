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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.830 2.380 C 11.529 1.876 12.471 1.876 13.170 2.380 L 21.170 8.120 C 21.878 8.630 22.174 9.541 21.900 10.370 L 18.860 19.630 C 18.588 20.449 17.822 21.001 16.960 21.000 L 7.040 21.000 C 6.178 21.001 5.412 20.449 5.140 19.630 L 2.100 10.370 C 1.826 9.541 2.122 8.630 2.830 8.120 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
