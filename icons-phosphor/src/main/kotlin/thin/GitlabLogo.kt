package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorThinIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.270 118.110 L 206.380 42.000 C 205.521 38.621 202.559 36.198 199.077 36.026 C 195.595 35.853 192.408 37.973 191.220 41.250 L 172.570 92.000 L 83.430 92.000 L 64.780 41.240 C 63.590 37.963 60.401 35.845 56.919 36.020 C 53.437 36.195 50.476 38.620 49.620 42.000 L 29.730 118.110 C 24.145 139.413 32.274 161.955 50.170 174.790 L 123.440 226.550 C 126.173 228.482 129.827 228.482 132.560 226.550 L 205.830 174.790 C 223.726 161.955 231.855 139.413 226.270 118.110 ZM 57.270 44.110 L 76.890 97.380 C 77.468 98.952 78.965 99.998 80.640 100.000 L 175.360 100.000 C 177.035 99.998 178.532 98.952 179.110 97.380 L 198.680 44.160 L 215.680 109.160 L 128.000 171.110 L 40.330 109.170 ZM 37.430 120.110 L 38.130 117.410 L 121.070 176.000 L 93.410 195.540 L 54.780 168.250 C 39.601 157.347 32.717 138.214 37.470 120.140 ZM 128.000 220.000 L 100.340 200.460 L 128.000 180.900 L 155.660 200.440 ZM 201.220 168.270 L 162.590 195.560 L 134.930 176.000 L 217.830 117.440 L 218.530 120.140 C 223.283 138.214 216.399 157.347 201.220 168.250 Z"),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
