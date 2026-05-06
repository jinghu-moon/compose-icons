package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorRegularIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 128c0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8ZM48 72h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-56c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM184 184h-136c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h136c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM229.66 82.34l-40-40C188.159 40.838 186.123 39.994 184 39.994c-2.123 0-4.159 .844-5.66 2.346l-40 40c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L176 67.31v76.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-76.69l26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
