package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorThinIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 76.000 C 195.295 75.967 172.033 52.705 172.000 24.000 C 172.000 21.791 170.209 20.000 168.000 20.000 L 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 156.000 C 123.998 167.892 115.289 177.989 103.526 179.736 C 91.764 181.484 80.495 174.354 77.037 162.976 C 73.579 151.598 78.974 139.404 89.720 134.310 C 91.116 133.645 92.003 132.236 92.000 130.690 L 92.000 88.000 C 92.001 86.816 91.477 85.693 90.570 84.933 C 89.663 84.172 88.465 83.853 87.300 84.060 C 53.490 90.080 28.000 121.000 28.000 156.000 C 28.000 195.764 60.235 228.000 100.000 228.000 C 139.764 228.000 172.000 195.764 172.000 156.000 L 172.000 109.440 C 187.655 119.006 205.654 124.045 224.000 124.000 C 226.209 124.000 228.000 122.209 228.000 120.000 L 228.000 80.000 C 228.000 77.791 226.209 76.000 224.000 76.000 ZM 220.000 115.920 C 202.121 115.182 184.853 109.208 170.340 98.740 C 169.120 97.860 167.509 97.739 166.171 98.427 C 164.833 99.115 163.994 100.495 164.000 102.000 L 164.000 156.000 C 164.000 191.346 135.346 220.000 100.000 220.000 C 64.654 220.000 36.000 191.346 36.000 156.000 C 36.000 126.480 56.320 100.210 84.000 93.000 L 84.000 128.310 C 70.549 136.076 64.617 152.380 69.932 166.975 C 75.248 181.569 90.277 190.238 105.572 187.534 C 120.867 184.830 132.011 171.532 132.000 156.000 L 132.000 28.000 L 164.130 28.000 C 166.179 57.967 190.033 81.821 220.000 83.870 Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
