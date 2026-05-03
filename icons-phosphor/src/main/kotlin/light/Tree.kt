package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorLightIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.550 64.090 C 185.210 36.202 158.106 17.963 128.000 17.963 C 97.894 17.963 70.790 36.202 59.450 64.090 C 34.253 75.264 18.006 100.236 18.000 127.800 C 17.900 164.910 49.130 197.000 86.190 198.000 C 98.701 198.292 111.063 195.241 122.000 189.160 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 189.160 C 144.399 194.945 156.100 197.987 168.000 198.000 L 169.770 198.000 C 206.870 197.000 238.100 164.900 238.000 127.800 C 237.994 100.236 221.747 75.264 196.550 64.090 ZM 169.500 186.000 C 156.779 186.335 144.302 182.469 134.000 175.000 L 134.000 131.710 L 178.680 109.370 C 181.646 107.890 182.850 104.286 181.370 101.320 C 179.890 98.354 176.286 97.150 173.320 98.630 L 134.000 118.290 L 134.000 88.000 C 134.000 84.686 131.314 82.000 128.000 82.000 C 124.686 82.000 122.000 84.686 122.000 88.000 L 122.000 142.290 L 82.680 122.630 C 79.714 121.150 76.110 122.354 74.630 125.320 C 73.150 128.286 74.354 131.890 77.320 133.370 L 122.000 155.710 L 122.000 175.000 C 111.691 182.455 99.219 186.320 86.500 186.000 C 55.790 185.230 29.920 158.600 30.000 127.860 C 29.999 104.213 44.406 82.952 66.370 74.190 C 67.946 73.553 69.178 72.277 69.760 70.680 C 78.691 46.217 101.958 29.943 128.000 29.943 C 154.042 29.943 177.309 46.217 186.240 70.680 C 186.822 72.277 188.054 73.553 189.630 74.190 C 211.585 82.946 225.992 104.193 226.000 127.830 C 226.080 158.580 200.210 185.200 169.500 186.000 Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
