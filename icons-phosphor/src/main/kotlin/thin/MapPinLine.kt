package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorThinIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 228.000 L 139.720 228.000 C 150.968 218.754 161.430 208.593 171.000 197.620 C 197.810 166.790 212.000 134.420 212.000 104.000 C 212.000 57.608 174.392 20.000 128.000 20.000 C 81.608 20.000 44.000 57.608 44.000 104.000 C 44.000 134.420 58.170 166.790 85.000 197.620 C 94.570 208.593 105.032 218.754 116.280 228.000 L 56.000 228.000 C 53.791 228.000 52.000 229.791 52.000 232.000 C 52.000 234.209 53.791 236.000 56.000 236.000 L 200.000 236.000 C 202.209 236.000 204.000 234.209 204.000 232.000 C 204.000 229.791 202.209 228.000 200.000 228.000 ZM 90.900 192.230 C 73.150 171.800 52.000 139.900 52.000 104.000 C 52.000 62.026 86.026 28.000 128.000 28.000 C 169.974 28.000 204.000 62.026 204.000 104.000 C 204.000 139.900 182.850 171.800 165.100 192.230 C 153.924 205.029 141.496 216.677 128.000 227.000 C 114.504 216.677 102.076 205.029 90.900 192.230 ZM 164.000 104.000 C 164.000 84.118 147.882 68.000 128.000 68.000 C 108.118 68.000 92.000 84.118 92.000 104.000 C 92.000 123.882 108.118 140.000 128.000 140.000 C 147.882 140.000 164.000 123.882 164.000 104.000 ZM 100.000 104.000 C 100.000 88.536 112.536 76.000 128.000 76.000 C 143.464 76.000 156.000 88.536 156.000 104.000 C 156.000 119.464 143.464 132.000 128.000 132.000 C 112.536 132.000 100.000 119.464 100.000 104.000 Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
