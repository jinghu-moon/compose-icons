package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorLightIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.91 137.42 142.59 38.1C139.968 35.469 136.404 33.993 132.69 34h-92.69c-3.314 0-6 2.686-6 6v92.69c-.007 3.714 1.469 7.278 4.1 9.9l99.32 99.32c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l84.69-84.69c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9ZM233.42 148.73l-84.69 84.69c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L46.59 134.1c-.376-.373-.588-.88-.59-1.41v-86.69h86.69c.53 .002 1.037 .214 1.41 .59l99.32 99.31c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415ZM94 84c0 5.523-4.477 10-10 10C78.477 94 74 89.523 74 84 74 78.477 78.477 74 84 74c5.523 0 10 4.477 10 10Z"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
