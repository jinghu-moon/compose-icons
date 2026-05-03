package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudWindyLine: ImageVector
    get() {
        if (_cloudWindyLine != null) return _cloudWindyLine!!
        _cloudWindyLine = remixIcon(
            name = "CloudWindyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 18.000 L 14.000 16.000 L 17.500 16.000 C 19.433 16.000 21.000 14.433 21.000 12.500 C 21.000 10.567 19.433 9.000 17.500 9.000 C 16.521 9.000 15.635 9.402 15.000 10.051 C 15.000 10.034 15.000 10.017 15.000 10.000 C 15.000 6.686 12.314 4.000 9.000 4.000 C 5.686 4.000 3.000 6.686 3.000 10.000 L 3.000 10.007 L 1.000 10.007 L 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.538 20.538 18.000 17.500 18.000 L 14.000 18.000 ZM 6.000 20.000 L 16.000 20.000 L 16.000 22.000 L 6.000 22.000 L 6.000 20.000 ZM 6.000 12.000 L 14.000 12.000 L 14.000 14.000 L 6.000 14.000 L 6.000 12.000 ZM 2.000 16.000 L 12.000 16.000 L 12.000 18.000 L 2.000 18.000 L 2.000 16.000 Z"),
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
        return _cloudWindyLine!!
    }

private var _cloudWindyLine: ImageVector? = null
