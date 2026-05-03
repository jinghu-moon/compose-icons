package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorThinIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.680 64.730 L 193.910 36.490 L 193.910 36.490 C 193.324 36.170 192.668 36.001 192.000 36.000 L 160.000 36.000 C 157.791 36.000 156.000 37.791 156.000 40.000 C 156.000 55.464 143.464 68.000 128.000 68.000 C 112.536 68.000 100.000 55.464 100.000 40.000 C 100.000 37.791 98.209 36.000 96.000 36.000 L 64.000 36.000 C 63.335 36.006 62.682 36.178 62.100 36.500 L 62.100 36.500 L 10.320 64.730 C 4.556 67.741 2.319 74.851 5.320 80.620 L 24.600 117.430 C 26.758 121.496 30.996 124.028 35.600 124.000 L 60.000 124.000 L 60.000 208.000 C 60.000 214.627 65.373 220.000 72.000 220.000 L 184.000 220.000 C 190.627 220.000 196.000 214.627 196.000 208.000 L 196.000 124.000 L 220.330 124.000 C 224.934 124.028 229.172 121.496 231.330 117.430 L 250.610 80.620 C 253.621 74.869 251.418 67.766 245.680 64.730 ZM 35.670 116.000 C 34.017 116.040 32.478 115.163 31.670 113.720 L 12.440 76.910 C 11.971 76.003 11.888 74.944 12.209 73.975 C 12.531 73.005 13.231 72.206 14.150 71.760 L 60.000 46.740 L 60.000 116.000 ZM 188.000 208.000 C 188.000 210.209 186.209 212.000 184.000 212.000 L 72.000 212.000 C 69.791 212.000 68.000 210.209 68.000 208.000 L 68.000 44.000 L 92.220 44.000 C 94.245 62.232 109.656 76.026 128.000 76.026 C 146.344 76.026 161.755 62.232 163.780 44.000 L 188.000 44.000 ZM 243.560 76.910 L 224.290 113.720 C 223.482 115.163 221.943 116.040 220.290 116.000 L 196.000 116.000 L 196.000 46.740 L 241.850 71.740 C 242.774 72.186 243.478 72.988 243.800 73.963 C 244.122 74.937 244.036 76.001 243.560 76.910 Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
