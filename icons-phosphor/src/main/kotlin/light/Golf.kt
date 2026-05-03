package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorLightIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 100.000 C 174.000 105.523 169.523 110.000 164.000 110.000 C 158.477 110.000 154.000 105.523 154.000 100.000 C 154.000 94.477 158.477 90.000 164.000 90.000 C 169.523 90.000 174.000 94.477 174.000 100.000 ZM 132.000 122.000 C 126.477 122.000 122.000 126.477 122.000 132.000 C 122.000 137.523 126.477 142.000 132.000 142.000 C 137.523 142.000 142.000 137.523 142.000 132.000 C 142.000 126.477 137.523 122.000 132.000 122.000 ZM 214.000 96.000 C 214.000 143.496 175.496 182.000 128.000 182.000 C 80.504 182.000 42.000 143.496 42.000 96.000 C 42.000 48.504 80.504 10.000 128.000 10.000 C 175.474 10.055 213.945 48.526 214.000 96.000 ZM 202.000 96.000 C 202.000 55.131 168.869 22.000 128.000 22.000 C 87.131 22.000 54.000 55.131 54.000 96.000 C 54.000 136.869 87.131 170.000 128.000 170.000 C 168.849 169.950 201.950 136.849 202.000 96.000 ZM 165.860 194.400 C 152.480 199.510 140.090 202.000 128.000 202.000 C 115.910 202.000 103.520 199.510 90.140 194.400 C 88.117 193.530 85.780 193.839 84.051 195.204 C 82.323 196.569 81.482 198.771 81.859 200.941 C 82.237 203.110 83.772 204.899 85.860 205.600 C 97.420 210.156 109.606 212.925 122.000 213.810 L 122.000 248.000 C 122.000 251.314 124.686 254.000 128.000 254.000 C 131.314 254.000 134.000 251.314 134.000 248.000 L 134.000 213.810 C 146.394 212.925 158.580 210.156 170.140 205.600 C 173.097 204.329 174.524 200.952 173.375 197.946 C 172.226 194.940 168.911 193.375 165.860 194.400 Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
