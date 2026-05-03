package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorBoldIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 200.000 C 236.000 206.627 230.627 212.000 224.000 212.000 L 32.000 212.000 C 25.373 212.000 20.000 206.627 20.000 200.000 C 20.000 193.373 25.373 188.000 32.000 188.000 L 224.000 188.000 C 230.627 188.000 236.000 193.373 236.000 200.000 ZM 22.000 152.570 C 18.631 145.576 19.614 137.265 24.520 131.250 L 106.160 30.430 C 111.491 23.833 119.518 19.999 128.000 19.999 C 136.482 19.999 144.509 23.833 149.840 30.430 L 231.490 131.250 C 236.362 137.266 237.346 145.544 234.021 152.535 C 230.695 159.525 223.651 163.985 215.910 164.000 L 40.090 164.000 C 32.350 164.032 25.294 159.574 22.000 152.570 ZM 48.300 140.000 L 207.700 140.000 L 131.200 45.530 C 130.420 44.562 129.243 43.999 128.000 43.999 C 126.757 43.999 125.580 44.562 124.800 45.530 Z"),
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
