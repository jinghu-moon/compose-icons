package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorDuotoneIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 112.000 C 216.000 156.180 184.000 184.000 152.000 184.000 C 120.000 184.000 110.370 162.930 110.370 162.930 L 110.370 162.930 L 128.000 88.000 L 141.140 32.170 L 141.140 32.170 C 183.238 34.880 215.998 69.815 216.000 112.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 112.000 C 224.000 134.570 216.100 155.200 201.770 170.110 C 188.390 184.000 170.250 192.000 152.000 192.000 C 134.120 192.000 122.180 186.140 114.570 180.000 L 103.790 225.820 C 102.944 229.440 99.717 232.000 96.000 232.000 C 95.381 231.999 94.763 231.929 94.160 231.790 C 92.086 231.314 90.288 230.032 89.162 228.226 C 88.036 226.421 87.675 224.242 88.160 222.170 L 120.160 86.170 C 121.171 81.868 125.478 79.199 129.780 80.210 C 134.082 81.221 136.751 85.528 135.740 89.830 L 118.840 161.630 C 122.000 166.000 131.300 176.000 152.000 176.000 C 179.530 176.000 208.000 152.060 208.000 112.000 C 207.988 81.739 189.055 54.714 160.618 44.367 C 132.181 34.021 100.308 42.560 80.853 65.738 C 61.397 88.916 58.511 121.786 73.630 148.000 C 75.699 151.811 74.356 156.576 70.601 158.745 C 66.846 160.914 62.047 159.696 59.780 156.000 C 41.292 123.961 44.813 83.780 68.593 55.446 C 92.372 27.112 131.333 16.673 166.093 29.322 C 200.854 41.972 223.993 75.009 224.000 112.000 Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
