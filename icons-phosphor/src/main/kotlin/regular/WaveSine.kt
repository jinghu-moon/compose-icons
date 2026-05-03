package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorRegularIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.240 131.400 C 217.240 178.200 197.840 200.000 178.040 200.000 C 152.940 200.000 137.310 166.680 120.760 131.400 C 107.700 103.560 92.900 72.000 78.000 72.000 C 61.600 72.000 41.690 109.210 31.280 131.400 C 29.353 135.311 24.649 136.959 20.703 135.106 C 16.757 133.253 15.021 128.580 16.800 124.600 C 38.710 77.800 58.160 56.000 78.000 56.000 C 103.100 56.000 118.730 89.320 135.280 124.600 C 148.300 152.440 163.100 184.000 178.000 184.000 C 194.400 184.000 214.310 146.790 224.720 124.600 C 226.647 120.689 231.351 119.041 235.297 120.894 C 239.243 122.748 240.979 127.420 239.200 131.400 Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
