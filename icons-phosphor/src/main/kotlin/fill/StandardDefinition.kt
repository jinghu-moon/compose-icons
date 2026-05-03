package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorFillIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 128.000 C 192.000 145.673 177.673 160.000 160.000 160.000 L 152.000 160.000 L 152.000 96.000 L 160.000 96.000 C 177.673 96.000 192.000 110.327 192.000 128.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 120.000 148.000 C 120.000 128.120 100.080 122.650 85.530 118.660 C 73.470 115.350 65.530 112.820 65.530 108.000 C 65.530 101.270 73.630 96.000 83.970 96.000 C 91.970 96.000 98.820 99.130 101.390 104.000 C 103.464 107.902 108.308 109.384 112.210 107.310 C 116.112 105.236 117.594 100.392 115.520 96.490 C 110.160 86.310 98.070 80.000 84.000 80.000 C 64.360 80.000 49.560 92.000 49.560 108.000 C 49.560 125.380 67.160 130.210 81.300 134.090 C 97.300 138.480 104.000 141.390 104.000 148.000 C 104.000 153.680 95.790 160.000 84.000 160.000 C 72.210 160.000 64.000 153.680 64.000 148.000 C 64.000 143.582 60.418 140.000 56.000 140.000 C 51.582 140.000 48.000 143.582 48.000 148.000 C 48.000 163.700 63.810 176.000 84.000 176.000 C 104.190 176.000 120.000 163.700 120.000 148.000 ZM 208.000 128.000 C 207.972 101.502 186.498 80.028 160.000 80.000 L 144.000 80.000 C 139.582 80.000 136.000 83.582 136.000 88.000 L 136.000 168.000 C 136.000 172.418 139.582 176.000 144.000 176.000 L 160.000 176.000 C 186.498 175.972 207.972 154.498 208.000 128.000 Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
