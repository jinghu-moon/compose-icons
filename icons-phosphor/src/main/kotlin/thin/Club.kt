package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorThinIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 92.000 C 181.234 92.000 178.472 92.218 175.740 92.650 C 185.146 70.866 178.612 45.478 159.860 30.940 C 141.108 16.403 114.892 16.403 96.140 30.940 C 77.388 45.478 70.854 70.866 80.260 92.650 C 77.528 92.218 74.766 92.000 72.000 92.000 C 49.353 92.009 29.317 106.674 22.461 128.258 C 15.605 149.842 23.507 173.381 41.997 186.457 C 60.488 199.533 85.315 199.137 103.380 185.480 L 92.170 222.850 C 91.807 224.061 92.037 225.372 92.791 226.387 C 93.546 227.402 94.736 228.000 96.000 228.000 L 160.000 228.000 C 161.264 228.000 162.454 227.402 163.209 226.387 C 163.963 225.372 164.193 224.061 163.830 222.850 L 152.620 185.480 C 170.685 199.137 195.512 199.533 214.003 186.457 C 232.493 173.381 240.395 149.842 233.539 128.258 C 226.684 106.674 206.647 92.009 184.000 92.000 ZM 184.000 188.000 C 169.209 188.015 155.403 180.584 147.270 168.230 C 146.178 166.568 144.031 165.961 142.230 166.805 C 140.429 167.648 139.522 169.687 140.100 171.590 L 154.620 220.000 L 101.380 220.000 L 115.900 171.590 C 116.478 169.687 115.571 167.648 113.770 166.805 C 111.969 165.961 109.822 166.568 108.730 168.230 C 96.095 187.373 70.874 193.598 50.783 182.534 C 30.691 171.469 22.469 146.827 31.893 125.915 C 41.316 105.004 65.222 94.839 86.820 102.560 C 88.446 103.138 90.260 102.608 91.319 101.245 C 92.378 99.881 92.443 97.993 91.480 96.560 C 79.128 78.211 82.317 53.544 98.931 38.941 C 115.544 24.338 140.416 24.338 157.029 38.941 C 173.643 53.544 176.832 78.211 164.480 96.560 C 163.517 97.993 163.582 99.881 164.641 101.245 C 165.700 102.608 167.514 103.138 169.140 102.560 C 185.642 96.671 204.066 101.134 216.044 113.922 C 228.021 126.711 231.269 145.387 224.313 161.469 C 217.357 177.550 201.522 187.972 184.000 188.000 Z"),
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
        return _club!!
    }

private var _club: ImageVector? = null
