package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorLightIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.330 91.000 L 131.330 27.000 C 129.314 25.655 126.686 25.655 124.670 27.000 L 28.670 91.000 C 26.999 92.115 25.997 93.991 26.000 96.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 96.000 C 230.003 93.991 229.001 92.115 227.330 91.000 ZM 100.180 152.000 L 38.000 195.900 L 38.000 107.650 ZM 112.450 158.000 L 143.550 158.000 L 205.840 202.000 L 50.160 202.000 ZM 155.820 152.000 L 218.000 107.650 L 218.000 195.900 ZM 128.000 39.210 L 213.430 96.210 L 143.530 146.000 L 112.470 146.000 L 42.570 96.170 Z"),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
