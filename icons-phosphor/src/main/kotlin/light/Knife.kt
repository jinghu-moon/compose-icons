package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorLightIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.460 33.550 C 220.382 23.478 204.048 23.478 193.970 33.550 L 19.760 207.820 C 18.217 209.362 17.633 211.619 18.233 213.716 C 18.834 215.813 20.525 217.419 22.650 217.910 C 34.370 220.622 46.360 221.994 58.390 222.000 C 90.960 222.000 123.560 211.900 154.260 192.090 C 185.750 171.770 203.980 148.700 204.740 147.730 C 206.607 145.340 206.397 141.932 204.250 139.790 L 182.490 118.000 L 230.490 70.000 C 240.500 59.907 240.486 43.627 230.460 33.550 ZM 191.860 144.370 C 178.873 158.796 164.042 171.448 147.750 182.000 C 111.500 205.400 74.000 214.230 36.230 208.320 L 146.000 98.500 ZM 222.000 61.560 L 174.000 109.560 L 154.490 90.000 L 202.490 42.000 C 207.891 36.612 216.637 36.624 222.025 42.025 C 227.413 47.426 227.401 56.172 222.000 61.560 Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
