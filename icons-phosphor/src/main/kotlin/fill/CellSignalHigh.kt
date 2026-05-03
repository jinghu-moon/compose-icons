package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) return _cellSignalHigh!!
        _cellSignalHigh = phosphorFillIcon(
            name = "CellSignalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.120 25.230 C 192.142 22.750 185.258 24.116 180.680 28.690 L 20.680 188.690 C 16.106 193.267 14.739 200.149 17.217 206.127 C 19.695 212.104 25.529 216.001 32.000 216.000 L 192.000 216.000 C 200.837 216.000 208.000 208.837 208.000 200.000 L 208.000 40.000 C 208.011 33.527 204.107 27.691 198.120 25.230 ZM 192.000 200.000 L 168.000 200.000 L 168.000 64.000 L 192.000 40.000 Z"),
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
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null
