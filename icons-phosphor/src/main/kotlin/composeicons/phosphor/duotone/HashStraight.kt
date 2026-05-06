package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorDuotoneIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 96v64h-64v-64Z"),
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
                pathData = parseSvgPathData("M216 152h-48v-48h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v48h-48v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v48h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48v48h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h48v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM104 152v-48h48v48Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
