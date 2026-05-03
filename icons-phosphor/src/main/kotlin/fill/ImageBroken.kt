package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorFillIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 104.000 216.000 C 107.444 216.000 110.501 213.797 111.590 210.530 L 126.420 166.050 L 163.000 151.430 C 165.030 150.610 166.640 149.000 167.460 146.970 L 182.080 110.420 L 226.560 95.590 C 229.815 94.491 232.005 91.436 232.000 88.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 117.000 152.570 C 114.814 153.444 113.124 155.236 112.380 157.470 L 98.230 200.000 L 40.000 200.000 L 40.000 160.690 L 86.340 114.340 C 87.841 112.838 89.877 111.994 92.000 111.994 C 94.123 111.994 96.159 112.838 97.660 114.340 L 130.500 147.180 ZM 232.000 121.730 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 137.730 216.000 C 135.158 216.000 132.743 214.764 131.240 212.678 C 129.736 210.592 129.327 207.910 130.140 205.470 L 138.080 181.670 C 138.822 179.439 140.508 177.646 142.690 176.770 L 178.460 162.460 L 192.770 126.690 C 193.646 124.508 195.439 122.822 197.670 122.080 L 221.470 114.140 C 223.910 113.327 226.592 113.736 228.678 115.240 C 230.764 116.743 232.000 119.158 232.000 121.730 Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
