package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorDuotoneIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 182.480 162.500 C 151.812 191.194 104.148 191.194 73.480 162.500 C 58.147 148.021 52.276 126.140 58.300 105.930 L 59.870 100.620 L 59.870 100.620 C 72.490 95.210 95.200 91.400 128.000 108.000 C 163.860 126.160 187.670 119.890 199.420 113.840 L 199.420 113.840 C 202.062 131.853 195.737 150.022 182.480 162.500 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 205.330 103.670 L 183.560 29.740 C 182.558 26.338 179.436 24.002 175.890 24.000 L 80.110 24.000 C 76.564 24.002 73.442 26.338 72.440 29.740 L 50.670 103.670 C 43.702 126.785 50.455 151.852 68.090 168.340 C 82.312 181.675 100.584 189.873 120.000 191.630 L 120.000 232.000 L 88.000 232.000 C 83.582 232.000 80.000 235.582 80.000 240.000 C 80.000 244.418 83.582 248.000 88.000 248.000 L 168.000 248.000 C 172.418 248.000 176.000 244.418 176.000 240.000 C 176.000 235.582 172.418 232.000 168.000 232.000 L 136.000 232.000 L 136.000 191.630 C 155.417 189.874 173.689 181.676 187.910 168.340 C 205.541 151.849 212.293 126.785 205.330 103.670 ZM 86.090 40.000 L 169.910 40.000 L 190.000 108.190 C 190.090 108.490 190.170 108.790 190.250 109.090 C 168.830 116.770 144.710 107.490 131.620 100.860 C 106.430 88.110 86.430 86.490 71.680 88.930 ZM 177.000 156.650 C 149.433 182.463 106.567 182.463 79.000 156.650 C 65.804 144.283 60.765 125.501 66.000 108.190 L 66.450 106.670 C 78.450 102.610 97.520 101.530 124.380 115.140 C 135.530 120.790 153.540 127.990 172.810 127.990 C 179.251 128.021 185.663 127.146 191.860 125.390 C 191.044 137.316 185.733 148.488 177.000 156.650 Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
