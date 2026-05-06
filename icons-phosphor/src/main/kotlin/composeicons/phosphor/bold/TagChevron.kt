package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorBoldIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250 121.34 204.36 52.91C200.652 47.345 194.407 44.001 187.72 44h-155.72c-4.43-.007-8.502 2.428-10.595 6.332-2.092 3.904-1.864 8.644 .595 12.328L65.58 128 22 193.34c-2.458 3.685-2.687 8.424-.595 12.328 2.092 3.904 6.165 6.338 10.595 6.332h155.72c6.687-.001 12.932-3.345 16.64-8.91L250 134.66c2.69-4.032 2.69-9.288 0-13.32ZM185.58 188h-131.16L90 134.66c2.69-4.032 2.69-9.288 0-13.32L54.42 68h131.16l40 60Z"),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
