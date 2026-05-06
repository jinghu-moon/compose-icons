package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorFillIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 112h72v72h-72ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM96 72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-8.837 0-16 7.163-16 16ZM160 112c0-8.837-7.163-16-16-16h-72c-8.837 0-16 7.163-16 16v72c0 8.837 7.163 16 16 16h72c8.837 0 16-7.163 16-16ZM200 128c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 8.837 0 16-7.163 16-16ZM200 72c0-8.837-7.163-16-16-16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
