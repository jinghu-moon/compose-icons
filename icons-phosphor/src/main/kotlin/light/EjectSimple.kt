package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorLightIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 200.000 C 230.000 203.314 227.314 206.000 224.000 206.000 L 32.000 206.000 C 28.686 206.000 26.000 203.314 26.000 200.000 C 26.000 196.686 28.686 194.000 32.000 194.000 L 224.000 194.000 C 227.314 194.000 230.000 196.686 230.000 200.000 ZM 27.390 150.000 C 25.001 145.083 25.692 139.226 29.160 135.000 L 110.820 34.200 C 115.016 29.015 121.330 26.002 128.000 26.002 C 134.670 26.002 140.984 29.015 145.180 34.200 L 226.840 135.000 C 230.283 139.217 230.988 145.041 228.651 149.958 C 226.314 154.875 221.354 158.006 215.910 158.000 L 40.090 158.000 C 34.664 158.020 29.715 154.902 27.390 150.000 ZM 38.220 144.840 C 38.555 145.566 39.291 146.022 40.090 146.000 L 215.910 146.000 C 216.714 146.018 217.451 145.553 217.780 144.820 C 218.160 144.089 218.053 143.200 217.510 142.580 L 135.860 41.760 C 133.943 39.384 131.053 38.003 128.000 38.003 C 124.947 38.003 122.057 39.384 120.140 41.760 L 38.490 142.580 C 37.947 143.200 37.840 144.089 38.220 144.820 Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
