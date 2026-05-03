package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandMove: ImageVector
    get() {
        if (_handMove != null) return _handMove!!
        _handMove = tablerOutlineIcon(
            name = "HandMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 13.000 L 8.000 4.500 C 8.000 3.672 8.672 3.000 9.500 3.000 C 10.328 3.000 11.000 3.672 11.000 4.500 L 11.000 12.000"),
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
        pathData = parseSvgPathData("M 11.000 11.500 L 11.000 9.500 C 11.000 8.672 11.672 8.000 12.500 8.000 C 13.328 8.000 14.000 8.672 14.000 9.500 L 14.000 12.000"),
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
        pathData = parseSvgPathData("M 14.000 10.500 C 14.000 9.672 14.672 9.000 15.500 9.000 C 16.328 9.000 17.000 9.672 17.000 10.500 L 17.000 12.000"),
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
        pathData = parseSvgPathData("M 17.000 11.500 C 17.000 10.672 17.672 10.000 18.500 10.000 C 19.328 10.000 20.000 10.672 20.000 11.500 L 20.000 16.000 C 20.000 19.314 17.314 22.000 14.000 22.000 L 12.000 22.000 L 12.208 22.000 C 10.190 22.000 8.306 20.986 7.196 19.300 L 7.000 19.000 C 6.688 18.521 5.593 16.612 3.714 13.272 C 3.316 12.564 3.553 11.668 4.250 11.250 C 4.984 10.809 5.924 10.925 6.530 11.530 L 8.000 13.000"),
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
        pathData = parseSvgPathData("M 2.541 5.594 C 3.308 5.033 4.133 4.555 5.001 4.167"),
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
        pathData = parseSvgPathData("M 14.000 3.458 C 15.320 3.812 16.558 4.360 17.685 5.070"),
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
        return _handMove!!
    }

private var _handMove: ImageVector? = null
