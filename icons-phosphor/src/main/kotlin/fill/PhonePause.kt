package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorFillIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.880 183.080 C 220.191 211.111 196.273 232.051 168.000 232.000 C 88.600 232.000 24.000 167.400 24.000 88.000 C 23.949 59.727 44.889 35.809 72.920 32.120 C 79.957 31.261 86.721 35.135 89.540 41.640 L 110.660 88.790 L 110.660 88.910 C 112.794 93.835 112.318 99.501 109.390 104.000 C 109.210 104.270 109.020 104.520 108.820 104.770 L 88.000 129.450 C 95.490 144.670 111.410 160.450 126.830 167.960 L 151.170 147.250 C 151.409 147.049 151.659 146.862 151.920 146.690 C 156.418 143.688 162.129 143.161 167.100 145.290 L 167.220 145.350 L 214.320 166.460 C 220.841 169.266 224.733 176.033 223.880 183.080 ZM 200.000 112.000 C 204.418 112.000 208.000 108.418 208.000 104.000 L 208.000 48.000 C 208.000 43.582 204.418 40.000 200.000 40.000 C 195.582 40.000 192.000 43.582 192.000 48.000 L 192.000 104.000 C 192.000 108.418 195.582 112.000 200.000 112.000 ZM 160.000 112.000 C 164.418 112.000 168.000 108.418 168.000 104.000 L 168.000 48.000 C 168.000 43.582 164.418 40.000 160.000 40.000 C 155.582 40.000 152.000 43.582 152.000 48.000 L 152.000 104.000 C 152.000 108.418 155.582 112.000 160.000 112.000 Z"),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
