package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TaxiWifiLine: ImageVector
    get() {
        if (_taxiWifiLine != null) return _taxiWifiLine!!
        _taxiWifiLine = remixIcon(
            name = "TaxiWifiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 L 12.000 7.000 L 6.236 7.000 L 4.235 11.000 L 22.000 11.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 11.000 L 4.447 6.106 C 4.786 5.428 5.479 5.000 6.236 5.000 L 9.000 5.000 L 9.000 3.000 L 12.000 3.000 ZM 20.000 13.000 L 4.000 13.000 L 4.000 18.000 L 20.000 18.000 L 20.000 13.000 ZM 6.500 14.000 C 7.328 14.000 8.000 14.672 8.000 15.500 C 8.000 16.328 7.328 17.000 6.500 17.000 C 5.672 17.000 5.000 16.328 5.000 15.500 C 5.000 14.672 5.672 14.000 6.500 14.000 ZM 17.500 14.000 C 18.328 14.000 19.000 14.672 19.000 15.500 C 19.000 16.328 18.328 17.000 17.500 17.000 C 16.672 17.000 16.000 16.328 16.000 15.500 C 16.000 14.672 16.672 14.000 17.500 14.000 ZM 18.500 1.000 C 20.985 1.000 23.000 3.015 23.000 5.500 C 23.000 7.985 20.985 10.000 18.500 10.000 C 16.015 10.000 14.000 7.985 14.000 5.500 C 14.000 3.015 16.015 1.000 18.500 1.000 ZM 18.500 6.167 C 18.009 6.167 17.559 6.344 17.211 6.637 L 17.086 6.752 L 18.500 8.167 L 19.913 6.752 C 19.551 6.390 19.052 6.167 18.500 6.167 ZM 18.500 3.500 C 17.297 3.500 16.200 3.955 15.372 4.703 L 15.199 4.868 L 16.143 5.810 C 16.746 5.206 17.579 4.833 18.500 4.833 C 19.344 4.833 20.114 5.147 20.701 5.664 L 20.857 5.810 L 21.800 4.867 C 20.955 4.022 19.788 3.500 18.500 3.500 Z"),
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
        return _taxiWifiLine!!
    }

private var _taxiWifiLine: ImageVector? = null
