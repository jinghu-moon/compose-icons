package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorLightIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 102.000 109.500 L 102.000 37.500 C 102.001 35.552 101.056 33.724 99.465 32.599 C 97.875 31.473 95.837 31.191 94.000 31.840 C 46.677 48.568 18.557 97.237 27.700 146.590 C 28.053 148.507 29.315 150.133 31.085 150.951 C 32.855 151.768 34.912 151.674 36.600 150.700 L 99.000 114.700 C 100.858 113.628 102.001 111.645 102.000 109.500 ZM 90.000 106.000 L 38.340 135.800 Q 38.000 131.910 38.000 128.000 C 38.026 93.018 58.299 61.213 90.000 46.420 ZM 128.000 26.000 C 124.686 26.000 122.000 28.686 122.000 32.000 L 122.000 125.000 L 42.200 171.460 C 40.823 172.263 39.823 173.582 39.419 175.124 C 39.016 176.666 39.243 178.305 40.050 179.680 C 65.079 222.269 117.030 240.802 163.363 223.669 C 209.697 206.537 237.094 158.665 228.394 110.037 C 219.695 61.410 177.400 26.006 128.000 26.000 ZM 128.000 218.000 C 98.252 217.921 70.444 203.224 53.620 178.690 L 131.000 133.610 C 132.855 132.539 133.998 130.561 134.000 128.420 L 134.000 38.200 C 182.431 41.434 219.572 82.490 217.953 131.002 C 216.334 179.513 176.538 218.002 128.000 218.000 Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
