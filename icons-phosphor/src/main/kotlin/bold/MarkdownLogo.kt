package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorBoldIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 44.000 L 24.000 44.000 C 12.954 44.000 4.000 52.954 4.000 64.000 L 4.000 192.000 C 4.000 203.046 12.954 212.000 24.000 212.000 L 232.000 212.000 C 243.046 212.000 252.000 203.046 252.000 192.000 L 252.000 64.000 C 252.000 52.954 243.046 44.000 232.000 44.000 ZM 228.000 188.000 L 28.000 188.000 L 28.000 68.000 L 228.000 68.000 ZM 48.000 148.000 L 48.000 108.000 C 47.996 103.144 50.920 98.764 55.407 96.905 C 59.893 95.046 65.058 96.074 68.490 99.510 L 88.000 119.000 L 107.510 99.480 C 110.946 96.040 116.118 95.013 120.607 96.880 C 125.097 98.747 128.016 103.138 128.000 108.000 L 128.000 148.000 C 128.000 154.627 122.627 160.000 116.000 160.000 C 109.373 160.000 104.000 154.627 104.000 148.000 L 104.000 137.000 L 96.490 144.520 C 94.238 146.779 91.180 148.049 87.990 148.049 C 84.800 148.049 81.742 146.779 79.490 144.520 L 72.000 137.000 L 72.000 148.000 C 72.000 154.627 66.627 160.000 60.000 160.000 C 53.373 160.000 48.000 154.627 48.000 148.000 ZM 146.630 124.500 C 148.619 122.014 151.514 120.421 154.678 120.070 C 157.842 119.720 161.015 120.640 163.500 122.630 L 164.000 123.030 L 164.000 108.000 C 164.000 101.373 169.373 96.000 176.000 96.000 C 182.627 96.000 188.000 101.373 188.000 108.000 L 188.000 123.000 L 188.500 122.600 C 193.675 118.458 201.228 119.295 205.370 124.470 C 209.512 129.645 208.675 137.198 203.500 141.340 L 183.500 157.340 C 179.116 160.850 172.884 160.850 168.500 157.340 L 148.500 141.340 C 143.343 137.201 142.507 129.670 146.630 124.500 Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
