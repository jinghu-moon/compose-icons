package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudyLine: ImageVector
    get() {
        if (_cloudyLine != null) return _cloudyLine!!
        _cloudyLine = remixIcon(
            name = "CloudyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.500 6.000 C 5.910 6.000 3.000 8.910 3.000 12.500 C 3.000 16.090 5.910 19.000 9.500 19.000 L 16.500 19.000 C 18.985 19.000 21.000 16.985 21.000 14.500 C 21.000 12.015 18.985 10.000 16.500 10.000 C 16.172 10.000 15.852 10.035 15.543 10.102 C 14.589 7.699 12.243 6.000 9.500 6.000 ZM 16.500 21.000 L 9.500 21.000 C 4.806 21.000 1.000 17.194 1.000 12.500 C 1.000 7.806 4.806 4.000 9.500 4.000 C 12.543 4.000 15.213 5.599 16.715 8.003 C 20.205 8.117 23.000 10.982 23.000 14.500 C 23.000 18.090 20.090 21.000 16.500 21.000 Z"),
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
        return _cloudyLine!!
    }

private var _cloudyLine: ImageVector? = null
