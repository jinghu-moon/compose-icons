package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorRegularIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 186.660 59.560 C 168.470 32.290 146.540 16.000 128.000 16.000 C 109.460 16.000 87.530 32.290 69.340 59.560 C 50.700 87.540 40.000 121.230 40.000 152.000 C 40.000 200.601 79.399 240.000 128.000 240.000 C 176.601 240.000 216.000 200.601 216.000 152.000 C 216.000 121.230 205.300 87.540 186.660 59.560 ZM 128.000 224.000 C 88.254 223.956 56.044 191.746 56.000 152.000 C 56.000 124.310 65.720 93.850 82.660 68.440 C 97.190 46.640 115.410 32.000 128.000 32.000 C 137.500 32.000 150.200 40.330 162.100 53.780 L 122.000 98.670 C 120.134 100.756 119.493 103.665 120.311 106.342 C 121.129 109.019 123.287 111.074 126.000 111.760 L 150.600 117.910 L 144.100 150.430 C 143.235 154.759 146.042 158.971 150.370 159.840 C 150.906 159.951 151.453 160.004 152.000 160.000 C 155.808 159.993 159.083 157.304 159.830 153.570 L 167.830 113.570 C 168.668 109.384 166.071 105.278 161.930 104.240 L 142.770 99.450 L 172.100 66.600 C 172.520 67.210 172.930 67.820 173.340 68.440 C 190.280 93.850 200.000 124.310 200.000 152.000 C 199.956 191.746 167.746 223.956 128.000 224.000 Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
