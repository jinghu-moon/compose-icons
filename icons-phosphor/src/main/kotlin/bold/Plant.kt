package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorBoldIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 255.620 51.650 C 255.261 45.581 250.419 40.739 244.350 40.380 C 191.080 37.250 148.150 53.740 129.510 84.520 C 117.370 104.520 116.950 128.690 128.050 151.820 C 122.648 158.712 118.492 166.496 115.770 174.820 L 103.110 162.160 C 110.300 145.390 109.540 128.050 100.710 113.470 C 86.730 90.360 54.890 78.000 15.550 80.270 C 9.477 80.630 4.634 85.477 4.280 91.550 C 2.000 130.890 14.360 162.730 37.450 176.710 C 45.281 181.483 54.279 183.999 63.450 183.980 C 71.269 183.916 78.993 182.259 86.150 179.110 L 112.000 205.000 L 112.000 228.000 C 112.000 234.627 117.373 240.000 124.000 240.000 C 130.627 240.000 136.000 234.627 136.000 228.000 L 136.000 198.510 C 135.975 187.783 139.292 177.315 145.490 168.560 C 155.530 173.315 166.482 175.837 177.590 175.950 C 189.542 175.977 201.270 172.703 211.480 166.490 C 242.250 147.850 258.760 104.920 255.620 51.650 ZM 49.880 156.180 C 36.690 148.180 28.700 128.720 28.050 104.050 C 52.720 104.700 72.190 112.690 80.180 125.880 C 83.305 130.962 84.586 136.965 83.810 142.880 L 72.480 131.510 C 67.786 126.816 60.174 126.816 55.480 131.510 C 50.786 136.204 50.786 143.816 55.480 148.510 L 66.820 159.850 C 60.921 160.578 54.949 159.285 49.880 156.180 ZM 199.050 146.000 C 188.390 152.450 176.050 153.670 163.240 149.760 L 200.490 112.520 C 205.184 107.826 205.184 100.214 200.490 95.520 C 195.796 90.826 188.184 90.826 183.490 95.520 L 146.240 132.760 C 142.370 120.000 143.590 107.610 150.000 97.000 C 162.700 76.000 192.650 64.000 231.320 64.000 L 232.000 64.000 C 232.140 103.000 220.140 133.180 199.050 146.000 Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
