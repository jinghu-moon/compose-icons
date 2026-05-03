package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorRegularIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 40.000 L 179.310 40.000 L 165.660 26.340 L 165.660 26.340 C 164.158 24.840 162.122 23.998 160.000 24.000 L 96.000 24.000 C 93.878 23.998 91.842 24.840 90.340 26.340 L 90.340 26.340 L 76.690 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 200.000 224.000 C 208.837 224.000 216.000 216.837 216.000 208.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 128.000 65.580 L 111.000 40.000 L 145.100 40.000 ZM 161.240 44.580 L 168.000 51.310 L 168.000 104.000 L 138.570 78.560 ZM 88.000 51.310 L 94.760 44.560 L 117.430 78.560 L 88.000 104.000 ZM 56.000 56.000 L 72.000 56.000 L 72.000 104.000 C 71.962 110.219 75.563 115.885 81.210 118.490 C 83.336 119.482 85.654 119.997 88.000 120.000 C 91.733 119.993 95.344 118.673 98.200 116.270 C 98.241 116.242 98.278 116.208 98.310 116.170 L 120.000 97.480 L 120.000 208.000 L 56.000 208.000 ZM 200.000 208.000 L 136.000 208.000 L 136.000 97.480 L 157.650 116.180 C 157.682 116.218 157.719 116.252 157.760 116.280 C 160.628 118.688 164.255 120.005 168.000 120.000 C 170.362 119.994 172.694 119.468 174.830 118.460 C 180.451 115.848 184.034 110.198 184.000 104.000 L 184.000 56.000 L 200.000 56.000 Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
