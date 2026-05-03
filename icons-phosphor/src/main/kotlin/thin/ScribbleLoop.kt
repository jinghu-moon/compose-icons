package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorThinIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.000 157.320 C 249.680 155.860 226.530 130.690 189.210 116.890 C 187.950 98.330 181.430 81.440 170.550 68.760 C 156.620 52.560 136.380 44.000 112.000 44.000 C 62.510 44.000 30.100 88.580 28.740 90.480 C 27.456 92.278 27.872 94.776 29.670 96.060 C 31.468 97.344 33.966 96.928 35.250 95.130 C 35.560 94.700 66.680 52.000 112.000 52.000 C 134.000 52.000 152.110 59.600 164.450 74.000 C 173.560 84.610 179.260 98.620 180.910 114.130 C 167.852 110.100 154.266 108.034 140.600 108.000 C 115.500 108.000 94.510 114.480 79.910 126.750 C 67.260 137.390 60.000 152.150 60.000 167.250 C 59.879 178.936 64.450 190.182 72.690 198.470 C 81.590 207.320 94.000 212.000 108.600 212.000 C 160.230 212.000 188.470 167.920 189.380 125.680 C 223.450 139.260 244.740 162.350 245.030 162.680 C 246.510 164.320 249.040 164.450 250.680 162.970 C 252.320 161.490 252.450 158.960 250.970 157.320 ZM 162.600 178.790 C 153.230 190.290 136.260 204.000 108.600 204.000 C 80.710 204.000 68.000 185.000 68.000 167.250 C 68.000 142.570 90.720 116.000 140.600 116.000 C 154.475 116.052 168.252 118.338 181.400 122.770 L 181.400 123.580 C 181.400 144.000 174.540 164.100 162.570 178.790 Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
