package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorRegularIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 56h-96C55.163 56 48 63.163 48 72v152c-0 2.997 1.675 5.742 4.339 7.114 2.665 1.371 5.872 1.138 8.311-.604L112 193.83l51.36 36.68c2.438 1.736 5.642 1.966 8.303 .595 2.661-1.371 4.334-4.112 4.337-7.105v-152c0-8.837-7.163-16-16-16ZM160 208.46l-43.36-31c-2.782-1.987-6.518-1.987-9.3 0L64 208.45v-136.45h96ZM208 40v152c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-152h-104c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h104c8.837 0 16 7.163 16 16Z"),
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
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
