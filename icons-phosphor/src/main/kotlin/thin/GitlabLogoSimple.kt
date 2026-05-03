package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorThinIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.270 118.110 L 206.380 42.000 C 205.521 38.621 202.559 36.198 199.077 36.026 C 195.595 35.853 192.408 37.973 191.220 41.250 L 172.570 92.000 L 83.430 92.000 L 64.780 41.240 C 63.590 37.963 60.401 35.845 56.919 36.020 C 53.437 36.195 50.476 38.620 49.620 42.000 L 29.730 118.110 C 24.145 139.413 32.274 161.955 50.170 174.790 L 123.440 226.550 C 126.173 228.482 129.827 228.482 132.560 226.550 L 205.830 174.790 C 223.726 161.955 231.855 139.413 226.270 118.110 ZM 201.220 168.250 L 128.000 220.000 L 54.780 168.250 C 39.601 157.347 32.717 138.214 37.470 120.140 L 57.310 44.140 L 76.890 97.380 C 77.468 98.952 78.965 99.998 80.640 100.000 L 175.360 100.000 C 177.035 99.998 178.532 98.952 179.110 97.380 L 198.680 44.160 L 218.530 120.160 C 223.274 138.228 216.391 157.350 201.220 168.250 Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
