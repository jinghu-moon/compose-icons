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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 122.500 124.880 C 123.446 125.639 123.997 126.787 123.997 128.000 C 123.997 129.213 123.446 130.361 122.500 131.120 L 82.500 163.120 C 80.773 164.418 78.327 164.109 76.976 162.423 C 75.625 160.737 75.857 158.283 77.500 156.880 L 113.600 128.000 L 77.500 99.120 C 75.857 97.717 75.625 95.263 76.976 93.577 C 78.327 91.891 80.773 91.582 82.500 92.880 ZM 176.000 156.000 L 136.000 156.000 C 133.791 156.000 132.000 157.791 132.000 160.000 C 132.000 162.209 133.791 164.000 136.000 164.000 L 176.000 164.000 C 178.209 164.000 180.000 162.209 180.000 160.000 C 180.000 157.791 178.209 156.000 176.000 156.000 ZM 228.000 56.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
