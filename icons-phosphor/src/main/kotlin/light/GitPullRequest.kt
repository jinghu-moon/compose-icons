package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorLightIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 102.000 64.000 C 101.997 48.213 89.759 35.130 74.008 34.073 C 58.257 33.017 44.381 44.348 42.270 59.993 C 40.158 75.638 50.532 90.243 66.000 93.400 L 66.000 162.600 C 50.910 165.680 40.604 179.686 42.152 195.009 C 43.700 210.332 56.599 221.994 72.000 221.994 C 87.401 221.994 100.300 210.332 101.848 195.009 C 103.396 179.686 93.090 165.680 78.000 162.600 L 78.000 93.400 C 91.959 90.531 101.984 78.251 102.000 64.000 ZM 54.000 64.000 C 54.000 54.059 62.059 46.000 72.000 46.000 C 81.941 46.000 90.000 54.059 90.000 64.000 C 90.000 73.941 81.941 82.000 72.000 82.000 C 62.059 82.000 54.000 73.941 54.000 64.000 ZM 90.000 192.000 C 90.000 201.941 81.941 210.000 72.000 210.000 C 62.059 210.000 54.000 201.941 54.000 192.000 C 54.000 182.059 62.059 174.000 72.000 174.000 C 81.941 174.000 90.000 182.059 90.000 192.000 ZM 206.000 162.600 L 206.000 110.600 C 206.015 104.762 203.697 99.160 199.560 95.040 L 158.480 54.000 L 192.000 54.000 C 195.314 54.000 198.000 51.314 198.000 48.000 C 198.000 44.686 195.314 42.000 192.000 42.000 L 144.000 42.000 C 140.686 42.000 138.000 44.686 138.000 48.000 L 138.000 96.000 C 138.000 99.314 140.686 102.000 144.000 102.000 C 147.314 102.000 150.000 99.314 150.000 96.000 L 150.000 62.480 L 191.070 103.560 C 192.954 105.429 194.009 107.976 194.000 110.630 L 194.000 162.630 C 178.910 165.710 168.604 179.716 170.152 195.039 C 171.700 210.362 184.599 222.024 200.000 222.024 C 215.401 222.024 228.300 210.362 229.848 195.039 C 231.396 179.716 221.090 165.710 206.000 162.630 ZM 200.000 210.000 C 190.059 210.000 182.000 201.941 182.000 192.000 C 182.000 182.059 190.059 174.000 200.000 174.000 C 209.941 174.000 218.000 182.059 218.000 192.000 C 218.000 201.941 209.941 210.000 200.000 210.000 Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
