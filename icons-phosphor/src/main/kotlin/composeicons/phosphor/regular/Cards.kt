package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorRegularIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 72h-144C31.163 72 24 79.163 24 88v112c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM184 200h-144v-112h144v112ZM232 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120h-152c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h152c8.837 0 16 7.163 16 16Z"),
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
