package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MastercardLine: ImageVector
    get() {
        if (_mastercardLine != null) return _mastercardLine!!
        _mastercardLine = remixIcon(
            name = "MastercardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 18.294 C 10.916 18.933 9.651 19.300 8.301 19.300 C 4.269 19.300 1.001 16.032 1.001 12.000 C 1.001 7.968 4.269 4.700 8.301 4.700 C 9.651 4.700 10.916 5.067 12.001 5.706 C 13.086 5.067 14.351 4.700 15.701 4.700 C 19.733 4.700 23.001 7.968 23.001 12.000 C 23.001 16.032 19.733 19.300 15.701 19.300 C 14.351 19.300 13.086 18.933 12.001 18.294 ZM 13.703 16.910 C 14.319 17.162 14.994 17.300 15.701 17.300 C 18.628 17.300 21.001 14.927 21.001 12.000 C 21.001 9.073 18.628 6.700 15.701 6.700 C 14.994 6.700 14.319 6.838 13.703 7.090 C 14.882 8.386 15.601 10.109 15.601 12.000 C 15.601 13.891 14.882 15.614 13.703 16.910 ZM 10.299 7.090 C 9.683 6.838 9.008 6.700 8.301 6.700 C 5.374 6.700 3.001 9.073 3.001 12.000 C 3.001 14.927 5.374 17.300 8.301 17.300 C 9.008 17.300 9.683 17.162 10.299 16.910 C 9.120 15.614 8.401 13.891 8.401 12.000 C 8.401 10.109 9.120 8.386 10.299 7.090 ZM 12.001 8.205 C 11.014 9.168 10.401 10.512 10.401 12.000 C 10.401 13.488 11.014 14.832 12.001 15.795 C 12.988 14.832 13.601 13.488 13.601 12.000 C 13.601 10.512 12.988 9.168 12.001 8.205 Z"),
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
        return _mastercardLine!!
    }

private var _mastercardLine: ImageVector? = null
