package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorLightIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.000 118.000 L 216.000 118.000 C 222.666 118.010 228.415 113.318 229.741 106.785 C 231.067 100.252 227.602 93.690 221.460 91.100 L 221.350 91.100 L 61.400 27.100 C 57.081 25.294 52.146 25.767 48.248 28.359 C 44.350 30.951 42.006 35.319 42.000 40.000 L 42.000 104.000 C 42.000 111.732 48.268 118.000 56.000 118.000 ZM 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 C 56.271 37.999 56.540 38.054 56.790 38.160 L 56.900 38.210 L 216.820 102.210 C 217.640 102.617 218.079 103.529 217.885 104.424 C 217.691 105.319 216.915 105.968 216.000 106.000 L 56.000 106.000 C 54.895 106.000 54.000 105.105 54.000 104.000 ZM 216.000 138.000 L 56.000 138.000 C 48.268 138.000 42.000 144.268 42.000 152.000 L 42.000 216.000 C 42.000 220.682 44.341 225.054 48.237 227.650 C 52.133 230.246 57.069 230.723 61.390 228.920 L 221.390 164.920 L 221.500 164.870 C 227.610 162.254 231.038 155.704 229.705 149.193 C 228.373 142.682 222.646 138.005 216.000 138.000 ZM 216.820 153.830 L 56.900 217.830 L 56.790 217.880 C 56.165 218.149 55.446 218.082 54.882 217.701 C 54.318 217.321 53.985 216.680 54.000 216.000 L 54.000 152.000 C 54.000 150.895 54.895 150.000 56.000 150.000 L 216.000 150.000 C 216.948 149.994 217.770 150.654 217.969 151.581 C 218.167 152.508 217.688 153.448 216.820 153.830 Z"),
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
