package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorBoldIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 79.510 144.490 C 74.816 139.796 74.816 132.184 79.510 127.490 C 84.204 122.796 91.816 122.796 96.510 127.490 L 112.000 143.000 L 159.510 95.480 C 164.204 90.786 171.816 90.786 176.510 95.480 C 181.204 100.174 181.204 107.786 176.510 112.480 L 120.510 168.480 C 118.258 170.739 115.200 172.009 112.010 172.009 C 108.820 172.009 105.762 170.739 103.510 168.480 ZM 228.000 48.000 L 228.000 208.000 C 228.000 219.046 219.046 228.000 208.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 48.000 C 28.000 36.954 36.954 28.000 48.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 204.000 52.000 L 52.000 52.000 L 52.000 204.000 L 204.000 204.000 Z"),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
