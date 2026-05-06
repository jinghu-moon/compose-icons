package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorRegularIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-48c-8.837 0-16 7.163-16 16v160c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-48v-32h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-32h48v160ZM77.66 26.34C76.159 24.838 74.123 23.994 72 23.994c-2.123 0-4.159 .844-5.66 2.346l-32 32C32.84 59.842 31.998 61.878 32 64v144c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-144c.002-2.122-.84-4.158-2.34-5.66ZM48 176v-96h16v96ZM80 80h16v96h-16ZM72 43.31 92.69 64h-41.38ZM48 208v-16h48v16Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
