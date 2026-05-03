package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorThinIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.220 148.090 L 189.600 53.410 C 189.403 52.955 189.121 52.541 188.770 52.190 C 183.519 46.938 176.397 43.988 168.970 43.988 C 161.543 43.988 154.421 46.938 149.170 52.190 C 148.425 52.936 148.004 53.946 148.000 55.000 L 148.000 84.000 L 108.000 84.000 L 108.000 55.000 C 108.001 53.939 107.580 52.921 106.830 52.170 C 101.579 46.918 94.457 43.968 87.030 43.968 C 79.603 43.968 72.481 46.918 67.230 52.170 C 66.879 52.521 66.597 52.935 66.400 53.390 L 24.780 148.090 C 16.523 164.328 19.125 183.974 31.325 197.502 C 43.525 211.030 62.799 215.641 79.801 209.100 C 96.802 202.558 108.014 186.216 108.000 168.000 L 108.000 92.000 L 148.000 92.000 L 148.000 168.000 C 147.986 186.216 159.198 202.558 176.199 209.100 C 193.201 215.641 212.475 211.030 224.675 197.502 C 236.875 183.974 239.477 164.328 231.220 148.090 ZM 64.000 204.000 C 44.118 204.000 28.000 187.882 28.000 168.000 C 28.000 148.118 44.118 132.000 64.000 132.000 C 83.882 132.000 100.000 148.118 100.000 168.000 C 100.000 187.882 83.882 204.000 64.000 204.000 ZM 64.000 124.000 C 56.013 123.994 48.177 126.172 41.340 130.300 L 73.400 57.350 C 80.831 50.429 92.269 50.175 100.000 56.760 L 100.000 142.760 C 91.774 131.014 78.340 124.013 64.000 124.000 ZM 156.000 56.770 C 163.731 50.185 175.169 50.439 182.600 57.360 L 214.660 130.300 C 194.878 118.377 169.240 123.814 156.000 142.740 ZM 192.000 204.000 C 172.118 204.000 156.000 187.882 156.000 168.000 C 156.000 148.118 172.118 132.000 192.000 132.000 C 211.882 132.000 228.000 148.118 228.000 168.000 C 228.000 187.882 211.882 204.000 192.000 204.000 Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
