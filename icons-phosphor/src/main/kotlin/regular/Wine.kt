package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorRegularIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.330 103.670 L 183.560 29.740 C 182.558 26.338 179.436 24.002 175.890 24.000 L 80.110 24.000 C 76.564 24.002 73.442 26.338 72.440 29.740 L 50.670 103.670 C 43.702 126.785 50.455 151.852 68.090 168.340 C 82.311 181.676 100.583 189.874 120.000 191.630 L 120.000 232.000 L 88.000 232.000 C 83.582 232.000 80.000 235.582 80.000 240.000 C 80.000 244.418 83.582 248.000 88.000 248.000 L 168.000 248.000 C 172.418 248.000 176.000 244.418 176.000 240.000 C 176.000 235.582 172.418 232.000 168.000 232.000 L 136.000 232.000 L 136.000 191.630 C 155.416 189.873 173.688 181.675 187.910 168.340 C 205.545 151.852 212.298 126.785 205.330 103.670 ZM 86.090 40.000 L 169.910 40.000 L 190.000 108.190 C 190.090 108.490 190.170 108.790 190.250 109.090 C 168.830 116.770 144.710 107.490 131.620 100.860 C 106.430 88.110 86.430 86.490 71.680 88.930 ZM 177.000 156.650 C 149.433 182.463 106.567 182.463 79.000 156.650 C 65.804 144.283 60.765 125.501 66.000 108.190 L 66.450 106.670 C 78.450 102.610 97.520 101.530 124.380 115.140 C 135.530 120.790 153.540 127.990 172.810 127.990 C 179.251 128.021 185.663 127.146 191.860 125.390 C 191.044 137.316 185.733 148.488 177.000 156.650 Z"),
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
