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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C25.373 44 20 49.373 20 56v136c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-136c0-6.627-5.373-12-12-12ZM193.15 68 128 127.72 62.85 68ZM44 188v-104.72l75.89 69.57c4.588 4.207 11.632 4.207 16.22 0L212 83.28v104.72Z"),
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
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null
