package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorThinIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 80.290 C 131.291 72.936 115.208 75.174 104.990 85.720 C 94.773 96.265 93.043 112.411 100.795 124.881 C 108.548 137.351 123.792 142.946 137.770 138.450 L 116.570 174.000 C 115.440 175.895 116.058 178.346 117.950 179.480 C 118.553 179.847 119.244 180.044 119.950 180.050 C 121.357 180.048 122.659 179.308 123.380 178.100 L 155.710 124.000 C 164.545 108.696 159.303 89.127 144.000 80.290 ZM 148.800 120.000 L 148.740 120.090 C 141.791 130.459 127.757 133.240 117.379 126.304 C 107.002 119.367 104.204 105.336 111.128 94.950 C 118.052 84.565 132.080 81.750 142.474 88.662 C 152.868 95.573 155.699 109.598 148.800 120.000 ZM 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
