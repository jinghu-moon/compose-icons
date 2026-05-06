package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) return _plugsConnected!!
        _plugsConnected = phosphorDuotoneIcon(
            name = "PlugsConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185 127l-58 58c-9.372 9.372-24.568 9.372-33.94 0L71 162.91C61.648 153.541 61.648 138.369 71 129L129 71c9.372-9.372 24.568-9.372 33.94 0L185 93.09c9.352 9.369 9.352 24.541 0 33.91Z"),
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
                pathData = parseSvgPathData("M237.66 18.34C236.159 16.838 234.123 15.994 232 15.994c-2.123 0-4.159 .844-5.66 2.346L173.94 70.75l-5.37-5.38c-12.509-12.473-32.751-12.473-45.26 0L100 88.69 93.66 82.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L88.69 100 65.37 123.31c-6.003 6.001-9.375 14.142-9.375 22.63 0 8.488 3.372 16.629 9.375 22.63l5.38 5.37L18.34 226.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L82.06 185.25l5.37 5.38c12.511 12.467 32.749 12.467 45.26 0L156 167.31l6.34 6.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L167.31 156l23.32-23.31c6.003-6.001 9.375-14.142 9.375-22.63 0-8.488-3.372-16.629-9.375-22.63l-5.38-5.37L237.66 29.66c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM121.37 179.34c-6.248 6.243-16.372 6.243-22.62 0L76.69 157.25c-6.243-6.248-6.243-16.372 0-22.62L100 111.31 144.69 156ZM179.31 121.4h0L156 144.69 111.31 100 134.63 76.69c6.248-6.243 16.372-6.243 22.62 0l22.06 22c3.001 3.001 4.688 7.071 4.688 11.315 0 4.244-1.686 8.314-4.688 11.315ZM88.57 35C86.913 30.897 88.897 26.227 93 24.57c4.103-1.657 8.773 .327 10.43 4.43l8 20c1.657 4.103-.327 8.773-4.43 10.43C102.897 61.087 98.227 59.103 96.57 55ZM24.57 93c.793-1.973 2.338-3.549 4.295-4.38 1.957-.831 4.164-.849 6.135-.05l20 8c4.103 1.657 6.087 6.327 4.43 10.43-1.657 4.103-6.327 6.087-10.43 4.43l-20-8c-1.973-.793-3.549-2.338-4.38-4.295C23.789 97.178 23.771 94.97 24.57 93ZM231.43 163c-.787 1.971-2.326 3.548-4.276 4.385-1.951 .836-4.153 .864-6.124 .075l-20-8c-4.112-1.649-6.109-6.318-4.46-10.43 1.649-4.112 6.318-6.109 10.43-4.46l20 8c1.973 .793 3.549 2.338 4.38 4.295 .831 1.957 .849 4.164 .05 6.135ZM167.43 221.06c1.64 4.103-.357 8.76-4.46 10.4-4.103 1.64-8.76-.357-10.4-4.46l-8-20c-1.657-4.103 .327-8.773 4.43-10.43 4.103-1.657 8.773 .327 10.43 4.43Z"),
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
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
