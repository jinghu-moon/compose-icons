package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorFillIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 48v160c0 8.837-7.163 16-16 16h-24c-8.837 0-16-7.163-16-16v-160C40 39.163 47.163 32 56 32h24c8.837 0 16 7.163 16 16ZM152 32h-24c-8.837 0-16 7.163-16 16v160c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM240 120h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
