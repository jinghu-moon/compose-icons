package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = lucideOutlineIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 21.000 L 17.000 21.000"),
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
        pathData = parseSvgPathData("M 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 L 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 Z"),
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
        pathData = parseSvgPathData("M 11.380 12.000 C 10.124 12.012 9.071 11.053 8.966 9.801 C 8.861 8.549 9.739 7.428 10.980 7.230 C 10.785 6.367 11.081 5.466 11.750 4.886 C 12.420 4.307 13.353 4.143 14.180 4.460 C 14.539 3.895 15.118 3.505 15.777 3.385 C 16.436 3.266 17.115 3.427 17.650 3.830 C 18.605 3.079 19.971 3.161 20.830 4.020 C 21.689 4.879 21.771 6.245 21.020 7.200 C 21.478 7.808 21.620 8.598 21.403 9.327 C 21.186 10.057 20.636 10.641 19.920 10.900 C 20.011 11.260 20.021 11.636 19.950 12.000"),
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
        pathData = parseSvgPathData("M 13.000 12.000 L 17.000 8.000"),
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
        pathData = parseSvgPathData("M 10.900 7.250 C 9.777 6.053 8.037 5.666 6.513 6.273 C 4.989 6.881 3.992 8.359 4.000 10.000 C 4.000 10.730 4.200 11.410 4.540 12.000"),
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
        return _salad!!
    }

private var _salad: ImageVector? = null
