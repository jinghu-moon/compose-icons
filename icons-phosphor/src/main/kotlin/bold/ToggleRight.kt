package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorBoldIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 52.000 L 80.000 52.000 C 38.026 52.000 4.000 86.026 4.000 128.000 C 4.000 169.974 38.026 204.000 80.000 204.000 L 176.000 204.000 C 217.974 204.000 252.000 169.974 252.000 128.000 C 252.000 86.026 217.974 52.000 176.000 52.000 ZM 176.000 180.000 L 80.000 180.000 C 51.281 180.000 28.000 156.719 28.000 128.000 C 28.000 99.281 51.281 76.000 80.000 76.000 L 176.000 76.000 C 204.719 76.000 228.000 99.281 228.000 128.000 C 228.000 156.719 204.719 180.000 176.000 180.000 ZM 176.000 88.000 C 153.909 88.000 136.000 105.909 136.000 128.000 C 136.000 150.091 153.909 168.000 176.000 168.000 C 198.091 168.000 216.000 150.091 216.000 128.000 C 216.000 105.909 198.091 88.000 176.000 88.000 ZM 176.000 144.000 C 167.163 144.000 160.000 136.837 160.000 128.000 C 160.000 119.163 167.163 112.000 176.000 112.000 C 184.837 112.000 192.000 119.163 192.000 128.000 C 192.000 136.837 184.837 144.000 176.000 144.000 Z"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
