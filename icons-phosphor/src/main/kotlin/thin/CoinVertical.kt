package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorThinIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 195.050 58.100 C 183.730 38.690 168.440 28.000 152.000 28.000 L 104.000 28.000 C 87.560 28.000 72.270 38.690 61.000 58.100 C 50.000 76.840 44.000 101.660 44.000 128.000 C 44.000 154.340 50.000 179.160 61.000 197.900 C 72.270 217.310 87.560 228.000 104.000 228.000 L 152.000 228.000 C 168.440 228.000 183.730 217.310 195.050 197.900 C 206.000 179.160 212.000 154.340 212.000 128.000 C 212.000 101.660 206.000 76.840 195.050 58.100 ZM 191.270 188.000 L 152.100 188.000 C 159.340 171.860 163.470 152.470 163.940 132.000 L 203.940 132.000 C 203.440 152.770 199.000 172.280 191.270 188.000 ZM 163.940 124.000 C 163.470 103.530 159.340 84.140 152.100 68.000 L 191.270 68.000 C 199.010 83.720 203.440 103.230 203.940 124.000 ZM 152.000 36.000 C 164.890 36.000 177.190 44.510 186.840 60.000 L 148.110 60.000 C 147.760 59.370 147.410 58.720 147.050 58.100 C 141.470 48.540 134.930 41.100 127.760 36.000 ZM 67.860 193.870 C 57.630 176.340 52.000 153.000 52.000 128.000 C 52.000 103.000 57.630 79.660 67.860 62.130 C 77.690 45.280 90.520 36.000 104.000 36.000 C 117.480 36.000 130.310 45.280 140.140 62.130 C 150.370 79.660 156.000 103.050 156.000 128.000 C 156.000 152.950 150.370 176.340 140.140 193.870 C 130.310 210.720 117.480 220.000 104.000 220.000 C 90.520 220.000 77.690 210.720 67.860 193.870 ZM 152.000 220.000 L 127.760 220.000 C 134.930 214.910 141.470 207.460 147.050 197.900 C 147.410 197.280 147.760 196.630 148.110 196.000 L 186.840 196.000 C 177.190 211.490 164.890 220.000 152.000 220.000 Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
