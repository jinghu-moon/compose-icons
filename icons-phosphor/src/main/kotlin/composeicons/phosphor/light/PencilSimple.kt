package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorLightIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.9 74.78 181.21 30.09c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L38.1 153.41c-2.631 2.622-4.107 6.186-4.1 9.9v44.69c0 7.732 6.268 14 14 14h44.69c3.714 .007 7.278-1.469 9.9-4.1L225.9 94.58c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9ZM94.1 209.41c-.373 .376-.88 .588-1.41 .59h-44.69c-1.105 0-2-.895-2-2v-44.69c.002-.53 .214-1.037 .59-1.41L136 72.48 183.51 120ZM217.41 86.1 192 111.51 144.49 64 169.9 38.58c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l44.68 44.69c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
