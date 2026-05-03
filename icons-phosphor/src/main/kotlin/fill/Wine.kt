package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorFillIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.330 103.670 L 183.560 29.740 C 182.558 26.338 179.436 24.002 175.890 24.000 L 80.110 24.000 C 76.564 24.002 73.442 26.338 72.440 29.740 L 50.670 103.670 C 43.702 126.785 50.455 151.852 68.090 168.340 C 82.312 181.675 100.584 189.873 120.000 191.630 L 120.000 232.000 L 88.000 232.000 C 83.582 232.000 80.000 235.582 80.000 240.000 C 80.000 244.418 83.582 248.000 88.000 248.000 L 168.000 248.000 C 172.418 248.000 176.000 244.418 176.000 240.000 C 176.000 235.582 172.418 232.000 168.000 232.000 L 136.000 232.000 L 136.000 191.630 C 155.417 189.874 173.689 181.676 187.910 168.340 C 205.541 151.849 212.293 126.785 205.330 103.670 ZM 86.090 40.000 L 169.910 40.000 L 190.000 108.190 C 190.090 108.490 190.170 108.790 190.250 109.090 C 168.830 116.770 144.710 107.490 131.620 100.860 C 106.430 88.110 86.430 86.490 71.680 88.930 Z"),
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
