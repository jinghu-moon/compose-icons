package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorLightIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 154.000 C 108.686 154.000 106.000 156.686 106.000 160.000 L 106.000 193.520 L 64.930 152.440 C 63.048 150.569 61.993 148.023 62.000 145.370 L 62.000 93.370 C 77.090 90.290 87.396 76.284 85.848 60.961 C 84.300 45.638 71.401 33.976 56.000 33.976 C 40.599 33.976 27.700 45.638 26.152 60.961 C 24.604 76.284 34.910 90.290 50.000 93.370 L 50.000 145.370 C 49.985 151.208 52.303 156.810 56.440 160.930 L 97.520 202.000 L 64.000 202.000 C 60.686 202.000 58.000 204.686 58.000 208.000 C 58.000 211.314 60.686 214.000 64.000 214.000 L 112.000 214.000 C 115.314 214.000 118.000 211.314 118.000 208.000 L 118.000 160.000 C 118.000 156.686 115.314 154.000 112.000 154.000 ZM 38.000 64.000 C 38.000 54.059 46.059 46.000 56.000 46.000 C 65.941 46.000 74.000 54.059 74.000 64.000 C 74.000 73.941 65.941 82.000 56.000 82.000 C 46.059 82.000 38.000 73.941 38.000 64.000 ZM 206.000 162.600 L 206.000 110.600 C 206.015 104.762 203.697 99.160 199.560 95.040 L 158.480 54.000 L 192.000 54.000 C 195.314 54.000 198.000 51.314 198.000 48.000 C 198.000 44.686 195.314 42.000 192.000 42.000 L 144.000 42.000 C 140.686 42.000 138.000 44.686 138.000 48.000 L 138.000 96.000 C 138.000 99.314 140.686 102.000 144.000 102.000 C 147.314 102.000 150.000 99.314 150.000 96.000 L 150.000 62.480 L 191.070 103.560 C 192.952 105.431 194.007 107.977 194.000 110.630 L 194.000 162.630 C 178.910 165.710 168.604 179.716 170.152 195.039 C 171.700 210.362 184.599 222.024 200.000 222.024 C 215.401 222.024 228.300 210.362 229.848 195.039 C 231.396 179.716 221.090 165.710 206.000 162.630 ZM 200.000 210.000 C 190.059 210.000 182.000 201.941 182.000 192.000 C 182.000 182.059 190.059 174.000 200.000 174.000 C 209.941 174.000 218.000 182.059 218.000 192.000 C 218.000 201.941 209.941 210.000 200.000 210.000 Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
