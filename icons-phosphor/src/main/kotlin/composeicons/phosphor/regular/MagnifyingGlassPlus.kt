package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnifyingGlassPlus: ImageVector
    get() {
        if (_magnifyingGlassPlus != null) return _magnifyingGlassPlus!!
        _magnifyingGlassPlus = phosphorRegularIcon(
            name = "MagnifyingGlassPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 112c0 4.418-3.582 8-8 8h-24v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24h24c4.418 0 8 3.582 8 8ZM229.66 229.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L168.28 179.59C132.086 209.738 78.581 206.085 46.82 171.297 15.059 136.51 16.277 82.894 49.586 49.586 82.894 16.277 136.51 15.059 171.297 46.82c34.787 31.761 38.44 85.266 8.293 121.46l50.07 50.06c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM112 184c39.764 0 72-32.236 72-72C184 72.235 151.764 40 112 40 72.235 40 40 72.235 40 112c.044 39.746 32.254 71.956 72 72Z"),
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
        return _magnifyingGlassPlus!!
    }

private var _magnifyingGlassPlus: ImageVector? = null
