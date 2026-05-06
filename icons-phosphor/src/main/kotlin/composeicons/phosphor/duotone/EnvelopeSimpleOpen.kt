package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) return _envelopeSimpleOpen!!
        _envelopeSimpleOpen = phosphorDuotoneIcon(
            name = "EnvelopeSimpleOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96l-78.55 56h-34.9L32 96 128 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M228.44 89.34l-96-64c-2.688-1.794-6.192-1.794-8.88 0L27.56 89.34C25.334 90.825 23.998 93.324 24 96v104c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-104c.002-2.676-1.334-5.175-3.56-6.66ZM128 41.61l81.91 54.61-67 47.78h-29.8l-67-47.78ZM40 200v-88.47l65.9 47c1.357 .969 2.983 1.49 4.65 1.49h34.9c1.667 0 3.293-.521 4.65-1.49l65.9-47v88.47Z"),
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
