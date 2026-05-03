package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudWarning: ImageVector
    get() {
        if (_cloudWarning != null) return _cloudWarning!!
        _cloudWarning = phosphorDuotoneIcon(
            name = "CloudWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 127.620 C 240.000 171.803 204.183 207.620 160.000 207.620 L 72.000 207.620 C 50.325 207.593 30.612 195.061 21.390 175.446 C 12.169 155.830 15.094 132.655 28.902 115.947 C 42.709 99.239 64.919 91.999 85.920 97.360 L 85.920 97.460 C 100.357 62.048 137.838 41.806 175.368 49.152 C 212.898 56.498 239.980 89.378 240.000 127.620 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 160.000 40.000 C 126.668 40.026 96.206 58.862 81.290 88.670 C 57.575 85.211 33.915 95.292 19.981 114.792 C 6.048 134.291 4.177 159.941 15.132 181.256 C 26.088 202.572 48.034 215.980 72.000 216.000 L 160.000 216.000 C 208.601 216.000 248.000 176.601 248.000 128.000 C 248.000 79.399 208.601 40.000 160.000 40.000 ZM 160.000 200.000 L 72.000 200.000 C 45.490 200.000 24.000 178.510 24.000 152.000 C 24.000 125.490 45.490 104.000 72.000 104.000 C 73.100 104.000 74.200 104.000 75.290 104.110 C 73.102 111.885 71.995 119.923 72.000 128.000 C 72.000 132.418 75.582 136.000 80.000 136.000 C 84.418 136.000 88.000 132.418 88.000 128.000 C 88.000 88.235 120.235 56.000 160.000 56.000 C 199.764 56.000 232.000 88.235 232.000 128.000 C 232.000 167.764 199.764 200.000 160.000 200.000 ZM 152.000 128.000 L 152.000 88.000 C 152.000 83.582 155.582 80.000 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 L 168.000 128.000 C 168.000 132.418 164.418 136.000 160.000 136.000 C 155.582 136.000 152.000 132.418 152.000 128.000 ZM 172.000 164.000 C 172.000 170.627 166.627 176.000 160.000 176.000 C 153.373 176.000 148.000 170.627 148.000 164.000 C 148.000 157.373 153.373 152.000 160.000 152.000 C 166.627 152.000 172.000 157.373 172.000 164.000 Z"),
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
        return _cloudWarning!!
    }

private var _cloudWarning: ImageVector? = null
