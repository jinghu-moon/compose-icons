package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorThinIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36h-40c-6.627 0-12 5.373-12 12v160c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM204 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM96 36h-40C49.373 36 44 41.373 44 48v160c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-160C108 41.373 102.627 36 96 36ZM100 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
