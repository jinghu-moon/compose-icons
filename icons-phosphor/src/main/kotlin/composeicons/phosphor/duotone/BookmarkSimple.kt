package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorDuotoneIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 48v176L128 184 64 224v-176c0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M184 32h-112C63.163 32 56 39.163 56 48v176c.001 2.907 1.58 5.585 4.124 6.994 2.543 1.409 5.651 1.327 8.116-.214L128 193.43l59.77 37.35c2.465 1.536 5.569 1.615 8.109 .207 2.54-1.408 4.117-4.082 4.121-6.987v-176c0-8.837-7.163-16-16-16ZM184 209.57 132.23 177.22c-2.594-1.621-5.886-1.621-8.48 0L72 209.57v-161.57h112Z"),
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
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
