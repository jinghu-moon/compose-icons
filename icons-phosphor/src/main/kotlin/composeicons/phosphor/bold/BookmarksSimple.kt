package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorBoldIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 56h-96C48.954 56 40 64.954 40 76v152c-.005 4.503 2.511 8.63 6.517 10.687 4.005 2.058 8.826 1.699 12.483-.927l49-35 49 35c3.657 2.627 8.478 2.985 12.483 .927 4.005-2.058 6.522-6.184 6.517-10.687v-152C176 64.954 167.046 56 156 56ZM152 204.68 115 178.23c-4.183-3.004-9.817-3.004-14 0L64 204.68v-124.68h88ZM216 36v152c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-148h-100C85.373 40 80 34.627 80 28 80 21.373 85.373 16 92 16h104c11.046 0 20 8.954 20 20Z"),
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
