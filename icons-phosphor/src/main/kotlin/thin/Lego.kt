package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorThinIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.790 76.420 L 194.370 52.710 C 189.840 42.920 176.360 36.000 160.000 36.000 C 139.810 36.000 124.000 46.540 124.000 60.000 C 124.013 62.950 124.770 65.850 126.200 68.430 L 101.650 80.700 C 94.885 77.507 87.480 75.899 80.000 76.000 C 59.810 76.000 44.000 86.540 44.000 100.000 C 44.013 102.950 44.770 105.850 46.200 108.430 L 14.200 124.430 C 12.852 125.109 12.001 126.490 12.000 128.000 L 12.000 192.000 C 11.999 193.516 12.855 194.902 14.210 195.580 L 78.210 227.580 C 79.337 228.144 80.663 228.144 81.790 227.580 L 241.790 147.580 C 243.145 146.902 244.001 145.516 244.000 144.000 L 244.000 80.000 C 244.001 78.484 243.145 77.098 241.790 76.420 ZM 160.000 44.000 C 175.180 44.000 188.000 51.330 188.000 60.000 C 188.000 68.670 175.180 76.000 160.000 76.000 C 144.820 76.000 132.000 68.670 132.000 60.000 C 132.000 51.330 144.820 44.000 160.000 44.000 ZM 131.430 74.760 C 138.000 80.410 148.230 84.000 160.000 84.000 C 179.000 84.000 194.090 74.680 195.830 62.390 L 231.060 80.000 L 80.000 155.530 L 24.940 128.000 L 51.430 114.760 C 58.000 120.410 68.230 124.000 80.000 124.000 C 100.190 124.000 116.000 113.460 116.000 100.000 C 116.000 94.660 113.510 89.790 109.250 85.850 ZM 80.000 84.000 C 95.180 84.000 108.000 91.330 108.000 100.000 C 108.000 108.670 95.180 116.000 80.000 116.000 C 69.510 116.000 60.150 112.500 55.370 107.480 C 55.280 107.360 55.180 107.270 55.090 107.170 C 53.194 105.255 52.090 102.694 52.000 100.000 C 52.000 91.330 64.820 84.000 80.000 84.000 ZM 20.000 134.470 L 76.000 162.470 L 76.000 217.530 L 20.000 189.530 ZM 84.000 217.530 L 84.000 162.470 L 236.000 86.470 L 236.000 141.530 Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
