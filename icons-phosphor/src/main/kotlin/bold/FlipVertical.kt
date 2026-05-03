package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorBoldIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.000 120.000 L 216.000 120.000 C 225.513 119.999 233.709 113.298 235.600 103.974 C 237.490 94.651 232.552 85.286 223.790 81.580 L 223.330 81.390 L 63.510 21.470 C 57.346 18.973 50.343 19.703 44.827 23.419 C 39.310 27.134 36.002 33.349 36.000 40.000 L 36.000 100.000 C 36.000 111.046 44.954 120.000 56.000 120.000 ZM 60.000 45.790 L 193.910 96.000 L 60.000 96.000 ZM 216.000 136.000 L 56.000 136.000 C 44.954 136.000 36.000 144.954 36.000 156.000 L 36.000 216.000 C 35.999 222.653 39.306 228.871 44.823 232.589 C 50.340 236.307 57.344 237.038 63.510 234.540 L 223.320 174.620 L 223.780 174.430 C 232.553 170.732 237.504 161.363 235.615 152.032 C 233.726 142.700 225.521 135.994 216.000 136.000 ZM 60.000 210.220 L 60.000 160.000 L 193.910 160.000 Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
