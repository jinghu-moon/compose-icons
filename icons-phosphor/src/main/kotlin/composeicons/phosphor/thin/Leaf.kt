package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorThinIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.45 40.31c-.118-2.026-1.734-3.642-3.76-3.76C141.06 32.16 81.46 54.39 56.24 96 39 124.56 39.9 158.37 58.8 191.54L37.17 213.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L64.46 197.19c17.39 9.91 35 14.89 51.83 14.89 15.429 .014 30.559-4.251 43.71-12.32 41.61-25.22 63.84-84.83 59.45-159.45ZM155.82 192.92c-25.37 15.37-55.56 14.75-85.48-1.61L162.84 98.82c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L64.69 185.66C48.33 155.74 47.69 125.55 63.08 100.18 86.34 61.77 141.72 41 211.66 44.34 215 114.28 194.23 169.66 155.82 192.92Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
