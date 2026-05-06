package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorFillIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128c0 4.418-3.582 8-8 8h-24.37c-3.912 42.252-37.378 75.718-79.63 79.63v24.37c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24.37C77.748 211.718 44.282 178.252 40.37 136h-24.37c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24.37C44.282 77.748 77.748 44.282 120 40.37v-24.37c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24.37c42.252 3.912 75.718 37.378 79.63 79.63h24.37c4.418 0 8 3.582 8 8Z"),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
