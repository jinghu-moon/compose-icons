package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorDuotoneIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 124l56 56-29 29c-9.372 9.372-24.568 9.372-33.94 0L47 186.91C37.648 177.541 37.648 162.369 47 153ZM209 69.09 186.91 47C177.541 37.648 162.369 37.648 153 47L124 76l56 56 29-29c9.352-9.369 9.352-24.541 0-33.91Z"),
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
                pathData = parseSvgPathData("M149.66 138.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L120 156.69 99.31 136l18.35-18.34c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L88 124.69 69.66 106.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L64.69 124 41.37 147.31c-6.003 6.001-9.375 14.142-9.375 22.63 0 8.488 3.372 16.629 9.375 22.63l5.38 5.37L18.34 226.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L58.06 209.25l5.37 5.38c6.001 6.003 14.142 9.375 22.63 9.375 8.488 0 16.629-3.372 22.63-9.375L132 191.31l6.34 6.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L131.31 168l18.35-18.34c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM97.37 203.34c-6.248 6.243-16.372 6.243-22.62 0L52.69 181.25c-6.243-6.248-6.243-16.372 0-22.62L76 135.31 120.69 180ZM237.66 18.34C236.159 16.838 234.123 15.994 232 15.994c-2.123 0-4.159 .844-5.66 2.346L197.94 46.75l-5.37-5.38c-12.509-12.473-32.751-12.473-45.26 0L124 64.69l-6.34-6.35c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l80 80c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L191.31 132l23.32-23.31c6.003-6.001 9.375-14.142 9.375-22.63 0-8.488-3.372-16.629-9.375-22.63l-5.38-5.37L237.66 29.66c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM203.31 97.34 180 120.69 135.31 76 158.63 52.69c6.248-6.243 16.372-6.243 22.62 0l22.06 22c3.017 3.003 4.713 7.084 4.713 11.34 0 4.256-1.696 8.337-4.713 11.34Z"),
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
