package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorFillIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 88v112c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-112C24 79.163 31.163 72 40 72h144c8.837 0 16 7.163 16 16ZM216 40h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152v120c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-120c0-8.837-7.163-16-16-16Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
