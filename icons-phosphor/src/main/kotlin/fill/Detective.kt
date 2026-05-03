package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorFillIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 120.000 C 256.000 124.418 252.418 128.000 248.000 128.000 L 8.000 128.000 C 3.582 128.000 0.000 124.418 0.000 120.000 C 0.000 115.582 3.582 112.000 8.000 112.000 L 35.920 112.000 L 83.420 46.590 C 86.337 42.585 90.945 40.157 95.898 40.016 C 100.851 39.875 105.590 42.037 108.730 45.870 L 121.580 60.770 L 121.780 61.000 C 123.288 62.895 125.578 63.999 128.000 63.999 C 130.422 63.999 132.712 62.895 134.220 61.000 L 134.420 60.770 L 147.270 45.870 C 150.410 42.037 155.149 39.875 160.102 40.016 C 165.055 40.157 169.663 42.585 172.580 46.590 L 220.080 112.000 L 248.000 112.000 C 252.418 112.000 256.000 115.582 256.000 120.000 ZM 180.000 144.000 C 161.668 144.004 146.267 157.782 144.230 176.000 L 111.770 176.000 C 109.729 157.800 94.348 144.033 76.034 144.013 C 57.719 143.993 42.309 157.726 40.228 175.922 C 38.146 194.118 50.058 210.976 67.904 215.092 C 85.750 219.208 103.842 209.269 109.940 192.000 L 146.060 192.000 C 152.163 209.261 170.248 219.193 188.088 215.080 C 205.928 210.967 217.840 194.120 215.770 175.930 C 213.700 157.739 198.308 143.999 180.000 144.000 Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
