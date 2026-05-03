package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorFillIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 232.000 C 168.000 236.418 164.418 240.000 160.000 240.000 L 104.000 240.000 C 99.582 240.000 96.000 236.418 96.000 232.000 C 96.000 227.582 99.582 224.000 104.000 224.000 L 160.000 224.000 C 164.418 224.000 168.000 227.582 168.000 232.000 ZM 128.000 200.000 C 128.000 195.582 124.418 192.000 120.000 192.000 L 72.000 192.000 C 67.582 192.000 64.000 195.582 64.000 200.000 C 64.000 204.418 67.582 208.000 72.000 208.000 L 120.000 208.000 C 124.418 208.000 128.000 204.418 128.000 200.000 ZM 184.000 192.000 L 160.000 192.000 C 155.582 192.000 152.000 195.582 152.000 200.000 C 152.000 204.418 155.582 208.000 160.000 208.000 L 184.000 208.000 C 188.418 208.000 192.000 204.418 192.000 200.000 C 192.000 195.582 188.418 192.000 184.000 192.000 ZM 231.870 95.550 C 229.512 55.227 196.025 23.793 155.634 23.987 C 115.243 24.181 82.060 55.936 80.090 96.280 C 79.848 100.583 76.309 103.959 72.000 104.000 L 71.400 104.000 C 67.009 103.608 63.728 99.790 64.000 95.390 C 64.278 89.828 65.058 84.302 66.330 78.880 C 66.664 77.495 66.236 76.036 65.206 75.051 C 64.175 74.066 62.699 73.704 61.330 74.100 C 39.084 80.673 23.864 101.164 24.000 124.360 C 24.200 153.070 48.120 176.000 76.840 176.000 L 156.000 176.000 C 176.922 175.977 196.910 167.339 211.265 152.118 C 225.619 136.897 233.072 116.437 231.870 95.550 Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
