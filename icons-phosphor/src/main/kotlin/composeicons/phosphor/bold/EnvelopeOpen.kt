package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) return _envelopeOpen!!
        _envelopeOpen = phosphorBoldIcon(
            name = "EnvelopeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.66 86l-96-64c-4.032-2.69-9.288-2.69-13.32 0L25.34 86C21.998 88.229 19.994 91.983 20 96v104c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-104c.006-4.017-1.998-7.771-5.34-10ZM89.81 152 44 184.31v-65ZM114.36 164h27.28L187 196h-117.95ZM166.19 152 212 119.29v65ZM128 46.42l74.86 49.91L141.61 140h-27.22L53.14 96.33Z"),
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
