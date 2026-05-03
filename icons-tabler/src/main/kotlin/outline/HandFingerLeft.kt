package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerLeft: ImageVector
    get() {
        if (_handFingerLeft != null) return _handFingerLeft!!
        _handFingerLeft = tablerOutlineIcon(
            name = "HandFingerLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 8.000 L 3.500 8.000 C 2.672 8.000 2.000 8.672 2.000 9.500 C 2.000 10.328 2.672 11.000 3.500 11.000 L 11.000 11.000"),
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
        pathData = parseSvgPathData("M 10.500 11.000 L 8.500 11.000 C 7.672 11.000 7.000 11.672 7.000 12.500 C 7.000 13.328 7.672 14.000 8.500 14.000 L 11.000 14.000"),
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
        pathData = parseSvgPathData("M 9.500 14.000 C 8.672 14.000 8.000 14.672 8.000 15.500 C 8.000 16.328 8.672 17.000 9.500 17.000 L 11.000 17.000"),
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
        pathData = parseSvgPathData("M 10.500 17.000 C 9.672 17.000 9.000 17.672 9.000 18.500 C 9.000 19.328 9.672 20.000 10.500 20.000 L 15.000 20.000 C 18.314 20.000 21.000 17.314 21.000 14.000 L 21.000 12.000 L 21.000 12.208 C 21.000 10.190 19.986 8.306 18.300 7.196 L 18.000 7.000 Q 17.282 6.532 12.272 3.714 C 11.564 3.316 10.668 3.553 10.250 4.250 C 9.811 4.985 9.926 5.924 10.530 6.530 L 12.000 8.000"),
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
        return _handFingerLeft!!
    }

private var _handFingerLeft: ImageVector? = null
