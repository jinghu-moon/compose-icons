package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorThinIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 242.830 61.170 L 194.830 13.170 C 193.267 11.607 190.733 11.607 189.170 13.170 C 187.607 14.733 187.607 17.267 189.170 18.830 L 210.340 40.000 L 133.660 116.690 L 96.490 79.510 C 94.238 77.251 91.180 75.981 87.990 75.981 C 84.800 75.981 81.742 77.251 79.490 79.510 L 23.490 135.510 C 21.241 137.761 19.984 140.818 20.000 144.000 L 20.000 224.000 C 20.000 230.627 25.373 236.000 32.000 236.000 L 112.000 236.000 C 115.184 236.003 118.238 234.740 120.490 232.490 L 176.490 176.490 C 178.749 174.238 180.019 171.180 180.019 167.990 C 180.019 164.800 178.749 161.742 176.490 159.490 L 139.310 122.320 L 216.000 45.660 L 237.170 66.830 C 238.733 68.393 241.267 68.393 242.830 66.830 C 244.393 65.267 244.393 62.733 242.830 61.170 ZM 170.830 165.170 C 171.581 165.920 172.003 166.938 172.003 168.000 C 172.003 169.062 171.581 170.080 170.830 170.830 L 114.830 226.830 C 114.079 227.580 113.061 228.001 112.000 228.000 L 32.000 228.000 C 29.791 228.000 28.000 226.209 28.000 224.000 L 28.000 144.000 C 27.999 142.939 28.420 141.921 29.170 141.170 L 85.170 85.170 C 85.920 84.419 86.938 83.997 88.000 83.997 C 89.062 83.997 90.080 84.419 90.830 85.170 L 128.000 122.340 L 85.170 165.170 C 83.607 166.733 83.607 169.267 85.170 170.830 C 86.733 172.393 89.267 172.393 90.830 170.830 L 133.660 128.000 Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
