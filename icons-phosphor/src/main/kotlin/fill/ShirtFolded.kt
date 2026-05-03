package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorFillIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.000 40.000 L 179.350 40.000 L 165.660 26.340 C 164.158 24.840 162.122 23.998 160.000 24.000 L 96.000 24.000 C 93.878 23.998 91.842 24.840 90.340 26.340 L 76.650 40.000 L 55.000 40.000 C 46.716 40.000 40.000 46.716 40.000 55.000 L 40.000 209.000 C 40.000 217.284 46.716 224.000 55.000 224.000 L 116.000 224.000 C 118.209 224.000 120.000 222.209 120.000 220.000 L 120.000 104.270 C 119.937 99.981 123.197 96.372 127.470 96.000 C 129.682 95.853 131.856 96.631 133.473 98.147 C 135.090 99.664 136.005 101.783 136.000 104.000 L 136.000 220.000 C 136.000 222.209 137.791 224.000 140.000 224.000 L 201.000 224.000 C 209.284 224.000 216.000 217.284 216.000 209.000 L 216.000 55.000 C 216.000 46.716 209.284 40.000 201.000 40.000 ZM 86.540 107.080 C 85.346 108.061 83.694 108.267 82.296 107.609 C 80.898 106.950 80.004 105.545 80.000 104.000 L 80.000 59.310 L 95.240 44.070 L 118.710 79.280 ZM 128.000 80.000 L 128.000 80.000 L 128.000 80.000 ZM 176.000 104.000 C 176.004 105.554 175.107 106.970 173.700 107.630 C 172.317 108.297 170.673 108.098 169.490 107.120 L 137.290 79.300 L 160.760 44.090 L 176.000 59.310 Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
