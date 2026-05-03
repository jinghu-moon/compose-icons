package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Library: ImageVector
    get() {
        if (_library != null) return _library!!
        _library = tablerFilledIcon(
            name = "Library",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.358 2.000 22.000 3.642 22.000 5.667 L 22.000 14.333 C 22.000 16.358 20.358 18.000 18.333 18.000 L 9.667 18.000 C 7.642 18.000 6.000 16.358 6.000 14.333 L 6.000 5.667 C 6.000 3.642 7.642 2.000 9.667 2.000 ZM 14.000 12.000 L 11.000 12.000 C 10.448 12.000 10.000 12.448 10.000 13.000 C 10.000 13.552 10.448 14.000 11.000 14.000 L 14.000 14.000 C 14.552 14.000 15.000 13.552 15.000 13.000 C 15.000 12.448 14.552 12.000 14.000 12.000M 17.000 9.000 L 11.000 9.000 C 10.448 9.000 10.000 9.448 10.000 10.000 C 10.000 10.552 10.448 11.000 11.000 11.000 L 17.000 11.000 C 17.552 11.000 18.000 10.552 18.000 10.000 C 18.000 9.448 17.552 9.000 17.000 9.000M 16.000 6.000 L 11.000 6.000 C 10.448 6.000 10.000 6.448 10.000 7.000 C 10.000 7.552 10.448 8.000 11.000 8.000 L 16.000 8.000 C 16.552 8.000 17.000 7.552 17.000 7.000 C 17.000 6.448 16.552 6.000 16.000 6.000"),
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
        pathData = parseSvgPathData("M 3.517 6.391 C 3.997 6.118 4.608 6.285 4.881 6.765 C 5.154 7.245 4.987 7.856 4.507 8.129 C 4.194 8.307 4.001 8.639 4.000 8.997 L 4.000 18.997 C 4.000 19.545 4.452 19.997 5.000 19.997 L 15.000 19.997 C 15.284 19.997 15.405 19.909 15.626 19.511 C 15.894 19.028 16.503 18.855 16.986 19.123 C 17.469 19.391 17.642 20.000 17.374 20.483 C 16.828 21.463 16.094 21.997 15.000 21.997 L 5.000 21.997 C 3.348 21.997 2.000 20.649 2.000 18.997 L 2.000 8.995 C 2.001 7.917 2.580 6.923 3.517 6.390"),
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
        return _library!!
    }

private var _library: ImageVector? = null
