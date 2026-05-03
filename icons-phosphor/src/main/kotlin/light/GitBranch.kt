package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorLightIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 64.000 C 229.997 48.213 217.759 35.130 202.008 34.073 C 186.257 33.017 172.381 44.348 170.270 59.993 C 168.158 75.638 178.532 90.243 194.000 93.400 L 194.000 112.000 C 194.000 117.523 189.523 122.000 184.000 122.000 L 96.000 122.000 C 92.522 121.999 89.093 122.828 86.000 124.420 L 86.000 93.420 C 101.090 90.340 111.396 76.334 109.848 61.011 C 108.300 45.688 95.401 34.026 80.000 34.026 C 64.599 34.026 51.700 45.688 50.152 61.011 C 48.604 76.334 58.910 90.340 74.000 93.420 L 74.000 162.620 C 58.910 165.700 48.604 179.706 50.152 195.029 C 51.700 210.352 64.599 222.014 80.000 222.014 C 95.401 222.014 108.300 210.352 109.848 195.029 C 111.396 179.706 101.090 165.700 86.000 162.620 L 86.000 144.000 C 86.000 138.477 90.477 134.000 96.000 134.000 L 184.000 134.000 C 196.150 134.000 206.000 124.150 206.000 112.000 L 206.000 93.400 C 219.959 90.531 229.984 78.251 230.000 64.000 ZM 62.000 64.000 C 62.000 54.059 70.059 46.000 80.000 46.000 C 89.941 46.000 98.000 54.059 98.000 64.000 C 98.000 73.941 89.941 82.000 80.000 82.000 C 70.059 82.000 62.000 73.941 62.000 64.000 ZM 98.000 192.000 C 98.000 201.941 89.941 210.000 80.000 210.000 C 70.059 210.000 62.000 201.941 62.000 192.000 C 62.000 182.059 70.059 174.000 80.000 174.000 C 89.941 174.000 98.000 182.059 98.000 192.000 ZM 200.000 82.000 C 190.059 82.000 182.000 73.941 182.000 64.000 C 182.000 54.059 190.059 46.000 200.000 46.000 C 209.941 46.000 218.000 54.059 218.000 64.000 C 218.000 73.941 209.941 82.000 200.000 82.000 Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
