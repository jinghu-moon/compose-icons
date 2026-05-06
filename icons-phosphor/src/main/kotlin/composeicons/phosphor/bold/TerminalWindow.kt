package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorBoldIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72.5 150.63 100.79 128 72.5 105.37C67.325 101.228 66.488 93.675 70.63 88.5c4.142-5.175 11.695-6.012 16.87-1.87l40 32c2.846 2.277 4.503 5.725 4.503 9.37 0 3.645-1.657 7.093-4.503 9.37l-40 32c-5.175 4.142-12.728 3.305-16.87-1.87-4.142-5.175-3.305-12.728 1.87-16.87ZM144 172h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM236 56v144c0 11.046-8.954 20-20 20h-176C28.954 220 20 211.046 20 200v-144C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM212 60h-168v136h168Z"),
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
