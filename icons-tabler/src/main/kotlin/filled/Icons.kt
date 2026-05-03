package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Icons: ImageVector
    get() {
        if (_icons != null) return _icons!!
        _icons = tablerFilledIcon(
            name = "Icons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.250 2.603 C 6.014 1.585 8.242 1.878 9.682 3.318 C 11.122 4.758 11.415 6.986 10.397 8.750 C 9.379 10.514 7.303 11.374 5.335 10.847 C 3.368 10.320 2.000 8.537 2.000 6.500 L 2.006 6.271 C 2.084 4.747 2.928 3.366 4.250 2.603"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 5.632 13.504 C 5.810 13.193 6.141 13.001 6.500 13.001 C 6.859 13.001 7.190 13.193 7.368 13.504 L 11.368 20.504 C 11.545 20.813 11.543 21.194 11.365 21.502 C 11.186 21.810 10.856 22.000 10.500 22.000 L 2.500 22.000 C 2.144 22.000 1.814 21.810 1.635 21.502 C 1.457 21.194 1.455 20.813 1.632 20.504 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 13.293 2.293 C 13.684 1.903 14.316 1.903 14.707 2.293 L 21.707 9.293 C 21.967 9.544 22.071 9.916 21.980 10.266 C 21.888 10.615 21.615 10.888 21.266 10.980 C 20.916 11.071 20.544 10.967 20.293 10.707 L 13.293 3.707 C 12.903 3.317 12.903 2.683 13.293 2.293"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 20.293 2.293 C 20.685 1.914 21.309 1.919 21.695 2.305 C 22.081 2.691 22.086 3.315 21.707 3.707 L 14.707 10.707 C 14.315 11.086 13.691 11.081 13.305 10.695 C 12.919 10.309 12.914 9.685 13.293 9.293 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 21.000 13.000 C 21.552 13.000 22.000 13.448 22.000 14.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 14.000 22.000 C 13.448 22.000 13.000 21.552 13.000 21.000 L 13.000 14.000 C 13.000 13.448 13.448 13.000 14.000 13.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _icons!!
    }

private var _icons: ImageVector? = null
