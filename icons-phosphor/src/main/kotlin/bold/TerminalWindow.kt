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
                pathData = parseSvgPathData("M 72.500 150.630 L 100.790 128.000 L 72.500 105.370 C 67.325 101.228 66.488 93.675 70.630 88.500 C 74.772 83.325 82.325 82.488 87.500 86.630 L 127.500 118.630 C 130.346 120.907 132.003 124.355 132.003 128.000 C 132.003 131.645 130.346 135.093 127.500 137.370 L 87.500 169.370 C 82.325 173.512 74.772 172.675 70.630 167.500 C 66.488 162.325 67.325 154.772 72.500 150.630 ZM 144.000 172.000 L 176.000 172.000 C 182.627 172.000 188.000 166.627 188.000 160.000 C 188.000 153.373 182.627 148.000 176.000 148.000 L 144.000 148.000 C 137.373 148.000 132.000 153.373 132.000 160.000 C 132.000 166.627 137.373 172.000 144.000 172.000 ZM 236.000 56.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 196.000 L 212.000 196.000 Z"),
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
