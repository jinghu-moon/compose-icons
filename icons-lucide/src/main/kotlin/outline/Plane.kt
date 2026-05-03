package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = lucideOutlineIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.800 19.200 L 16.000 11.000 L 19.500 7.500 C 21.000 6.000 21.500 4.000 21.000 3.000 C 20.000 2.500 18.000 3.000 16.500 4.500 L 13.000 8.000 L 4.800 6.200 C 4.300 6.100 3.900 6.300 3.700 6.700 L 3.400 7.200 C 3.200 7.700 3.300 8.200 3.700 8.500 L 9.000 12.000 L 7.000 15.000 L 4.000 15.000 L 3.000 16.000 L 6.000 18.000 L 8.000 21.000 L 9.000 20.000 L 9.000 17.000 L 12.000 15.000 L 15.500 20.300 C 15.800 20.700 16.300 20.800 16.800 20.600 L 17.300 20.400 C 17.700 20.100 17.900 19.700 17.800 19.200 Z"),
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
        return _plane!!
    }

private var _plane: ImageVector? = null
