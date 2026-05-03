package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.School: ImageVector
    get() {
        if (_school != null) return _school!!
        _school = tablerFilledIcon(
            name = "School",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 13.431 L 19.000 16.000 C 19.000 18.398 15.795 20.000 12.000 20.000 C 8.205 20.000 5.000 18.398 5.000 16.000 L 5.000 13.431 L 10.886 15.785 C 11.527 16.042 12.238 16.069 12.897 15.863 L 13.114 15.785 ZM 21.000 10.476 L 12.371 13.928 C 12.133 14.023 11.867 14.023 11.629 13.928 L 1.629 9.928 C 0.790 9.593 0.790 8.407 1.629 8.072 L 11.629 4.072 C 11.708 4.040 11.790 4.019 11.874 4.008 L 12.000 4.000 L 12.126 4.008 C 12.210 4.019 12.292 4.040 12.371 4.072 L 22.403 8.085 L 22.511 8.140 L 22.610 8.208 L 22.698 8.284 L 22.773 8.366 L 22.808 8.410 L 22.881 8.525 L 22.933 8.640 L 22.967 8.742 L 22.992 8.877 L 22.998 8.935 L 23.000 15.000 C 23.000 15.552 22.552 16.000 22.000 16.000 C 21.448 16.000 21.000 15.552 21.000 15.000 Z"),
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
        return _school!!
    }

private var _school: ImageVector? = null
