package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorThinIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 28h-96C89.373 28 84 33.373 84 40v20h-20C57.373 60 52 65.373 52 72v152c0 1.499 .839 2.872 2.173 3.557 1.334 .685 2.938 .566 4.157-.307L112 188.92l53.69 38.33c.672 .487 1.48 .749 2.31 .75 .636-.002 1.263-.153 1.83-.44 1.333-.686 2.171-2.06 2.17-3.56v-47.08l25.68 18.33c.675 .489 1.487 .752 2.32 .75 .636-.002 1.263-.153 1.83-.44 1.333-.686 2.171-2.06 2.17-3.56v-152c0-6.627-5.373-12-12-12ZM164 216.23 114.32 180.75c-1.391-.993-3.259-.993-4.65 0L60 216.23v-144.23c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4ZM196 184.23 172 167.09v-95.09c0-6.627-5.373-12-12-12h-68v-20c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4Z"),
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
