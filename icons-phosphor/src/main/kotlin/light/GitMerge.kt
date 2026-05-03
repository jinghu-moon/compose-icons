package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorLightIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 114.000 C 194.058 114.003 181.955 123.611 178.790 137.190 L 134.790 130.910 C 132.387 130.568 130.190 129.363 128.610 127.520 L 91.180 83.830 C 104.988 78.271 112.631 63.428 109.137 48.959 C 105.643 34.490 92.068 24.771 77.245 26.126 C 62.422 27.480 50.834 39.499 50.020 54.361 C 49.206 69.224 59.413 82.435 74.000 85.400 L 74.000 170.600 C 58.910 173.680 48.604 187.686 50.152 203.009 C 51.700 218.332 64.599 229.994 80.000 229.994 C 95.401 229.994 108.300 218.332 109.848 203.009 C 111.396 187.686 101.090 173.680 86.000 170.600 L 86.000 96.220 L 119.520 135.330 C 122.997 139.385 127.831 142.037 133.120 142.790 L 178.470 149.270 C 181.260 164.907 195.755 175.658 211.528 173.792 C 227.302 171.926 238.887 158.089 237.951 142.233 C 237.016 126.377 223.884 113.998 208.000 114.000 ZM 62.000 56.000 C 62.000 46.059 70.059 38.000 80.000 38.000 C 89.941 38.000 98.000 46.059 98.000 56.000 C 98.000 65.941 89.941 74.000 80.000 74.000 C 70.059 74.000 62.000 65.941 62.000 56.000 ZM 98.000 200.000 C 98.000 209.941 89.941 218.000 80.000 218.000 C 70.059 218.000 62.000 209.941 62.000 200.000 C 62.000 190.059 70.059 182.000 80.000 182.000 C 89.941 182.000 98.000 190.059 98.000 200.000 ZM 208.000 162.000 C 198.059 162.000 190.000 153.941 190.000 144.000 C 190.000 134.059 198.059 126.000 208.000 126.000 C 217.941 126.000 226.000 134.059 226.000 144.000 C 226.000 153.941 217.941 162.000 208.000 162.000 Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
