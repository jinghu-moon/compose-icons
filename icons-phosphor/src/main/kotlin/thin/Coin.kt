package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorThinIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.790 67.420 C 185.900 57.480 158.270 52.000 128.000 52.000 C 97.730 52.000 70.100 57.480 50.210 67.420 C 31.000 77.000 20.000 90.350 20.000 104.000 L 20.000 152.000 C 20.000 165.650 31.000 179.000 50.210 188.580 C 70.100 198.520 97.730 204.000 128.000 204.000 C 158.270 204.000 185.900 198.520 205.790 188.580 C 225.000 179.000 236.000 165.650 236.000 152.000 L 236.000 104.000 C 236.000 90.350 225.000 77.000 205.790 67.420 ZM 128.000 60.000 C 189.770 60.000 228.000 82.840 228.000 104.000 C 228.000 125.160 189.770 148.000 128.000 148.000 C 66.230 148.000 28.000 125.160 28.000 104.000 C 28.000 82.840 66.230 60.000 128.000 60.000 ZM 124.000 156.000 L 124.000 196.000 C 102.000 195.650 83.060 192.350 68.000 187.290 L 68.000 147.650 C 84.230 152.750 103.440 155.620 124.000 156.000 ZM 132.000 156.000 C 152.560 155.670 171.770 152.800 188.000 147.700 L 188.000 187.290 C 172.940 192.350 154.050 195.650 132.000 196.000 ZM 28.000 152.000 L 28.000 123.920 C 33.150 130.110 40.670 135.810 50.210 140.580 C 53.290 142.120 56.570 143.530 60.000 144.860 L 60.000 184.240 C 39.490 175.670 28.000 163.590 28.000 152.000 ZM 228.000 152.000 C 228.000 163.590 216.510 175.670 196.000 184.240 L 196.000 144.860 C 199.430 143.530 202.710 142.120 205.790 140.580 C 215.330 135.810 222.850 130.110 228.000 123.920 Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
