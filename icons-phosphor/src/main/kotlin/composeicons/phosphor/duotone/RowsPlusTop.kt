package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorDuotoneIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 176v24c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8ZM208 96h-160c-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M208 160h-160c-8.837 0-16 7.163-16 16v24c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-24c0-8.837-7.163-16-16-16ZM208 200h-160v-24h160v24ZM208 88h-160c-8.837 0-16 7.163-16 16v24c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-24c0-8.837-7.163-16-16-16ZM208 128h-160v-24h160v24ZM96 40c0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
