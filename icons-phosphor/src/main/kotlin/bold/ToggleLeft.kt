package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorBoldIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 52.000 L 80.000 52.000 C 38.026 52.000 4.000 86.026 4.000 128.000 C 4.000 169.974 38.026 204.000 80.000 204.000 L 176.000 204.000 C 217.974 204.000 252.000 169.974 252.000 128.000 C 252.000 86.026 217.974 52.000 176.000 52.000 ZM 176.000 180.000 L 80.000 180.000 C 51.281 180.000 28.000 156.719 28.000 128.000 C 28.000 99.281 51.281 76.000 80.000 76.000 L 176.000 76.000 C 204.719 76.000 228.000 99.281 228.000 128.000 C 228.000 156.719 204.719 180.000 176.000 180.000 ZM 80.000 88.000 C 57.909 88.000 40.000 105.909 40.000 128.000 C 40.000 150.091 57.909 168.000 80.000 168.000 C 102.091 168.000 120.000 150.091 120.000 128.000 C 120.000 105.909 102.091 88.000 80.000 88.000 ZM 80.000 144.000 C 71.163 144.000 64.000 136.837 64.000 128.000 C 64.000 119.163 71.163 112.000 80.000 112.000 C 88.837 112.000 96.000 119.163 96.000 128.000 C 96.000 136.837 88.837 144.000 80.000 144.000 Z"),
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
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
