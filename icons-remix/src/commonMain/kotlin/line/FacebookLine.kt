package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FacebookLine: ImageVector
    get() {
        if (_facebookLine != null) return _facebookLine!!
        _facebookLine = remixIcon(
            name = "FacebookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 9.000 L 17.500 9.000 L 17.000 11.000 L 13.000 11.000 L 13.000 20.000 L 11.000 20.000 L 11.000 11.000 L 7.000 11.000 L 7.000 9.000 L 11.000 9.000 L 11.000 7.128 C 11.000 5.345 11.186 4.698 11.534 4.046 C 11.883 3.394 12.394 2.883 13.046 2.534 C 13.698 2.186 14.345 2.000 16.128 2.000 C 16.650 2.000 17.107 2.050 17.500 2.150 L 17.500 4.000 L 16.128 4.000 C 14.804 4.000 14.401 4.078 13.990 4.298 C 13.686 4.460 13.460 4.686 13.298 4.990 C 13.078 5.401 13.000 5.804 13.000 7.128 L 13.000 9.000 Z"),
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
        return _facebookLine!!
    }

private var _facebookLine: ImageVector? = null
