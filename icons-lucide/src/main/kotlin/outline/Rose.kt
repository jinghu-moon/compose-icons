package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rose: ImageVector
    get() {
        if (_rose != null) return _rose!!
        _rose = lucideOutlineIcon(
            name = "Rose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 10.000 L 16.000 10.000 C 13.791 10.000 12.000 8.209 12.000 6.000 C 12.000 3.791 13.791 2.000 16.000 2.000 C 18.209 2.000 20.000 3.791 20.000 6.000 L 20.000 6.534"),
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
        pathData = parseSvgPathData("M 17.000 6.000 L 18.000 6.000 C 19.931 5.999 21.587 7.379 21.936 9.278 C 22.284 11.178 21.226 13.055 19.420 13.740 L 17.130 14.610 C 14.250 15.706 11.007 14.442 9.629 11.685 C 8.251 8.929 9.186 5.576 11.791 3.930 L 13.860 2.620"),
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
        pathData = parseSvgPathData("M 4.500 17.000 C 7.300 16.500 8.900 17.000 10.000 17.800 C 11.100 18.600 11.800 20.000 12.300 21.500 C 10.300 21.900 8.800 21.900 7.500 21.200 C 6.300 20.600 5.200 19.300 4.500 17.000"),
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
        pathData = parseSvgPathData("M 9.770 12.000 C 4.000 15.000 2.000 22.000 2.000 22.000"),
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
        pathData = parseSvgPathData("M 19.000 8.000 C 19.000 9.105 18.105 10.000 17.000 10.000 C 15.895 10.000 15.000 9.105 15.000 8.000 C 15.000 6.895 15.895 6.000 17.000 6.000 C 18.105 6.000 19.000 6.895 19.000 8.000 Z"),
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
        return _rose!!
    }

private var _rose: ImageVector? = null
