package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorDuotoneIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.120 25.230 C 192.143 22.757 185.264 24.126 180.690 28.700 L 20.690 188.700 C 16.124 193.277 14.761 200.151 17.236 206.124 C 19.710 212.096 25.535 215.993 32.000 216.000 L 192.000 216.000 C 200.837 216.000 208.000 208.837 208.000 200.000 L 208.000 40.000 C 207.995 33.532 204.096 27.704 198.120 25.230 ZM 192.000 200.000 L 32.000 200.000 L 192.000 40.000 Z"),
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
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
