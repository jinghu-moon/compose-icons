package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorBoldIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 160.000 C 251.972 184.289 232.289 203.972 208.000 204.000 L 190.570 204.000 C 167.273 203.950 146.096 190.462 136.200 169.370 L 106.050 104.780 C 100.112 92.127 87.407 84.034 73.430 84.000 L 64.000 84.000 C 44.118 84.000 28.000 100.118 28.000 120.000 L 28.000 144.000 C 28.000 163.882 44.118 180.000 64.000 180.000 L 72.000 180.000 C 83.140 180.007 93.224 173.410 97.680 163.200 C 100.331 157.125 107.405 154.349 113.480 157.000 C 119.555 159.651 122.331 166.725 119.680 172.800 C 111.406 191.757 92.684 204.008 72.000 204.000 L 64.000 204.000 C 30.879 203.961 4.039 177.121 4.000 144.000 L 4.000 120.000 C 4.039 86.879 30.879 60.039 64.000 60.000 L 73.430 60.000 C 96.727 60.050 117.904 73.538 127.800 94.630 L 158.000 159.220 C 163.931 171.857 176.611 179.947 190.570 180.000 L 208.000 180.000 C 219.046 180.000 228.000 171.046 228.000 160.000 C 228.000 148.954 219.046 140.000 208.000 140.000 L 188.000 140.000 C 165.909 140.000 148.000 122.091 148.000 100.000 C 148.000 77.909 165.909 60.000 188.000 60.000 L 208.000 60.000 C 227.882 60.000 244.000 76.118 244.000 96.000 C 244.000 102.627 238.627 108.000 232.000 108.000 C 225.373 108.000 220.000 102.627 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 L 188.000 84.000 C 179.163 84.000 172.000 91.163 172.000 100.000 C 172.000 108.837 179.163 116.000 188.000 116.000 L 208.000 116.000 C 232.289 116.028 251.972 135.711 252.000 160.000 Z"),
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
