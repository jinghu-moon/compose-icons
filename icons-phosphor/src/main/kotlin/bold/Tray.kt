package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorBoldIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 52.000 L 204.000 144.000 L 179.310 144.000 C 174.003 143.986 168.911 146.096 165.170 149.860 L 147.000 168.000 L 109.000 168.000 L 90.830 149.860 C 87.089 146.096 81.997 143.986 76.690 144.000 L 52.000 144.000 L 52.000 52.000 ZM 52.000 204.000 L 52.000 168.000 L 75.000 168.000 L 93.140 186.140 C 96.888 189.912 101.993 192.022 107.310 192.000 L 148.690 192.000 C 153.997 192.014 159.089 189.904 162.830 186.140 L 181.000 168.000 L 204.000 168.000 L 204.000 204.000 Z"),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
