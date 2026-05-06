package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorBoldIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250 121.34 204.36 52.91C200.652 47.345 194.407 44.001 187.72 44h-147.72C28.954 44 20 52.954 20 64v128c0 11.046 8.954 20 20 20h147.72c6.687-.001 12.932-3.345 16.64-8.91L250 134.66c2.69-4.032 2.69-9.288 0-13.32ZM185.58 188h-141.58v-120h141.58l40 60Z"),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
