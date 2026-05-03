package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorThinIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 128.000 C 244.000 149.032 231.331 167.994 211.900 176.043 C 192.468 184.091 170.102 179.642 155.230 164.770 L 155.060 164.590 L 95.000 96.800 C 77.792 79.688 49.977 79.740 32.833 96.916 C 15.689 114.093 15.689 141.907 32.833 159.084 C 49.977 176.260 77.792 176.312 95.000 159.200 L 103.600 149.480 C 105.064 147.823 107.593 147.666 109.250 149.130 C 110.907 150.594 111.064 153.123 109.600 154.780 L 100.920 164.590 L 100.750 164.770 C 80.443 185.077 47.518 185.077 27.211 164.769 C 6.904 144.462 6.904 111.538 27.211 91.231 C 47.518 70.923 80.443 70.923 100.750 91.230 L 100.920 91.410 L 160.920 159.200 C 178.128 176.312 205.943 176.260 223.087 159.084 C 240.231 141.907 240.231 114.093 223.087 96.916 C 205.943 79.740 178.128 79.688 160.920 96.800 L 152.320 106.520 C 150.856 108.177 148.327 108.334 146.670 106.870 C 145.013 105.406 144.856 102.877 146.320 101.220 L 155.000 91.410 L 155.170 91.230 C 170.036 76.315 192.431 71.838 211.888 79.893 C 231.346 87.947 244.025 106.941 244.000 128.000 Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
