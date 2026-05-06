package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorFillIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.44 89.34l-96-64c-2.688-1.794-6.192-1.794-8.88 0L27.56 89.34C25.334 90.825 23.998 93.324 24 96v104c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-104c.002-2.676-1.334-5.175-3.56-6.66ZM96.72 152 40 192v-80.47ZM113.09 160h29.82l56.63 40h-143.08ZM159.28 152 216 111.53v80.47Z"),
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
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
