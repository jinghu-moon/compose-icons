package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorThinIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 48.000 L 228.000 88.000 C 228.000 90.209 226.209 92.000 224.000 92.000 C 221.791 92.000 220.000 90.209 220.000 88.000 L 220.000 52.000 L 184.000 52.000 C 181.791 52.000 180.000 50.209 180.000 48.000 C 180.000 45.791 181.791 44.000 184.000 44.000 L 224.000 44.000 C 226.209 44.000 228.000 45.791 228.000 48.000 ZM 72.000 204.000 L 36.000 204.000 L 36.000 168.000 C 36.000 165.791 34.209 164.000 32.000 164.000 C 29.791 164.000 28.000 165.791 28.000 168.000 L 28.000 208.000 C 28.000 210.209 29.791 212.000 32.000 212.000 L 72.000 212.000 C 74.209 212.000 76.000 210.209 76.000 208.000 C 76.000 205.791 74.209 204.000 72.000 204.000 ZM 224.000 164.000 C 221.791 164.000 220.000 165.791 220.000 168.000 L 220.000 204.000 L 184.000 204.000 C 181.791 204.000 180.000 205.791 180.000 208.000 C 180.000 210.209 181.791 212.000 184.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 L 228.000 168.000 C 228.000 165.791 226.209 164.000 224.000 164.000 ZM 32.000 92.000 C 34.209 92.000 36.000 90.209 36.000 88.000 L 36.000 52.000 L 72.000 52.000 C 74.209 52.000 76.000 50.209 76.000 48.000 C 76.000 45.791 74.209 44.000 72.000 44.000 L 32.000 44.000 C 29.791 44.000 28.000 45.791 28.000 48.000 L 28.000 88.000 C 28.000 90.209 29.791 92.000 32.000 92.000 ZM 186.000 163.470 L 130.000 195.470 C 128.762 196.185 127.238 196.185 126.000 195.470 L 70.000 163.470 C 68.761 162.754 67.998 161.431 68.000 160.000 L 68.000 96.000 C 67.998 94.569 68.761 93.246 70.000 92.530 L 126.000 60.530 C 127.238 59.815 128.762 59.815 130.000 60.530 L 186.000 92.530 C 187.239 93.246 188.002 94.569 188.000 96.000 L 188.000 160.000 C 188.002 161.431 187.239 162.754 186.000 163.470 ZM 80.060 96.000 L 128.000 123.390 L 175.940 96.000 L 128.000 68.610 ZM 76.000 157.680 L 124.000 185.110 L 124.000 130.320 L 76.000 102.890 ZM 180.000 157.680 L 180.000 102.890 L 132.000 130.320 L 132.000 185.110 Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
