package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorThinIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122.5 124.88c.946 .759 1.497 1.907 1.497 3.12 0 1.213-.551 2.361-1.497 3.12l-40 32c-1.727 1.298-4.173 .989-5.524-.697-1.351-1.686-1.119-4.14 .524-5.543L113.6 128 77.5 99.12c-1.643-1.403-1.875-3.857-.524-5.543 1.351-1.686 3.797-1.995 5.524-.697ZM176 156h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 56v144c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-144C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12ZM220 56c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4Z"),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
