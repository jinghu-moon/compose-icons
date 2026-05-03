package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorLightIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 104.000 C 214.000 107.314 211.314 110.000 208.000 110.000 C 204.686 110.000 202.000 107.314 202.000 104.000 C 202.000 63.131 168.869 30.000 128.000 30.000 C 87.131 30.000 54.000 63.131 54.000 104.000 C 54.000 131.550 62.830 140.060 72.180 149.080 C 76.490 153.230 80.950 157.530 84.340 163.550 C 88.150 170.310 90.000 178.300 90.000 188.000 C 90.000 208.987 107.013 226.000 128.000 226.000 C 138.740 226.000 147.690 221.480 155.370 212.180 C 157.480 209.623 161.263 209.260 163.820 211.370 C 166.377 213.480 166.740 217.263 164.630 219.820 C 154.660 231.880 142.340 238.000 128.000 238.000 C 100.399 237.967 78.033 215.601 78.000 188.000 C 78.000 171.360 71.760 165.340 63.850 157.710 C 54.120 148.330 42.000 136.640 42.000 104.000 C 42.000 56.504 80.504 18.000 128.000 18.000 C 175.496 18.000 214.000 56.504 214.000 104.000 ZM 176.860 162.810 C 173.993 161.156 170.329 162.136 168.670 165.000 C 166.411 168.930 161.792 170.849 157.413 169.677 C 153.035 168.504 149.992 164.533 150.000 160.000 C 150.000 150.000 155.000 143.330 160.800 135.600 C 167.000 127.350 174.000 118.000 174.000 104.000 C 174.000 78.595 153.405 58.000 128.000 58.000 C 102.595 58.000 82.000 78.595 82.000 104.000 C 82.000 107.314 84.686 110.000 88.000 110.000 C 91.314 110.000 94.000 107.314 94.000 104.000 C 94.000 85.222 109.222 70.000 128.000 70.000 C 146.778 70.000 162.000 85.222 162.000 104.000 C 162.000 114.000 157.000 120.670 151.200 128.400 C 145.000 136.650 138.000 146.000 138.000 160.000 C 138.002 169.956 144.689 178.669 154.306 181.246 C 163.922 183.823 174.070 179.621 179.050 171.000 C 180.704 168.133 179.724 164.469 176.860 162.810 Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
