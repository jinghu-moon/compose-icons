package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorDuotoneIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 96v112c0 4.418-3.582 8-8 8h-112c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M64 216c0 4.418-3.582 8-8 8h-8c-8.837 0-16-7.163-16-16v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8ZM112 208h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 168c4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8ZM168 192c-4.418 0-8 3.582-8 8v8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c8.837 0 16-7.163 16-16v-8c0-4.418-3.582-8-8-8ZM168 112c4.418 0 8-3.582 8-8v-8c0-8.837-7.163-16-16-16h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v8c0 4.418 3.582 8 8 8ZM56 80h-8C39.163 80 32 87.163 32 96v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM208 32h-112C87.163 32 80 39.163 80 48v40c-.011 .183-.011 .367 0 .55 .29 4.202 3.788 7.46 8 7.45h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-32h112v112h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8h40c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16Z"),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
