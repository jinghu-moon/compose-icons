package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorThinIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM48 44h160c2.209 0 4 1.791 4 4v108h-32.69c-3.182-.008-6.234 1.256-8.48 3.51l-19.32 19.32c-.748 .748-1.762 1.168-2.82 1.17h-41.38c-1.058-.002-2.072-.422-2.82-1.17L85.17 159.52C82.928 157.26 79.874 155.992 76.69 156h-32.69v-108c0-2.209 1.791-4 4-4ZM208 212h-160c-2.209 0-4-1.791-4-4v-44h32.69c1.058 .002 2.072 .422 2.82 1.17l19.32 19.31c2.242 2.26 5.296 3.528 8.48 3.52h41.38c3.182 .008 6.234-1.256 8.48-3.51l19.32-19.32c.748-.748 1.762-1.168 2.82-1.17h32.69v44c0 2.209-1.791 4-4 4ZM93.17 106.83c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l32 32c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L132 81.66v70.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-70.34L98.83 106.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
