package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorThinIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 20.000 L 120.000 20.000 C 91.295 20.033 68.033 43.295 68.000 72.000 L 68.000 76.000 L 56.000 76.000 C 40.536 76.000 28.000 88.536 28.000 104.000 L 28.000 133.190 C 27.999 135.916 28.927 138.561 30.630 140.690 C 30.730 140.810 30.830 140.930 30.940 141.040 L 68.000 177.670 L 68.000 216.000 C 68.000 222.627 73.373 228.000 80.000 228.000 L 192.000 228.000 C 198.627 228.000 204.000 222.627 204.000 216.000 L 204.000 176.560 L 219.540 122.180 C 219.842 121.106 219.997 119.996 220.000 118.880 L 220.000 72.000 C 219.967 43.295 196.705 20.033 168.000 20.000 ZM 212.000 118.880 C 212.000 119.252 211.950 119.622 211.850 119.980 L 196.150 174.900 C 196.050 175.258 196.000 175.628 196.000 176.000 L 196.000 216.000 C 196.000 218.209 194.209 220.000 192.000 220.000 L 80.000 220.000 C 77.791 220.000 76.000 218.209 76.000 216.000 L 76.000 176.000 C 75.998 174.932 75.570 173.910 74.810 173.160 L 36.760 135.540 C 36.265 134.856 35.999 134.034 36.000 133.190 L 36.000 104.000 C 36.000 92.954 44.954 84.000 56.000 84.000 L 68.000 84.000 L 68.000 104.000 C 68.000 106.209 69.791 108.000 72.000 108.000 C 74.209 108.000 76.000 106.209 76.000 104.000 L 76.000 72.000 C 76.028 47.711 95.711 28.028 120.000 28.000 L 168.000 28.000 C 192.289 28.028 211.972 47.711 212.000 72.000 ZM 169.790 163.580 L 145.000 176.000 L 169.840 188.420 C 171.817 189.409 172.619 191.813 171.630 193.790 C 170.641 195.767 168.237 196.569 166.260 195.580 L 136.000 180.470 L 105.790 195.580 C 103.813 196.569 101.409 195.767 100.420 193.790 C 99.431 191.813 100.233 189.409 102.210 188.420 L 127.050 176.000 L 102.210 163.580 C 100.233 162.591 99.431 160.187 100.420 158.210 C 101.409 156.233 103.813 155.431 105.790 156.420 L 136.000 171.530 L 166.210 156.420 C 168.187 155.431 170.591 156.233 171.580 158.210 C 172.569 160.187 171.767 162.591 169.790 163.580 Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
