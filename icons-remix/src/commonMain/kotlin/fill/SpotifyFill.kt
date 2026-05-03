package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpotifyFill: ImageVector
    get() {
        if (_spotifyFill != null) return _spotifyFill!!
        _spotifyFill = remixIcon(
            name = "SpotifyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 2.000 C 6.501 2.000 2.001 6.500 2.001 12.000 C 2.001 17.500 6.501 22.000 12.001 22.000 C 17.501 22.000 22.001 17.500 22.001 12.000 C 22.001 6.500 17.551 2.000 12.001 2.000 ZM 15.751 16.650 C 13.401 15.200 10.451 14.899 6.950 15.699 C 6.602 15.801 6.301 15.550 6.201 15.250 C 6.101 14.899 6.351 14.600 6.651 14.500 C 10.451 13.649 13.751 14.000 16.351 15.600 C 16.701 15.750 16.750 16.149 16.602 16.450 C 16.402 16.749 16.052 16.850 15.751 16.650 ZM 16.750 13.950 C 14.051 12.300 9.951 11.800 6.801 12.800 C 6.402 12.900 5.951 12.700 5.851 12.300 C 5.751 11.900 5.951 11.449 6.351 11.349 C 10.001 10.250 14.501 10.801 17.601 12.700 C 17.902 12.851 18.051 13.350 17.802 13.700 C 17.551 14.050 17.101 14.200 16.750 13.950 ZM 6.301 9.751 C 5.801 9.900 5.301 9.600 5.151 9.150 C 5.001 8.649 5.301 8.150 5.751 7.999 C 9.301 6.949 15.151 7.149 18.852 9.350 C 19.301 9.600 19.451 10.200 19.201 10.650 C 18.952 11.001 18.351 11.149 17.902 10.900 C 14.701 9.000 9.351 8.800 6.301 9.751 Z"),
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
        return _spotifyFill!!
    }

private var _spotifyFill: ImageVector? = null
