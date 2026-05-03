package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorLightIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 192.000 C 238.000 195.314 235.314 198.000 232.000 198.000 L 198.000 198.000 L 198.000 232.000 C 198.000 235.314 195.314 238.000 192.000 238.000 C 188.686 238.000 186.000 235.314 186.000 232.000 L 186.000 198.000 L 64.000 198.000 C 60.686 198.000 58.000 195.314 58.000 192.000 L 58.000 70.000 L 24.000 70.000 C 20.686 70.000 18.000 67.314 18.000 64.000 C 18.000 60.686 20.686 58.000 24.000 58.000 L 58.000 58.000 L 58.000 24.000 C 58.000 20.686 60.686 18.000 64.000 18.000 C 67.314 18.000 70.000 20.686 70.000 24.000 L 70.000 186.000 L 232.000 186.000 C 235.314 186.000 238.000 188.686 238.000 192.000 ZM 96.000 70.000 L 186.000 70.000 L 186.000 160.000 C 186.000 163.314 188.686 166.000 192.000 166.000 C 195.314 166.000 198.000 163.314 198.000 160.000 L 198.000 64.000 C 198.000 60.686 195.314 58.000 192.000 58.000 L 96.000 58.000 C 92.686 58.000 90.000 60.686 90.000 64.000 C 90.000 67.314 92.686 70.000 96.000 70.000 Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
