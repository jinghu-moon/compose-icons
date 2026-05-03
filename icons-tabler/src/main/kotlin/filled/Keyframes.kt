package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyframes: ImageVector
    get() {
        if (_keyframes != null) return _keyframes!!
        _keyframes = tablerFilledIcon(
            name = "Keyframes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 4.000 C 7.224 4.004 6.490 4.355 6.000 4.957 L 1.645 10.197 C 0.789 11.243 0.786 12.746 1.638 13.795 L 6.006 19.051 C 6.505 19.651 7.230 20.000 8.000 20.000 C 8.776 19.996 9.510 19.645 10.000 19.043 L 14.355 13.803 C 15.211 12.757 15.214 11.254 14.362 10.205 L 9.994 4.949 C 9.504 4.351 8.773 4.003 8.000 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 16.382 4.214 C 16.778 3.903 17.343 3.935 17.702 4.288 L 17.786 4.382 L 22.362 10.205 C 23.170 11.198 23.210 12.601 22.492 13.624 L 22.372 13.782 L 17.786 19.618 C 17.460 20.033 16.867 20.123 16.433 19.824 C 15.998 19.524 15.871 18.939 16.142 18.486 L 16.214 18.382 L 20.810 12.532 C 21.036 12.252 21.060 11.860 20.870 11.554 L 20.800 11.454 L 16.214 5.618 C 15.873 5.184 15.948 4.555 16.382 4.214 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.382 4.214 C 12.778 3.903 13.343 3.935 13.702 4.288 L 13.786 4.382 L 18.362 10.205 C 19.170 11.198 19.210 12.601 18.492 13.624 L 18.372 13.782 L 13.786 19.618 C 13.460 20.033 12.867 20.123 12.433 19.824 C 11.998 19.524 11.871 18.939 12.142 18.486 L 12.214 18.382 L 16.810 12.532 C 17.036 12.252 17.060 11.860 16.870 11.554 L 16.800 11.454 L 12.214 5.618 C 11.873 5.184 11.948 4.555 12.382 4.214 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
