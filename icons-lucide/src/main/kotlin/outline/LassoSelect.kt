package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LassoSelect: ImageVector
    get() {
        if (_lassoSelect != null) return _lassoSelect!!
        _lassoSelect = lucideOutlineIcon(
            name = "LassoSelect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 22.000 C 5.741 21.056 5.000 19.574 5.000 18.000"),
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
        pathData = parseSvgPathData("M 7.000 16.930 C 7.960 17.360 8.960 17.670 9.990 17.840"),
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
        pathData = parseSvgPathData("M 3.340 14.000 C 2.481 12.842 2.011 11.442 2.000 10.000 C 2.000 5.580 6.480 2.000 12.000 2.000 C 17.520 2.000 22.000 5.580 22.000 10.000 C 21.985 10.679 21.874 11.352 21.670 12.000"),
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
        pathData = parseSvgPathData("M 5.000 18.000 C 6.105 18.000 7.000 17.105 7.000 16.000 C 7.000 14.895 6.105 14.000 5.000 14.000 C 3.895 14.000 3.000 14.895 3.000 16.000 C 3.000 17.105 3.895 18.000 5.000 18.000 Z"),
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
        pathData = parseSvgPathData("M 14.330 22.000 L 14.240 22.000 C 14.101 21.954 14.005 21.826 14.000 21.680 L 14.000 11.680 C 14.000 11.496 14.146 11.345 14.330 11.340 C 14.410 11.340 14.480 11.370 14.540 11.420 L 21.880 17.420 C 21.992 17.507 22.035 17.657 21.988 17.791 C 21.940 17.925 21.812 18.013 21.670 18.010 L 17.180 18.010 L 14.610 21.860 C 14.544 21.948 14.440 22.000 14.330 22.000 Z"),
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
        return _lassoSelect!!
    }

private var _lassoSelect: ImageVector? = null
