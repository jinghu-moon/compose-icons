package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorDuotoneIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 32.000 L 56.000 32.000 C 51.582 32.000 48.000 35.582 48.000 40.000 L 48.000 216.000 C 48.000 220.418 51.582 224.000 56.000 224.000 L 200.000 224.000 C 204.418 224.000 208.000 220.418 208.000 216.000 L 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 ZM 128.000 168.000 C 110.327 168.000 96.000 153.673 96.000 136.000 C 96.000 118.327 110.327 104.000 128.000 104.000 C 145.673 104.000 160.000 118.327 160.000 136.000 C 160.000 153.673 145.673 168.000 128.000 168.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 75.190 198.400 C 76.888 199.676 79.024 200.225 81.127 199.925 C 83.230 199.624 85.127 198.500 86.400 196.800 C 96.220 183.706 111.633 176.000 128.000 176.000 C 144.367 176.000 159.780 183.706 169.600 196.800 C 172.251 200.335 177.265 201.051 180.800 198.400 C 184.335 195.749 185.051 190.735 182.400 187.200 C 175.316 177.703 165.870 170.225 155.000 165.510 C 167.193 154.378 171.293 136.899 165.323 121.506 C 159.354 106.113 144.540 95.970 128.030 95.970 C 111.520 95.970 96.706 106.113 90.737 121.506 C 84.767 136.899 88.867 154.378 101.060 165.510 C 90.168 170.216 80.700 177.694 73.600 187.200 C 70.947 190.732 71.659 195.746 75.190 198.400 ZM 128.000 112.000 C 141.255 112.000 152.000 122.745 152.000 136.000 C 152.000 149.255 141.255 160.000 128.000 160.000 C 114.745 160.000 104.000 149.255 104.000 136.000 C 104.000 122.745 114.745 112.000 128.000 112.000 ZM 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 40.000 L 200.000 40.000 ZM 88.000 64.000 C 88.000 59.582 91.582 56.000 96.000 56.000 L 160.000 56.000 C 164.418 56.000 168.000 59.582 168.000 64.000 C 168.000 68.418 164.418 72.000 160.000 72.000 L 96.000 72.000 C 91.582 72.000 88.000 68.418 88.000 64.000 Z"),
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
