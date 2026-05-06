package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorLightIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.91 118.1l-16-16c-5.375-5.368-14.05-5.47-19.55-.23L154.13 49.64c5.24-5.5 5.138-14.175-.23-19.55l-16-16C135.274 11.464 131.713 9.989 128 9.989c-3.713 0-7.274 1.475-9.9 4.101l-64 64c-2.626 2.626-4.101 6.187-4.101 9.9 0 3.713 1.475 7.274 4.101 9.9l16 16c5.375 5.368 14.05 5.47 19.55 .23L99.52 124 32.73 190.79c-8.212 9.088-7.86 23.018 .8 31.681 8.66 8.663 22.59 9.018 31.68 .809L132 156.49l9.87 9.87c-5.24 5.5-5.138 14.175 .23 19.55l16 16c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l64-64c2.63-2.625 4.109-6.187 4.111-9.903 .002-3.716-1.473-7.28-4.101-9.907ZM150.35 157.86 98.14 105.66 145.66 58.14l52.2 52.2ZM78.59 105.41l-16-16c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415L126.59 22.58c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l16 16c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415l-64 64c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587ZM56.73 214.8c-4.359 3.801-10.917 3.576-15.007-.513-4.09-4.09-4.314-10.647-.513-15.007L108 132.49 123.52 148ZM233.42 129.42l-64 64c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587l-16-16c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415l64-64c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l16 16c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
