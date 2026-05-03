package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorDuotoneIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 88.000 L 176.000 104.000 L 160.000 144.000 L 136.650 153.340 L 97.650 114.340 C 96.149 112.838 94.113 111.994 91.990 111.994 C 89.867 111.994 87.831 112.838 86.330 114.340 L 32.000 168.690 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 104.000 216.000 C 107.444 216.000 110.501 213.797 111.590 210.530 L 126.420 166.050 L 163.000 151.430 C 165.030 150.610 166.640 149.000 167.460 146.970 L 182.080 110.420 L 226.560 95.590 C 229.815 94.491 232.005 91.436 232.000 88.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 112.410 157.470 L 98.230 200.000 L 40.000 200.000 L 40.000 172.000 L 92.000 120.000 L 122.420 150.420 L 117.000 152.570 C 114.825 153.451 113.147 155.243 112.410 157.470 ZM 216.000 82.230 L 173.470 96.410 C 171.236 97.154 169.444 98.844 168.570 101.030 L 153.850 137.850 L 138.580 144.000 L 103.310 108.730 C 97.062 102.487 86.938 102.487 80.690 108.730 L 40.000 149.370 L 40.000 56.000 L 216.000 56.000 ZM 228.680 115.230 C 226.593 113.725 223.910 113.316 221.470 114.130 L 197.670 122.070 C 195.439 122.812 193.646 124.498 192.770 126.680 L 178.460 162.450 L 142.690 176.760 C 140.508 177.636 138.822 179.429 138.080 181.660 L 130.140 205.460 C 129.323 207.901 129.730 210.586 131.234 212.675 C 132.738 214.764 135.156 216.001 137.730 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 121.730 C 232.001 119.159 230.765 116.744 228.680 115.240 ZM 216.000 200.000 L 148.830 200.000 L 152.080 190.250 L 187.590 176.050 C 189.620 175.230 191.230 173.620 192.050 171.590 L 206.250 136.080 L 216.000 132.830 Z"),
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
