package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) return _envelopeSimple!!
        _envelopeSimple = phosphorThinIcon(
            name = "EnvelopeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192c-2.209 0-4 1.791-4 4v136c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-136c0-2.209-1.791-4-4-4ZM213.72 60 128 138.57 42.28 60ZM216 196h-176c-2.209 0-4-1.791-4-4v-126.91L125.3 147c1.528 1.398 3.872 1.398 5.4 0L220 65.09v126.91c0 2.209-1.791 4-4 4Z"),
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
