package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorDuotoneIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56v144c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M128 128c.002 2.431-1.102 4.731-3 6.25l-40 32c-3.452 2.761-8.489 2.202-11.25-1.25C70.989 161.548 71.548 156.511 75 153.75L107.19 128 75 102.25C71.548 99.489 70.989 94.452 73.75 91 76.511 87.548 81.548 86.989 85 89.75l40 32c1.898 1.519 3.002 3.819 3 6.25ZM176 152h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM216 200v-144h-176v144h176Z"),
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
