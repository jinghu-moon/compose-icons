package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandGrab: ImageVector
    get() {
        if (_handGrab != null) return _handGrab!!
        _handGrab = tablerOutlineIcon(
            name = "HandGrab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 11.000 L 8.000 7.500 C 8.000 6.672 8.672 6.000 9.500 6.000 C 10.328 6.000 11.000 6.672 11.000 7.500 L 11.000 10.000"),
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
        pathData = parseSvgPathData("M 11.000 9.500 L 11.000 6.500 C 11.000 5.672 11.672 5.000 12.500 5.000 C 13.328 5.000 14.000 5.672 14.000 6.500 L 14.000 10.000"),
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
        pathData = parseSvgPathData("M 14.000 7.500 C 14.000 6.672 14.672 6.000 15.500 6.000 C 16.328 6.000 17.000 6.672 17.000 7.500 L 17.000 10.000"),
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
        pathData = parseSvgPathData("M 17.000 9.500 C 17.000 8.672 17.672 8.000 18.500 8.000 C 19.328 8.000 20.000 8.672 20.000 9.500 L 20.000 14.000 C 20.000 17.314 17.314 20.000 14.000 20.000 L 12.000 20.000 L 12.208 20.000 C 10.190 20.000 8.306 18.986 7.196 17.300 L 7.000 17.000 C 6.688 16.521 5.593 14.612 3.714 11.272 C 3.316 10.564 3.553 9.668 4.250 9.250 C 4.984 8.809 5.924 8.925 6.530 9.530 L 8.000 11.000"),
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
        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
