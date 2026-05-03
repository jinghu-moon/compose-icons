package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Layers2: ImageVector
    get() {
        if (_layers2 != null) return _layers2!!
        _layers2 = lucideOutlineIcon(
            name = "Layers2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 13.740 C 12.381 14.097 11.619 14.097 11.000 13.740 L 2.500 8.870 C 2.187 8.692 1.993 8.360 1.993 8.000 C 1.993 7.640 2.187 7.308 2.500 7.130 L 11.000 2.260 C 11.619 1.903 12.381 1.903 13.000 2.260 L 21.500 7.130 C 21.813 7.308 22.007 7.640 22.007 8.000 C 22.007 8.360 21.813 8.692 21.500 8.870 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 20.000 14.285 L 21.500 15.130 C 21.813 15.308 22.007 15.640 22.007 16.000 C 22.007 16.360 21.813 16.692 21.500 16.870 L 13.000 21.740 C 12.381 22.097 11.619 22.097 11.000 21.740 L 2.500 16.870 C 2.187 16.692 1.993 16.360 1.993 16.000 C 1.993 15.640 2.187 15.308 2.500 15.130 L 4.000 14.285"),
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
        return _layers2!!
    }

private var _layers2: ImageVector? = null
