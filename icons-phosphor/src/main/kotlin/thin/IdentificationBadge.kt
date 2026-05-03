package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorThinIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 146.700 166.750 C 160.494 158.365 167.020 141.822 162.666 126.278 C 158.312 110.734 144.143 99.988 128.000 99.988 C 111.857 99.988 97.688 110.734 93.334 126.278 C 88.980 141.822 95.506 158.365 109.300 166.750 C 96.305 170.701 84.916 178.709 76.800 189.600 C 75.475 191.367 75.833 193.875 77.600 195.200 C 79.367 196.525 81.875 196.167 83.200 194.400 C 93.776 180.299 110.374 172.000 128.000 172.000 C 145.626 172.000 162.224 180.299 172.800 194.400 C 174.125 196.167 176.633 196.525 178.400 195.200 C 180.167 193.875 180.525 191.367 179.200 189.600 C 171.082 178.711 159.694 170.704 146.700 166.750 ZM 100.000 136.000 C 100.000 120.536 112.536 108.000 128.000 108.000 C 143.464 108.000 156.000 120.536 156.000 136.000 C 156.000 151.464 143.464 164.000 128.000 164.000 C 112.536 164.000 100.000 151.464 100.000 136.000 ZM 200.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 ZM 92.000 64.000 C 92.000 61.791 93.791 60.000 96.000 60.000 L 160.000 60.000 C 162.209 60.000 164.000 61.791 164.000 64.000 C 164.000 66.209 162.209 68.000 160.000 68.000 L 96.000 68.000 C 93.791 68.000 92.000 66.209 92.000 64.000 Z"),
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
