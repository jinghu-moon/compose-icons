package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorLightIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 64.000 C 221.997 48.213 209.759 35.130 194.008 34.073 C 178.257 33.017 164.381 44.348 162.270 59.993 C 160.158 75.638 170.532 90.243 186.000 93.400 L 186.000 112.000 C 186.000 117.523 181.523 122.000 176.000 122.000 L 80.000 122.000 C 74.477 122.000 70.000 117.523 70.000 112.000 L 70.000 93.400 C 85.090 90.320 95.396 76.314 93.848 60.991 C 92.300 45.668 79.401 34.006 64.000 34.006 C 48.599 34.006 35.700 45.668 34.152 60.991 C 32.604 76.314 42.910 90.320 58.000 93.400 L 58.000 112.000 C 58.000 124.150 67.850 134.000 80.000 134.000 L 122.000 134.000 L 122.000 162.600 C 106.910 165.680 96.604 179.686 98.152 195.009 C 99.700 210.332 112.599 221.994 128.000 221.994 C 143.401 221.994 156.300 210.332 157.848 195.009 C 159.396 179.686 149.090 165.680 134.000 162.600 L 134.000 134.000 L 176.000 134.000 C 188.150 134.000 198.000 124.150 198.000 112.000 L 198.000 93.400 C 211.959 90.531 221.984 78.251 222.000 64.000 ZM 46.000 64.000 C 46.000 54.059 54.059 46.000 64.000 46.000 C 73.941 46.000 82.000 54.059 82.000 64.000 C 82.000 73.941 73.941 82.000 64.000 82.000 C 54.059 82.000 46.000 73.941 46.000 64.000 ZM 146.000 192.000 C 146.000 201.941 137.941 210.000 128.000 210.000 C 118.059 210.000 110.000 201.941 110.000 192.000 C 110.000 182.059 118.059 174.000 128.000 174.000 C 137.941 174.000 146.000 182.059 146.000 192.000 ZM 192.000 82.000 C 182.059 82.000 174.000 73.941 174.000 64.000 C 174.000 54.059 182.059 46.000 192.000 46.000 C 201.941 46.000 210.000 54.059 210.000 64.000 C 210.000 73.941 201.941 82.000 192.000 82.000 Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
