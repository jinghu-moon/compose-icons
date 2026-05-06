package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorDuotoneIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 104h-96v-48h96ZM176 104v48h-48v48h96v-96Z"),
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
                pathData = parseSvgPathData("M224 48h-192c-4.418 0-8 3.582-8 8v144c0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8v-144c0-4.418-3.582-8-8-8ZM88 144v-32h80v32ZM40 144v-32h32v32ZM184 112h32v32h-32ZM216 96h-80v-32h80ZM120 64v32h-80v-32ZM40 160h80v32h-80ZM136 192v-32h80v32Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
