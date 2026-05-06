package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorThinIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 60h-208C17.373 60 12 65.373 12 72v112c0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM236 184c0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h208c2.209 0 4 1.791 4 4ZM124 100v24h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-12v24h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM211.85 97.08l-18 64c-.486 1.724-2.059 2.915-3.85 2.915-1.791 0-3.364-1.191-3.85-2.915l-18-64c-.43-1.389-.071-2.902 .936-3.951 1.007-1.049 2.504-1.469 3.91-1.097 1.406 .372 2.499 1.478 2.854 2.888L190 145.23 204.15 94.92c.64-2.071 2.814-3.255 4.902-2.67 2.088 .586 3.328 2.728 2.798 4.83ZM64 92h-8c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4h8c15.464 0 28-12.536 28-28v-16C92 104.536 79.464 92 64 92ZM84 136c0 11.046-8.954 20-20 20h-4v-56h4c11.046 0 20 8.954 20 20Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
