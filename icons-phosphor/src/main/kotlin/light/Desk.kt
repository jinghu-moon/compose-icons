package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorLightIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 66.000 L 8.000 66.000 C 4.686 66.000 2.000 68.686 2.000 72.000 C 2.000 75.314 4.686 78.000 8.000 78.000 L 18.000 78.000 L 18.000 192.000 C 18.000 195.314 20.686 198.000 24.000 198.000 C 27.314 198.000 30.000 195.314 30.000 192.000 L 30.000 142.000 L 226.000 142.000 L 226.000 192.000 C 226.000 195.314 228.686 198.000 232.000 198.000 C 235.314 198.000 238.000 195.314 238.000 192.000 L 238.000 78.000 L 248.000 78.000 C 251.314 78.000 254.000 75.314 254.000 72.000 C 254.000 68.686 251.314 66.000 248.000 66.000 ZM 30.000 78.000 L 122.000 78.000 L 122.000 130.000 L 30.000 130.000 ZM 226.000 130.000 L 134.000 130.000 L 134.000 78.000 L 226.000 78.000 ZM 94.000 104.000 C 94.000 107.314 91.314 110.000 88.000 110.000 L 64.000 110.000 C 60.686 110.000 58.000 107.314 58.000 104.000 C 58.000 100.686 60.686 98.000 64.000 98.000 L 88.000 98.000 C 91.314 98.000 94.000 100.686 94.000 104.000 ZM 162.000 104.000 C 162.000 100.686 164.686 98.000 168.000 98.000 L 192.000 98.000 C 195.314 98.000 198.000 100.686 198.000 104.000 C 198.000 107.314 195.314 110.000 192.000 110.000 L 168.000 110.000 C 164.686 110.000 162.000 107.314 162.000 104.000 Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
