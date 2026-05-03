package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorThinIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 115.120 182.620 L 176.330 132.690 C 185.858 124.997 190.160 112.542 187.411 100.609 C 184.662 88.676 175.344 79.358 163.411 76.609 C 151.478 73.860 139.023 78.162 131.330 87.690 L 85.480 143.830 L 40.680 99.000 C 56.361 51.846 106.780 25.795 154.314 40.287 C 201.847 54.779 229.156 104.529 215.861 152.411 C 202.566 200.293 153.518 228.842 105.317 216.753 C 57.117 204.665 27.345 156.349 38.220 107.860 L 80.450 150.090 C 73.571 159.871 74.942 173.224 83.665 181.403 C 92.388 189.582 105.801 190.093 115.120 182.600 ZM 124.030 109.220 C 124.656 125.942 138.059 139.358 154.780 140.000 L 124.000 165.090 C 124.000 164.730 124.000 164.370 124.000 164.000 C 124.000 150.745 113.255 140.000 100.000 140.000 C 99.630 140.000 99.270 140.000 98.910 140.000 ZM 156.000 132.000 C 142.745 132.000 132.000 121.255 132.000 108.000 C 132.000 94.745 142.745 84.000 156.000 84.000 C 169.255 84.000 180.000 94.745 180.000 108.000 C 180.000 121.255 169.255 132.000 156.000 132.000 ZM 100.000 148.000 C 108.837 148.000 116.000 155.163 116.000 164.000 C 116.000 172.837 108.837 180.000 100.000 180.000 C 91.163 180.000 84.000 172.837 84.000 164.000 C 84.000 155.163 91.163 148.000 100.000 148.000 Z"),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
