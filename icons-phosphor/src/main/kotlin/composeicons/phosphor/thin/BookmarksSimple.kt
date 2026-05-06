package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorThinIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 60h-96C57.373 60 52 65.373 52 72v152c0 1.499 .839 2.872 2.173 3.557 1.334 .685 2.938 .566 4.157-.307L112 188.92l53.69 38.33c.672 .487 1.48 .749 2.31 .75 .636-.002 1.263-.153 1.83-.44 1.333-.686 2.171-2.06 2.17-3.56v-152c0-6.627-5.373-12-12-12ZM164 216.23 114.32 180.74c-1.391-.993-3.259-.993-4.65 0L60 216.23v-144.23c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4ZM204 40v152c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-152c0-2.209-1.791-4-4-4h-104c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h104c6.627 0 12 5.373 12 12Z"),
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
