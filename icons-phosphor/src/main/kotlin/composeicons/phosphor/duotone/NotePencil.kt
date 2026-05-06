package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorDuotoneIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 88l-72 72h-32v-32L168 56Z"),
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
                pathData = parseSvgPathData("M229.66 58.34l-32-32C196.159 24.838 194.123 23.994 192 23.994c-2.123 0-4.159 .844-5.66 2.346l-96 96C88.84 123.842 87.998 125.878 88 128v32c0 4.418 3.582 8 8 8h32c2.122 .002 4.158-.84 5.66-2.34l96-96c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM124.69 152h-20.69v-20.69l64-64L188.69 88ZM200 76.69 179.31 56 192 43.31 212.69 64ZM224 128v80c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-80v160h160v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
