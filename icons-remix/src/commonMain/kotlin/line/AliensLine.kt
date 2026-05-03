package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AliensLine: ImageVector
    get() {
        if (_aliensLine != null) return _aliensLine!!
        _aliensLine = remixIcon(
            name = "AliensLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.694 2.000 20.500 5.806 20.500 10.500 C 20.500 17.000 15.000 22.500 12.000 22.500 C 9.000 22.500 3.500 17.000 3.500 10.500 C 3.500 5.806 7.306 2.000 12.000 2.000 ZM 12.000 4.000 C 8.410 4.000 5.500 6.910 5.500 10.500 C 5.500 15.294 9.665 20.500 12.000 20.500 C 14.335 20.500 18.500 15.294 18.500 10.500 C 18.500 6.910 15.590 4.000 12.000 4.000 ZM 17.500 11.000 C 17.660 11.000 17.819 11.008 17.975 11.025 C 17.992 11.181 18.000 11.340 18.000 11.500 C 18.000 13.985 15.985 16.000 13.500 16.000 C 13.340 16.000 13.181 15.992 13.025 15.975 C 13.008 15.819 13.000 15.660 13.000 15.500 C 13.000 13.015 15.015 11.000 17.500 11.000 ZM 6.500 11.000 C 8.985 11.000 11.000 13.015 11.000 15.500 C 11.000 15.660 10.992 15.819 10.975 15.975 C 10.819 15.992 10.660 16.000 10.500 16.000 C 8.015 16.000 6.000 13.985 6.000 11.500 C 6.000 11.340 6.008 11.181 6.025 11.025 C 6.181 11.008 6.340 11.000 6.500 11.000 Z"),
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
        return _aliensLine!!
    }

private var _aliensLine: ImageVector? = null
