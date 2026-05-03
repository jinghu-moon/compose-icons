package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) return _envelopeSimpleOpen!!
        _envelopeSimpleOpen = phosphorThinIcon(
            name = "EnvelopeSimpleOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.220 92.670 L 130.220 28.670 C 128.876 27.773 127.124 27.773 125.780 28.670 L 29.780 92.670 C 28.667 93.412 27.999 94.662 28.000 96.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 96.000 C 228.001 94.662 227.333 93.412 226.220 92.670 ZM 128.000 36.810 L 217.000 96.110 L 144.170 148.000 L 111.830 148.000 L 39.050 96.110 ZM 216.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 103.760 L 108.220 155.260 C 108.900 155.744 109.715 156.003 110.550 156.000 L 145.450 156.000 C 146.285 156.003 147.100 155.744 147.780 155.260 L 220.000 103.760 L 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 Z"),
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
        return _envelopeSimpleOpen!!
    }

private var _envelopeSimpleOpen: ImageVector? = null
