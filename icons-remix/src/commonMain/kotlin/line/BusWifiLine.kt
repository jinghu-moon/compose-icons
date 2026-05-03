package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BusWifiLine: ImageVector
    get() {
        if (_busWifiLine != null) return _busWifiLine!!
        _busWifiLine = remixIcon(
            name = "BusWifiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 L 12.000 5.000 L 5.000 5.000 L 5.000 12.000 L 21.000 12.000 L 21.000 20.000 L 20.000 20.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 20.000 L 7.000 20.000 L 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 20.000 L 3.000 20.000 L 3.000 12.000 L 2.000 12.000 L 2.000 8.000 L 3.000 8.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 12.000 3.000 ZM 19.000 14.000 L 5.000 14.000 L 5.000 18.000 L 19.000 18.000 L 19.000 14.000 ZM 10.000 15.000 L 10.000 17.000 L 6.000 17.000 L 6.000 15.000 L 10.000 15.000 ZM 18.000 15.000 L 18.000 17.000 L 14.000 17.000 L 14.000 15.000 L 18.000 15.000 ZM 18.500 1.000 C 20.985 1.000 23.000 3.015 23.000 5.500 C 23.000 7.985 20.985 10.000 18.500 10.000 C 16.015 10.000 14.000 7.985 14.000 5.500 C 14.000 3.015 16.015 1.000 18.500 1.000 ZM 18.500 6.167 C 18.009 6.167 17.559 6.344 17.211 6.637 L 17.086 6.752 L 18.500 8.167 L 19.913 6.752 C 19.551 6.390 19.052 6.167 18.500 6.167 ZM 18.500 3.500 C 17.297 3.500 16.200 3.955 15.372 4.703 L 15.199 4.868 L 16.143 5.810 C 16.746 5.206 17.579 4.833 18.500 4.833 C 19.344 4.833 20.114 5.147 20.701 5.664 L 20.857 5.810 L 21.800 4.867 C 20.955 4.022 19.788 3.500 18.500 3.500 Z"),
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
        return _busWifiLine!!
    }

private var _busWifiLine: ImageVector? = null
