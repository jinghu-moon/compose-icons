package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorDuotoneIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 48h-144c-4.418 0-8 3.582-8 8v144c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8v-144c0-4.418-3.582-8-8-8ZM152 152h-48v-48h48Z"),
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
                pathData = parseSvgPathData("M152 96h-48c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM144 144h-32v-32h32ZM232 144h-16v-32h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-40c0-8.837-7.163-16-16-16h-40v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-40C47.163 40 40 47.163 40 56v40h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v32h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v40c0 8.837 7.163 16 16 16h40v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h40c8.837 0 16-7.163 16-16v-40h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM200 200h-144v-144h144v95.87c0 0 0 .09 0 .13 0 .04 0 .09 0 .13v47.87Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
