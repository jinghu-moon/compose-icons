package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorRegularIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 208.000 L 72.000 208.000 C 67.582 208.000 64.000 204.418 64.000 200.000 C 64.000 195.582 67.582 192.000 72.000 192.000 L 120.000 192.000 C 124.418 192.000 128.000 195.582 128.000 200.000 C 128.000 204.418 124.418 208.000 120.000 208.000 ZM 184.000 192.000 L 160.000 192.000 C 155.582 192.000 152.000 195.582 152.000 200.000 C 152.000 204.418 155.582 208.000 160.000 208.000 L 184.000 208.000 C 188.418 208.000 192.000 204.418 192.000 200.000 C 192.000 195.582 188.418 192.000 184.000 192.000 ZM 160.000 224.000 L 104.000 224.000 C 99.582 224.000 96.000 227.582 96.000 232.000 C 96.000 236.418 99.582 240.000 104.000 240.000 L 160.000 240.000 C 164.418 240.000 168.000 236.418 168.000 232.000 C 168.000 227.582 164.418 224.000 160.000 224.000 ZM 232.000 100.000 C 231.956 141.955 197.955 175.956 156.000 176.000 L 76.000 176.000 C 47.281 176.000 24.000 152.719 24.000 124.000 C 24.000 95.281 47.281 72.000 76.000 72.000 C 78.989 72.003 81.973 72.257 84.920 72.760 C 98.084 38.567 133.749 18.614 169.775 25.286 C 205.801 31.959 231.955 63.361 232.000 100.000 ZM 216.000 100.000 C 215.867 67.615 190.082 41.168 157.712 40.213 C 125.341 39.258 98.042 64.140 96.000 96.460 C 95.746 100.878 91.958 104.254 87.540 104.000 C 83.122 103.746 79.746 99.958 80.000 95.540 Q 80.210 91.880 80.770 88.310 C 79.188 88.107 77.595 88.003 76.000 88.000 C 56.118 88.000 40.000 104.118 40.000 124.000 C 40.000 143.882 56.118 160.000 76.000 160.000 L 156.000 160.000 C 189.121 159.961 215.961 133.121 216.000 100.000 Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
