package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorRegularIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32h-24C95.163 32 88 39.163 88 48v160c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM128 208h-24v-160h24ZM200 32h-24c-8.837 0-16 7.163-16 16v160c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM200 208h-24v-160h24ZM72 128c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
