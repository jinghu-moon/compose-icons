package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorThinIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.070 49.480 C 239.859 46.064 236.069 44.001 232.000 44.000 L 88.810 44.000 C 84.066 43.978 79.755 46.753 77.810 51.080 L 13.010 195.080 C 11.338 198.800 11.670 203.116 13.891 206.537 C 16.113 209.957 19.921 212.015 24.000 212.000 L 167.190 212.000 C 171.916 212.002 176.202 209.230 178.140 204.920 L 242.940 60.920 C 244.610 57.206 244.282 52.899 242.070 49.480 ZM 235.640 57.640 L 170.840 201.640 C 170.194 203.077 168.765 204.001 167.190 204.000 L 24.000 204.000 C 22.643 204.001 21.378 203.313 20.640 202.173 C 19.903 201.034 19.793 199.598 20.350 198.360 L 85.150 54.360 C 85.797 52.920 87.231 51.995 88.810 52.000 L 232.000 52.000 C 233.357 51.999 234.622 52.687 235.360 53.827 C 236.097 54.966 236.206 56.402 235.650 57.640 Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
