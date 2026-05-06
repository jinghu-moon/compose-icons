package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorThinIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 124h-12.09C217.774 76.362 179.638 38.226 132 36.09v-12.09c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12.09C76.362 38.226 38.226 76.362 36.09 124h-12.09c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12.09c2.136 47.638 40.272 85.774 87.91 87.91v12.09c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12.09c47.638-2.136 85.774-40.272 87.91-87.91h12.09c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM132 211.9v-11.9c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v11.9C80.778 209.786 46.214 175.222 44.1 132h11.9c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-11.9C46.214 80.778 80.778 46.214 124 44.1v11.9c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-11.9c43.222 2.114 77.786 36.678 79.9 79.9h-11.9c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h11.9c-2.114 43.222-36.678 77.786-79.9 79.9ZM128 92c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C164 108.118 147.882 92 128 92ZM128 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
