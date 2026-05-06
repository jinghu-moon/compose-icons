package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorBoldIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 28h-112C60.954 28 52 36.954 52 48v176c-.001 4.363 2.365 8.383 6.181 10.499 3.816 2.116 8.479 1.994 12.179-.319l57.63-36 57.65 36c3.7 2.312 8.363 2.434 12.179 .319 3.816-2.116 6.182-6.136 6.181-10.499v-176C204 36.954 195.046 28 184 28ZM180 202.35 134.35 173.82c-3.891-2.432-8.829-2.432-12.72 0L76 202.35v-150.35h104Z"),
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
