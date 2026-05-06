package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorThinIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.22 92.67l-96-64c-1.344-.897-3.096-.897-4.44 0L29.78 92.67C28.667 93.412 27.999 94.662 28 96v104c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-104c.001-1.338-.667-2.588-1.78-3.33ZM103.63 152 36 199.76v-96ZM111.82 156h32.36l68 48h-168.32ZM152.37 152 220 103.76v96ZM128 36.81l89 59.3L144.17 148h-32.34L39.05 96.11Z"),
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
