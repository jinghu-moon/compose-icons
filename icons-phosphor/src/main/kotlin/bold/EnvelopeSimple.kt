package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) return _envelopeSimple!!
        _envelopeSimple = phosphorBoldIcon(
            name = "EnvelopeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 25.373 44.000 20.000 49.373 20.000 56.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 216.000 212.000 C 227.046 212.000 236.000 203.046 236.000 192.000 L 236.000 56.000 C 236.000 49.373 230.627 44.000 224.000 44.000 ZM 193.150 68.000 L 128.000 127.720 L 62.850 68.000 ZM 44.000 188.000 L 44.000 83.280 L 119.890 152.850 C 124.478 157.057 131.522 157.057 136.110 152.850 L 212.000 83.280 L 212.000 188.000 Z"),
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
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null
