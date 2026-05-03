package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorThinIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 160.000 C 244.000 179.882 227.882 196.000 208.000 196.000 L 190.570 196.000 C 170.383 195.954 152.033 184.271 143.450 166.000 L 113.300 101.400 C 106.040 85.935 90.514 76.044 73.430 76.000 L 64.000 76.000 C 39.711 76.028 20.028 95.711 20.000 120.000 L 20.000 144.000 C 20.028 168.289 39.711 187.972 64.000 188.000 L 72.000 188.000 C 86.316 188.002 99.273 179.521 105.000 166.400 C 105.551 165.059 106.784 164.120 108.224 163.948 C 109.664 163.775 111.084 164.395 111.937 165.568 C 112.789 166.742 112.939 168.284 112.330 169.600 C 105.331 185.636 89.497 196.001 72.000 196.000 L 64.000 196.000 C 35.295 195.967 12.033 172.705 12.000 144.000 L 12.000 120.000 C 12.033 91.295 35.295 68.033 64.000 68.000 L 73.430 68.000 C 93.617 68.046 111.967 79.729 120.550 98.000 L 150.700 162.600 C 157.960 178.065 173.486 187.956 190.570 188.000 L 208.000 188.000 C 223.464 188.000 236.000 175.464 236.000 160.000 C 236.000 144.536 223.464 132.000 208.000 132.000 L 188.000 132.000 C 170.327 132.000 156.000 117.673 156.000 100.000 C 156.000 82.327 170.327 68.000 188.000 68.000 L 208.000 68.000 C 223.464 68.000 236.000 80.536 236.000 96.000 C 236.000 98.209 234.209 100.000 232.000 100.000 C 229.791 100.000 228.000 98.209 228.000 96.000 C 228.000 84.954 219.046 76.000 208.000 76.000 L 188.000 76.000 C 174.745 76.000 164.000 86.745 164.000 100.000 C 164.000 113.255 174.745 124.000 188.000 124.000 L 208.000 124.000 C 227.882 124.000 244.000 140.118 244.000 160.000 Z"),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
