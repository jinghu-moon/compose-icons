package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionPlus: ImageVector
    get() {
        if (_selectionPlus != null) return _selectionPlus!!
        _selectionPlus = phosphorFillIcon(
            name = "SelectionPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM56 72C56 63.163 63.163 56 72 56h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM112 184h-40c-8.837 0-16-7.163-16-16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM128 64c0-4.418 3.582-8 8-8h32c8.837 0 16 7.163 16 16v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-32c-4.418 0-8-3.582-8-8ZM200 184h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _selectionPlus!!
    }

private var _selectionPlus: ImageVector? = null
