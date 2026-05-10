package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorFillIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 24h-96C87.163 24 80 31.163 80 40v16h-16C55.163 56 48 63.163 48 72v152c-0 2.997 1.675 5.742 4.339 7.114 2.665 1.371 5.872 1.138 8.311-.604L112 193.83l51.36 36.68c2.438 1.736 5.642 1.966 8.303 .595 2.661-1.371 4.334-4.112 4.337-7.105v-39.31l19.35 13.82c2.439 1.742 5.646 1.975 8.311 .604 2.665-1.371 4.339-4.117 4.339-7.114v-152c0-8.837-7.163-16-16-16ZM192 176.46 176 165v-93c0-8.837-7.163-16-16-16h-64v-16h96Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
