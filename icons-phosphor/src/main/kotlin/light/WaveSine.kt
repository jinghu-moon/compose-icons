package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorLightIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.430 130.550 C 215.840 176.570 197.000 198.000 178.000 198.000 C 154.170 198.000 138.800 165.240 122.530 130.550 C 109.260 102.170 94.170 70.000 78.000 70.000 C 68.820 70.000 53.000 80.500 29.470 130.550 C 28.025 133.483 24.497 134.719 21.537 133.329 C 18.577 131.939 17.276 128.435 18.610 125.450 C 40.160 79.430 59.000 58.000 78.000 58.000 C 101.830 58.000 117.200 90.760 133.470 125.450 C 146.740 153.830 161.830 186.000 178.000 186.000 C 187.180 186.000 203.050 175.500 226.530 125.450 C 227.975 122.517 231.503 121.281 234.463 122.671 C 237.423 124.061 238.724 127.565 237.390 130.550 Z"),
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
