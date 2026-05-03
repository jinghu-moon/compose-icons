package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorFillIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 96.000 48.000 L 160.000 48.000 C 164.418 48.000 168.000 51.582 168.000 56.000 C 168.000 60.418 164.418 64.000 160.000 64.000 L 96.000 64.000 C 91.582 64.000 88.000 60.418 88.000 56.000 C 88.000 51.582 91.582 48.000 96.000 48.000 ZM 180.810 198.400 C 179.112 199.676 176.976 200.225 174.873 199.925 C 172.770 199.624 170.873 198.500 169.600 196.800 C 159.780 183.706 144.367 176.000 128.000 176.000 C 111.633 176.000 96.220 183.706 86.400 196.800 C 83.749 200.335 78.735 201.051 75.200 198.400 C 71.665 195.749 70.949 190.735 73.600 187.200 C 80.684 177.703 90.130 170.225 101.000 165.510 C 88.807 154.378 84.707 136.899 90.677 121.506 C 96.646 106.113 111.460 95.970 127.970 95.970 C 144.480 95.970 159.294 106.113 165.263 121.506 C 171.233 136.899 167.133 154.378 154.940 165.510 C 165.832 170.216 175.300 177.694 182.400 187.200 C 185.053 190.732 184.341 195.746 180.810 198.400 ZM 152.000 136.000 C 152.000 149.255 141.255 160.000 128.000 160.000 C 114.745 160.000 104.000 149.255 104.000 136.000 C 104.000 122.745 114.745 112.000 128.000 112.000 C 141.255 112.000 152.000 122.745 152.000 136.000 Z"),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
