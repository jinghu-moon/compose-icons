package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorLightIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.360 116.190 L 87.280 28.060 C 82.952 25.405 77.526 25.302 73.100 27.790 C 68.696 30.209 65.971 34.846 66.000 39.870 L 66.000 216.130 C 65.971 221.154 68.696 225.791 73.100 228.210 C 77.526 230.698 82.952 230.595 87.280 227.940 L 231.360 139.810 C 235.485 137.303 238.003 132.826 238.003 128.000 C 238.003 123.174 235.485 118.697 231.360 116.190 ZM 225.100 129.570 L 81.000 217.700 C 80.366 218.081 79.574 218.081 78.940 217.700 C 78.325 217.400 77.936 216.774 77.940 216.090 L 77.940 39.870 C 77.936 39.186 78.325 38.560 78.940 38.260 C 79.264 38.080 79.630 37.990 80.000 38.000 C 80.355 38.013 80.700 38.120 81.000 38.310 L 225.100 126.430 C 225.657 126.757 225.999 127.354 225.999 128.000 C 225.999 128.646 225.657 129.243 225.100 129.570 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
