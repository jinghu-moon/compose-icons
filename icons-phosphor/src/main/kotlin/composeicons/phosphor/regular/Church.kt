package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorRegularIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.12 145.14 192 123.47v-19.47c.026-2.884-1.502-5.558-4-7L136 67.36v-19.36h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v19.36L68 97.05c-2.498 1.442-4.026 4.116-4 7v19.47L27.88 145.14C25.472 146.587 23.999 149.191 24 152v64c0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8v-64c.001-2.809-1.472-5.413-3.88-6.86ZM40 156.53 64 142.13v65.87h-24ZM128 144c-13.255 0-24 10.745-24 24v40h-24v-99.36L128 81.21l48 27.43v99.36h-24v-40c0-13.255-10.745-24-24-24ZM216 208h-24v-65.87l24 14.4Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
