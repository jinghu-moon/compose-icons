package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorThinIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 108h-28v-56h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28.7C201.607 39.21 197.08 36.006 192 36h-16c-5.08 .006-9.607 3.21-11.3 8h-20.7C88.797 44.061 44.061 88.797 44 144v20.7c-4.79 1.693-7.994 6.22-8 11.3v16c.006 5.08 3.21 9.607 8 11.3v28.7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h56v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28.7c4.79-1.693 7.994-6.22 8-11.3v-16c-.006-5.08-3.21-9.607-8-11.3v-20.7c0-15.464 12.536-28 28-28h20.7c1.693 4.79 6.22 7.994 11.3 8h16c5.08-.006 9.607-3.21 11.3-8h28.7c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM116 192c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-16c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM108 144v20h-56v-20C52.055 93.213 93.213 52.055 144 52h20v56h-20c-19.882 0-36 16.118-36 36ZM192 116h-16c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4v64c0 2.209-1.791 4-4 4Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
