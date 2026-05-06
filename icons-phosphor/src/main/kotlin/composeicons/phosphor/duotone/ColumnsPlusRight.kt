package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorDuotoneIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 48v160c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8ZM152 40h-24c-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M80 32h-24C47.163 32 40 39.163 40 48v160c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-160C96 39.163 88.837 32 80 32ZM80 208h-24v-160h24ZM152 32h-24c-8.837 0-16 7.163-16 16v160c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM152 208h-24v-160h24ZM248 128c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8Z"),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
