package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorFillIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.66 149.66 131.31 168l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L132 191.31l-23.31 23.32c-12.511 12.467-32.749 12.467-45.26 0l-5.37-5.38L29.66 237.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L46.75 197.94l-5.38-5.37c-6.003-6.001-9.375-14.142-9.375-22.63 0-8.488 3.372-16.629 9.375-22.63L64.69 124l-6.35-6.34c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L88 124.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L99.31 136 120 156.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM237.66 18.34C236.159 16.838 234.123 15.994 232 15.994c-2.123 0-4.159 .844-5.66 2.346L197.94 46.75l-5.37-5.38c-12.509-12.473-32.751-12.473-45.26 0L124 64.69l-6.34-6.35c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l80 80c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L191.31 132l23.32-23.31c6.003-6.001 9.375-14.142 9.375-22.63 0-8.488-3.372-16.629-9.375-22.63l-5.38-5.37L237.66 29.66c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
