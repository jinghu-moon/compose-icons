package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorDuotoneIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 48v160c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM192 40h-40c-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M104 32h-40C55.163 32 48 39.163 48 48v160c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM104 208h-40v-160h40ZM192 32h-40c-8.837 0-16 7.163-16 16v160c0 8.837 7.163 16 16 16h40c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM192 208h-40v-160h40Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
