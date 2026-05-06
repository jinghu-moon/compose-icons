package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorThinIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 80c0-2.209 1.791-4 4-4h72c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-72c-2.209 0-4-1.791-4-4ZM240 172h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM240 108h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM240 140h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM140 64v128c0 6.627-5.373 12-12 12h-40c-20.257 .001-39.677-8.086-53.946-22.465C19.784 167.157 11.845 147.677 12 127.42 12.31 85.83 46.81 52 88.9 52h39.1c6.627 0 12 5.373 12 12ZM132 64c0-2.209-1.791-4-4-4h-39.1C51.19 60 20.28 90.27 20 127.48c-.139 18.125 6.964 35.555 19.732 48.42C52.499 188.765 69.875 196.001 88 196h40c2.209 0 4-1.791 4-4Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
