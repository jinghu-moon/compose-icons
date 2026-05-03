package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Circles: ImageVector
    get() {
        if (_circles != null) return _circles!!
        _circles = tablerFilledIcon(
            name = "Circles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.500 12.000 C 9.233 12.000 11.460 14.194 11.500 16.927 C 11.539 19.660 9.377 21.919 6.645 21.998 C 3.913 22.077 1.624 19.948 1.505 17.217 L 1.500 17.000 L 1.505 16.783 C 1.621 14.109 3.823 12.000 6.500 12.000 Z"),
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
                pathData = parseSvgPathData("M 17.500 12.000 C 20.233 12.000 22.460 14.194 22.500 16.927 C 22.539 19.660 20.377 21.919 17.645 21.998 C 14.913 22.077 12.624 19.948 12.505 17.217 L 12.500 17.000 L 12.505 16.783 C 12.621 14.109 14.823 12.000 17.500 12.000 Z"),
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
                pathData = parseSvgPathData("M 12.000 2.000 C 14.733 2.000 16.960 4.194 17.000 6.927 C 17.039 9.660 14.877 11.919 12.145 11.998 C 9.413 12.077 7.124 9.948 7.005 7.217 L 7.000 7.000 L 7.005 6.783 C 7.121 4.109 9.323 2.000 12.000 2.000 Z"),
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
        return _circles!!
    }

private var _circles: ImageVector? = null
