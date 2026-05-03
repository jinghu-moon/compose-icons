package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorBoldIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 39.510 80.490 C 34.816 75.796 34.816 68.184 39.510 63.490 C 44.204 58.796 51.816 58.796 56.510 63.490 L 128.000 135.000 L 199.510 63.480 C 204.204 58.786 211.816 58.786 216.510 63.480 C 221.204 68.174 221.204 75.786 216.510 80.480 L 136.510 160.480 C 134.258 162.739 131.200 164.009 128.010 164.009 C 124.820 164.009 121.762 162.739 119.510 160.480 ZM 208.000 180.000 L 48.000 180.000 C 41.373 180.000 36.000 185.373 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 208.000 204.000 C 214.627 204.000 220.000 198.627 220.000 192.000 C 220.000 185.373 214.627 180.000 208.000 180.000 Z"),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
