package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) return _envelopeSimple!!
        _envelopeSimple = phosphorLightIcon(
            name = "EnvelopeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192c-3.314 0-6 2.686-6 6v136c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-136c0-3.314-2.686-6-6-6ZM208.58 62 128 135.86 47.42 62ZM216 194h-176c-1.105 0-2-.895-2-2v-122.36l86 78.78c2.293 2.097 5.807 2.097 8.1 0L218 69.64v122.36c0 1.105-.895 2-2 2Z"),
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
