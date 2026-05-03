package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorBoldIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 47.510 112.490 C 42.816 107.796 42.816 100.184 47.510 95.490 C 52.204 90.796 59.816 90.796 64.510 95.490 L 116.000 147.000 L 116.000 32.000 C 116.000 25.373 121.373 20.000 128.000 20.000 C 134.627 20.000 140.000 25.373 140.000 32.000 L 140.000 147.000 L 191.510 95.480 C 196.204 90.786 203.816 90.786 208.510 95.480 C 213.204 100.174 213.204 107.786 208.510 112.480 L 136.510 184.480 C 134.258 186.739 131.200 188.009 128.010 188.009 C 124.820 188.009 121.762 186.739 119.510 184.480 ZM 216.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 209.373 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 C 228.000 209.373 222.627 204.000 216.000 204.000 Z"),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
