package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) return _envelopeSimpleOpen!!
        _envelopeSimpleOpen = phosphorLightIcon(
            name = "EnvelopeSimpleOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.33 91l-96-64c-2.016-1.345-4.644-1.345-6.66 0L28.67 91C26.999 92.115 25.997 93.991 26 96v104c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-104c.003-2.009-.999-3.885-2.67-5ZM128 39.21l85.43 57L143.53 146h-31.06L42.57 96.17ZM216 202h-176c-1.105 0-2-.895-2-2v-92.35l69.06 49.24c1.021 .721 2.24 1.109 3.49 1.11h34.9c1.25-.001 2.469-.389 3.49-1.11L218 107.65v92.35c0 1.105-.895 2-2 2Z"),
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
