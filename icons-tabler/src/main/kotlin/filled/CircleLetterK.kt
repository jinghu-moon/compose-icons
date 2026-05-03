package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterK: ImageVector
    get() {
        if (_circleLetterK != null) return _circleLetterK!!
        _circleLetterK = tablerFilledIcon(
            name = "CircleLetterK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 14.530 7.152 C 14.305 7.011 14.034 6.966 13.775 7.026 C 13.517 7.085 13.293 7.245 13.152 7.470 L 11.000 10.913 L 11.000 8.000 C 11.000 7.493 10.620 7.066 10.117 7.007 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 C 10.552 17.000 11.000 16.552 11.000 16.000 L 11.000 13.086 L 13.152 16.530 C 13.421 16.960 13.969 17.121 14.428 16.904 L 14.530 16.848 L 14.625 16.780 C 15.021 16.463 15.116 15.900 14.848 15.470 L 12.678 12.000 L 14.848 8.530 C 14.989 8.305 15.034 8.034 14.974 7.775 C 14.915 7.517 14.755 7.293 14.530 7.152"),
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
        return _circleLetterK!!
    }

private var _circleLetterK: ImageVector? = null
