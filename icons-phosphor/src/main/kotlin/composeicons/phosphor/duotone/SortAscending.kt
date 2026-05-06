package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorDuotoneIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 80v88l-24 24h-152v-128h160c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M128 128c0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8ZM48 72h136c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-136c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM104 184h-56c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM229.66 162.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L192 188.69v-76.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v76.69L149.66 162.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l40 40c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
