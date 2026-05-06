package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorDuotoneIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 64v64c0 22.091-17.909 40-40 40h0C105.909 168 88 150.091 88 128v-64C88 41.909 105.909 24 128 24h0c22.091 0 40 17.909 40 40Z"),
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
                pathData = parseSvgPathData("M128 176c26.498-.028 47.972-21.502 48-48v-64C176 37.49 154.51 16 128 16 101.49 16 80 37.49 80 64v64c.028 26.498 21.502 47.972 48 48ZM96 64C96 46.327 110.327 32 128 32c17.673 0 32 14.327 32 32v64c0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128ZM136 207.6v32.4c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32.4C79.145 203.443 48.05 169.066 48 128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 35.346 28.654 64 64 64 35.346 0 64-28.654 64-64 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8-.05 41.066-31.145 75.443-72 79.6Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
